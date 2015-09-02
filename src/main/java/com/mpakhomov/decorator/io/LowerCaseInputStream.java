package com.mpakhomov.decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * {@link LowerCaseInputStream} decorates {@link InputStream} and converts all input characters to lower case.
 *
 * @author mpakhomov
 * @since 9/2/2015
 */
public class LowerCaseInputStream extends InputStream {

    // decorator HAS-A component. InputStream is a component
    private final InputStream inputStream;

    public LowerCaseInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    // a convenient constructor
    public LowerCaseInputStream(String fileName) throws FileNotFoundException {
        inputStream = new BufferedInputStream(
                         new FileInputStream(fileName)
        );
    }

    @Override
    public int read() throws IOException {
        int c = inputStream.read();
        return (c == -1 ? c : Character.toLowerCase((char)c));
    }
}
