package Exercicios_secao_04;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ExercicioPdf06 {
  public static void main(String[] args) {
    // 6. Escreva um programa que calcule o perímetro e a área de um retângulo.

    // Área do retângulo: Área = base x altura
    // Perímetro = 2 x (base + altura) => O perímetro é a soma de todos os lados do retângulo

    Scanner retangulo = new java.util.Scanner(System.in);

    System.out.print("Digite a base do retângulo: ");
    int base = retangulo.nextInt();
    System.out.print("Digite a altura do retângulo: ");
    int altura = retangulo.nextInt();

    // Cálculo da área:
    int area = base * altura;
    System.out.println("A área do retângulo é: " + area + "(m)²");

    // Cálculo do perímetro:
    int perimetro = 2 * (base + altura);
    System.out.print("O perímetro do retângulo é: " + perimetro + "(m)²");

    retangulo.close();

  }
}
