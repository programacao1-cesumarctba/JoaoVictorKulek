package com.github.jv_martins.programacao;


public class Desafio3 {
    int n;

    public Desafio3 (int n){
        this.n = n;
    }

    public void Fatorial (){
        int i = n -1;
        while (i>0){
            n = n * i;
            i--;
        }
    }

    public void imprimeFatorial (){
        System.out.println (n);
    }

}