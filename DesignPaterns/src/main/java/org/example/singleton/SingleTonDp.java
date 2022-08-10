package org.example.singleton;

public class SingleTonDp {
    private static SingleTonDp singleTonDp;

    private SingleTonDp(){

    }

    public static SingleTonDp getInstance(){
        if (singleTonDp==null) {
            singleTonDp = new SingleTonDp();

        }
        return singleTonDp;
    }
}
