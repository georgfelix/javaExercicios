package com.java;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestExceptionThrows {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\nota.txt");
		
		PrintWriter print = new PrintWriter(fw);
		print.println("Maca = R$4,00");
		print.println("Morango = R$6,50");
		print.println("Total = R$10,50");
		print.close();
		fw.close();
		}

}
