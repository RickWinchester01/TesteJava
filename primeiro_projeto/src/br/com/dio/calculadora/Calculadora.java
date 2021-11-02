package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		float soma = soma(a,b);
		float subtracao = subtracao(a,b);
		float multiplicacao = multiplicacao(a,b);
		float divisao = divisao(a,b);
		
		System.out.println("A soma dos dois números é: " + soma);
		System.out.println("A subtração dos dois números é: " + subtracao);
		System.out.println("A multiplicacao dos dois números é: " + multiplicacao);
		System.out.println("A divisão dos dois números é: " + divisao);
		
	}
	
	public static float soma(float a, float b) {
		return a + b;
	}
	public static float subtracao(float a, float b) {
		return a - b;
	}
	public static float multiplicacao(float a, float b) {
		return a * b;
	}
	public static float divisao(float a, float b) {
		return a / b;
	}
	
}
