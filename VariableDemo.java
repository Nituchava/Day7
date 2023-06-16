// demo of variabe, method and block

package com.Programjava;

public class VariableDemo {
    public static void main(String[] args) {

        method(50);

    }
    static int a = 7;
    static int b;

    static void method(int c) {
        System.out.println("c = " + c);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("Static block ");
        b = a + 4;
    }

}
