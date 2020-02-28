package com.github.jv_martins.programacao;

public class Desafio1 {
	public int num;
    public String resultadopar = "o numero é par";
    public String resultadoinpar = " o numero é impar";

    public Desafio1(int num) {
        this.num = num;
    }
    
    
    public void valida(){
        if (this.num %2 == 0) {
            System.out.println(resultadopar);
        }else{
            System.out.println(resultadoinpar);
        }
    }
}
