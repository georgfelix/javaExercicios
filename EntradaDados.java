package com.udemy.java;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String x, s1, s2, s3;
		int z;
		double v;

		x = sc.next();
		z = sc.nextInt();
		v = sc.nextDouble();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("Voce digitou: ");
		System.out.println(x);
		System.out.println(z);
		System.out.println(v);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();

		// Command shift F faz a intentacao
	}
}
