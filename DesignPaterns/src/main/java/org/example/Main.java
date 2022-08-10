package org.example;

import org.example.singleton.SingleTonDp;

public class Main {
    public static void main(String[] args) {
        SingleTonDp singleTonDp = SingleTonDp.getInstance();
        SingleTonDp singleTonDp1 = SingleTonDp.getInstance();
        System.out.println(singleTonDp.hashCode());
        System.out.println(singleTonDp1.hashCode());

        System.out.println("Hello world!");
    }
}