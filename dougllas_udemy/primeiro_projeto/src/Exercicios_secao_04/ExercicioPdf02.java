package Exercicios_secao_04;

import java.util.Scanner;

public class ExercicioPdf02 {
  public static void main(String[] args){
    // 2.) Escreva um programa que declare uma variável do tipo double e calcule o quadrado
    //desse número.

    Scanner calculadora2 = new Scanner(System.in);

    System.out.print("Digite um número para descobrir o quadrado dele: ");
    double num1 = calculadora2.nextDouble();

    double quadradoNum1 = num1 * num1;

    System.out.print("O quadrado de " + num1 + " é: " + quadradoNum1);
    calculadora2.close();
  }
}

