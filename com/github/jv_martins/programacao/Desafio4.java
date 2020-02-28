package com.github.jv_martins.programacao;

public class Desafio4 {
    int n;

    public Desafio4(int n) {
        this.n = n;
    }

    public void tabuada(){
        int i = 0;
        while (i <= 10){
            System.out.println(n + "x" + i +"=" +(n*i));
            i++;
        }
    }

}