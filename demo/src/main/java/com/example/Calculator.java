package com.example;

public class Calculator {
    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("割る数に0は使えません。");
        }
        return dividend / divisor;
    }
}
