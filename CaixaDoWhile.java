package com.java;

public class CaixaDoWhile {
	
	public static void main(String[] args) {
		
		int qtdProdutos = 5;
		int registro = 0;
		int numero = 0;
		float[] valores = new float[5];
		
		valores[0] = 10;
		valores[1] = 20;
		valores[2] = 30;
		valores[3] = 40;
		valores[4] = 50;
		
		System.out.println(valores[1]);
		System.out.println(valores[4]);
		
		do {	
			registro++;
			System.out.println("O Caixa regfistrou o produto" + registro);
			} while (registro < qtdProdutos);	
			
		
		do {
			numero = numero + 1;System.out.println(numero);
			} while (numero < 10);
			
			
		}
	

	}
