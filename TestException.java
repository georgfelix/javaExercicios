package com.java;

public class TestException {
	
	public static void main(String[] args)  {
		try {
			//trecho onde a excessao pode ocorrer
			int val = 10/0;
			
			int [] valores = new int[3];
			System.out.println(valores[4]);
			
			String nome = null;
			System.out.println(nome.length());
			
			int numero = Integer.parseInt("zero");
			
			
		}	catch (ArithmeticException e) { // captura da excecao
			
			// tratamenbto da excepcao
			System.out.println("Nao é possivel realizar uma divisao pr zero");
			//mensagem com a lista de erros
			System.out.println(e.getMessage());
			//imprime a pilha de erro da excecao
			e.printStackTrace();
			
		}	catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Nao é possivel acessar a posicao 4 do array");
			
		}	catch (NullPointerException e) {
			
			System.out.println("Nao foi poss'ível retornar o lenth, variavel nome nao instanciada!");
			
		}	catch (NumberFormatException e) {
			
			System.out.println("Nao foi possivel realizar a conversao");
			
		}	catch (Exception e) {
			
			System.out.println("Erro na execucao do programa");
		}	finally {
				System.out.println("Sempre passará por aqui");
		}
		}
	}


