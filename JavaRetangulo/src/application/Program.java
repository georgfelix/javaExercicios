package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		Retangulo retangulo = new Retangulo ();
		
		System.out.println("Enter rectangle width and Height: ");
		
		System.out.print("Width: ");
		
		retangulo.width = sc.nextDouble();
		
		System.out.print("Height: ");
		
		retangulo.height = sc.nextDouble();
		
		System.out.println("Area: "+ retangulo.area());
		System.out.println("Perimeter: "+ retangulo.perimeter());
		System.out.println("Diagonal: "+ retangulo.diagonal());
		
		sc.close();

	}

}