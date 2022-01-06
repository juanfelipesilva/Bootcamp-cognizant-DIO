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
		double subtração = subtração(a, b);
		double multiplicação = multiplicação(a, b);
		double divisão = divisão(a, b);
		
		System.out.println("soma " + soma);
		System.out.println("sub " + subtração);
		System.out.println("multi " + multiplicação);
		System.out.println("div " + divisão);
		
	}

	public static double soma(double a, double b) {
		return a + b;
	}
	
	public static double subtração(double a, double b) {
		return a - b;
	}
	public static double divisão(double a, double b) {
		return a / b;
	}
	public static double multiplicação(double a, double b) {
		return a * b;
	}
	
}
