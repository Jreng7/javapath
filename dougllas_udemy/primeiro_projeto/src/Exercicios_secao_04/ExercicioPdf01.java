package Exercicios_secao_04;

import java.util.Scanner;

public class ExercicioPdf01 {
  public static void main(String[] args){
    // 1. Escreva um programa para declarar duas variáveis do tipo inteiro e calcular sua soma.

    Scanner calculadora1 = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int numero1 = calculadora1.nextInt();

    System.out.print("Digite mais um número: ");
    int numero2 = calculadora1.nextInt();

    int soma = numero1 + numero2;

    System.out.println("A soma do número1 mais o número2 é: " + soma);
    calculadora1.close();
  }
}
