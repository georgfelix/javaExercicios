package com.udemy.java;

import java.util.Locale;

public class SaidaDados {
	
	public static void main(String[] args) {
	
		int y = 32;
		double x = 10.3543;
		
		
				
		System.out.println("Olá Mundo!");
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		System.out.println("Resultado: " + x +  " metros");
		System.out.printf("Resultado: %.2f metros %n", x);
		System.out.printf("1o Resultado: %.2f metros e 2o Resultado: %.4f metros  %n", x, x);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		// %f = ponto flutuante
		// %d = inteiro
		// %s = texto
		// %n quebra de linha
		
		String product1 = "Computer";
		String product2  = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'f';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products:%n %s, which price is $ %.2f %n ", product1, price1);
		System.out.printf("%s, which price is $ %.2f %n ", product2, price2);
		
		System.out.printf("Record: %d years old, code %d and gender: %s %n ", age, code, gender);
		
		System.out.printf("Measure with eigth decimal places:  %.8f %n ", measure);
		System.out.printf("Rouded (three decimal places):  %.3f %n ", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f %n ", measure);
	}
}
 