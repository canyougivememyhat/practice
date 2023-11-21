package com.ivanzou.springbootmall;

public class Calculator {

    public int add(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);
        System.out.println(result);
    }
}
