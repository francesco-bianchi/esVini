package com.example;

public class Main {
    public static void main(String[] args) {
        Botte b = new Botte();
        for(int i=0;i<10;i++){
            Bevitore bev = new Bevitore("Bevitore" + i, b);
            bev.start();
        }
    }
}