package com.mpakhomov.visitor.tree;

/**
 * this is an example from O'Reilly Java Generics and Collections
 */
public abstract class Tree<E> {

    public interface Visitor<E, R> {
        public R visitLeaf(E elt);
        public R visitBranch(R left, R right);
    }

    public abstract <R> R accept(Visitor<E, R> v);

    public static <T> Tree<T> leaf(final T e) {
        return new Tree<T>() {
            public <R> R accept(Visitor<T, R> v) {
                return v.visitLeaf(e);
            }
        };
    }

    public static <T> Tree<T> branch(final Tree<T> l, final Tree<T> r) {
        return new Tree<T>() {
            public <R> R accept(Visitor<T, R> v) {
                return v.visitBranch(l.accept(v), r.accept(v));
            }
        };
    }
}

class TreeClient {
    public static <T> String toString(Tree<T> t) {
        return t.accept(new Tree.Visitor<T, String>() {
            @Override
            public String visitLeaf(T e) {
                return e.toString();
            }

            @Override
            public String visitBranch(String l, String r) {
                return "(" + l + "^" + r + ")";
            }
        });
    }

    public static <N extends Number> double sum(Tree<N> t) {
        return t.accept(new Tree.Visitor<N, Double>() {
            public Double visitLeaf(N e) {
                return e.doubleValue();
            }

            public Double visitBranch(Double l, Double r) {
                return l + r;
            }
        });
    }

    public static void main(String[] args) {
        Tree<Integer> t =
                Tree.branch(Tree.branch(
                                Tree.leaf(1),
                                Tree.leaf(2)),
                            Tree.branch(
                                Tree.leaf(3),
                                Tree.branch(
                                        Tree.leaf(5),
                                        Tree.leaf(6))));
        System.out.println(toString(t));
        System.out.println(sum(t));
    }
}
