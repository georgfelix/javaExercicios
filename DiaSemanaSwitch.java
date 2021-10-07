package com.udemy.java;

import java.util.Scanner;

public class DiaSemanaSwitch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 1 para SEG, 2 TER, 3 QUA, etc: ");
		
		int x = sc.nextInt();
		String dia;
		
		switch (x)  {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terca";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
			default:
				dia = "valor inválido";
				break;	
		}
		System.out.println("Dia da semana é " + dia);
		
		sc.close();
	}

}
