package com.mpakhomov.decorator.io;

import java.io.*;

public class InputTest {

    public static void main(String[] args) throws IOException {
        int c;
        InputStream in = new LowerCaseInputStream(
                new BufferedInputStream(
                        new FileInputStream(
                                "C:\\Prg\\Java\\Design.Patterns\\designpatterns\\src\\main\\java\\com\\mpakhomov\\decorator\\io\\foo.txt ")
                )
        );
        while ((c = in.read()) >= 0) {
            System.out.print((char)c);
        }
    }
}
