package br.com.exemplo.numeros;

import java.util.Scanner;

public class NumerosArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[10];
		int soma = 0, maior, menor;
		
		System.out.println("Digite 10 números inteiros:");
		for (int i = 0; i < 10; i++) {
			System.out.print("Número " + (i + 1) + ":  ");
			numeros[i] = scanner.nextInt();
			soma += numeros[i];
		}
		
		maior = menor = numeros[0];
		
		for (int num : numeros) {
			if (num > maior) {
				maior = num;
			}
			if (num < menor) {
				menor = num;
			}
		}
		
		double media = (double) soma / numeros.length;
		
		System.out.println("\nNúmeros digitados:");
		for (int num : numeros) {
			System.out.print(num + " ");
		}
		
		System.out.println("\nMédia dos Números: " + media);
		System.out.println("Maior número: " + maior);
		System.out.println("Menor número: " + menor);
		
		scanner.close();
	}

}
