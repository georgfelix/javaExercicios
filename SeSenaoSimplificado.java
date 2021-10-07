package com.udemy.java;

import java.util.Scanner;

public class SeSenaoSimplificado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor para saber quanto vai ter de desconto: ");

		double preco = sc.nextDouble();
// esta linha abaixo...
		double desconto = (preco>20) ? preco * 0.1 : preco * 0.05;
// ... substitui tudo isso:
		
//		double desconto;
//
//		if (preco > 20) {
//			desconto = preco*0.1;
//		}
//		else {
//			desconto = preco * 0.05;
//		}
		System.out.printf("O valor do desconto é: R$%.2f %n", desconto);

		sc.close();
	}

}
