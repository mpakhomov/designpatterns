package com.mpakhomov.observer;

/**
 * @author mpakhomov
 * @since 8/30/15
 */
public class App {

    private static class Observer3 implements Observer<String> {

        @Override
        public void notify(Subject<String> subject, String data) {
            System.out.println("observer3, data: " + extractData(subject, data));
        }
    }


    public static <E> E extractData(Subject<E> subject, E data) {
        if (data != null) {
            // push notification
            return data;
        } else {
            // pull notification
            return subject.getData();
        }
    }

    public static void main(String[] args) {
        GenericSubject<String> stringSubject = new GenericSubject<>();

        GenericObserver<String> observer1 = new GenericObserver<>(stringSubject,
                (subject, data) -> System.out.println("observer1, data: " + extractData(subject, data)));

        GenericObserver<String> observer2 = new GenericObserver<>(stringSubject,
                (subject, data) -> System.out.println("observer2, data: " + extractData(subject, data)));

        stringSubject.addObserver(new Observer3());


        stringSubject.pushNotify("Push notification");
        System.out.println("\n");

        stringSubject.setData("Pull notification");
        stringSubject.pullNotify();
        System.out.println("\n");

        stringSubject.removeObserver(observer2);
        stringSubject.pullNotify();
    }

}
