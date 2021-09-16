package com.java;

public class CaixaDoWhile {
	
	public static void main(String[] args) {
		
		int qtdProdutos = 5;
		int registro = 0;
		int numero = 0;
			
		do {	
			registro++;
			System.out.println("O Caixa regfistrou o produto" + registro);
			} while (registro < qtdProdutos);	
			
		
		do {
			numero = numero + 1;System.out.println(numero);
			} while (numero < 10);
			
			
		}
	}
