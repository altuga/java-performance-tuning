package com.ing.jit;


public interface Formatter {

    <T> String format(T object) throws Exception;

}