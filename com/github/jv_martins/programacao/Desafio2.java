package com.github.jv_martins.programacao;

public class Desafio2 {
	public int n;

	public Desafio2(int n) {
		this.n = n;
	}
	
	public void Condicao(){
        if(this.n %2 == 0){
            if(this.n < 10){
                System.out.println("Não é estranho");
            }else if(this.n >= 10 && this.n <=20){
                System.out.println("Estranho");
            }else if(this.n > 20){
                System.out.println("Não é estranho");
            }
        }else{
            System.out.println("Estranho pq é impar");
        }
    }
	
}
