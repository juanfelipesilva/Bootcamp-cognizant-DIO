package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		double soma = soma(a, b);
		double subtra��o = subtra��o(a, b);
		double multiplica��o = multiplica��o(a, b);
		double divis�o = divis�o(a, b);
		
		System.out.println("soma " + soma);
		System.out.println("sub " + subtra��o);
		System.out.println("multi " + multiplica��o);
		System.out.println("div " + divis�o);
		
	}

	public static double soma(double a, double b) {
		return a + b;
	}
	
	public static double subtra��o(double a, double b) {
		return a - b;
	}
	public static double divis�o(double a, double b) {
		return a / b;
	}
	public static double multiplica��o(double a, double b) {
		return a * b;
	}
	
}
