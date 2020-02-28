package chamada;

import java.util.Scanner;

import com.github.jv_martins.programacao.Desafio1;
import com.github.jv_martins.programacao.Desafio2;
import com.github.jv_martins.programacao.Desafio3;
import com.github.jv_martins.programacao.Desafio4;

public class Main {

	public static void main(String[] args) {
		
		//Exercicio 1
		Scanner teclado = new Scanner(System.in);
		System.out.println("DIGITE UM NUMERO!");
		Desafio1 atvd = new Desafio1(teclado.nextInt());
		atvd.valida();
		
		//Exercicio 2 
		
		Scanner teclado2 = new Scanner(System.in);
		System.out.println("DIGITE UM NUMERO!");
		Desafio2 atvd2 = new Desafio2(teclado2.nextInt());
		atvd2.Condicao();
		
		//Exercicio 3
		
		Scanner teclado3 = new Scanner(System.in);
		System.out.println("DIGITE UM NUMERO!");
		Desafio3 atvd3 = new Desafio3(teclado3.nextInt());
		atvd3.Fatorial();
		atvd3.imprimeFatorial();
		
		//Exercico 4 
		
		Scanner teclado4 = new Scanner(System.in);
		System.out.println("DIGITE UM NUMERO!");
		Desafio4 atvd4 = new Desafio4(teclado4.nextInt());
		atvd4.tabuada();
	}

}
