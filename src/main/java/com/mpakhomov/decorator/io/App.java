package com.mpakhomov.decorator.io;

import java.io.*;

public class App {

    public static void main(String[] args) throws IOException {
        // decorate, decorate, decorate :-)
        try (InputStream in =
                new LowerCaseInputStream(
                    new BufferedInputStream(
                        new FileInputStream(
                            "src\\main\\java\\com\\mpakhomov\\decorator\\io\\foo.txt"
                        )))) {

            int c;
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        }

        System.out.println();

        try (InputStream in =
                     new LowerCaseFilterInputStream(
                             new BufferedInputStream(
                                     new FileInputStream(
                                             "src\\main\\java\\com\\mpakhomov\\decorator\\io\\foo.txt"
                                     )))) {

            int c;
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        }
    }
}
