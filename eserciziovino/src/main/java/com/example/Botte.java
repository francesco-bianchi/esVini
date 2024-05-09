package com.example;
public class Botte {
    private int nRubLiberi=3;
    private int quantBotte = 100;


    public synchronized int bevi(Bevitore b){
        String nome = Thread.currentThread().getName();

        while(nRubLiberi==0){
            try {
                //System.out.println(nome + " sta aspettando");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        nRubLiberi--;
        int num = (int) (Math.random() * 3 + 1);
        int tempo= (int) (2000 + Math.random() * 2000);
        quantBotte= quantBotte-num;
        System.out.println(nome+" beve: "+ num +"l" + " per " + tempo/1000 + " sec");
        
        
        return tempo;
    }

    public synchronized void esci(){
        String nome = Thread.currentThread().getName();
        nRubLiberi++;
        System.out.println(nome+ " smette di bere");
        notifyAll();
    }
}
