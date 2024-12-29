package EstruturaSequencial_Secao_4;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_02 {
  public static void main(String[] args){/*

  2) Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
  casas decimais conforme exemplos.

  Fórmula da área do círculo: area = π . raio2
  Considere o valor de π = 3.14159
 */
    Locale.setDefault(Locale.US);
    Scanner numero = new Scanner(System.in);

    double raio, A;
    double pi = 3.14159;

    System.out.print("Digite o valor do raio: ");
    raio = numero.nextDouble();

    A = pi * Math.pow(raio, 2);
    System.out.printf("A = %.4f%n", A);

    numero.close();
  }
}
