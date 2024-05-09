package com.example;

public class Bevitore extends Thread{
    private Botte b;
    private boolean running;

    public Bevitore(String nome, Botte b) {
        super(nome);
        this.b = b;
        running=true;
    }
    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public void arresta(){
        running = false;
    }

    public void run(){
            int t = b.bevi(this);
            try {
                Thread.sleep(t);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            b.esci();
            
    }
    
}
