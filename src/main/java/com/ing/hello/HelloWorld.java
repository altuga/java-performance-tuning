package com.ing.hello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld {

    public static void main(String[] args) throws IOException {
        System.out.println(" Hello World");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.read();
    }
}
