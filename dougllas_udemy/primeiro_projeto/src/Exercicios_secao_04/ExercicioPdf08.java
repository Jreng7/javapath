package Exercicios_secao_04;
import java.util.Scanner;

public class ExercicioPdf08 {
  public static void main(String[] args){
   /* 8. Dado que existe um mercado onde as maçãs custam R$ 0,30 cada se forem
    compradas menos do que uma dúzia, e R$ 0,25 se forem compradas pelo menos
    doze. Escreva um programa que leia o número de maçãs compradas, calcule e
    escreva o valor total da compra.
    */

    Scanner feira = new java.util.Scanner(System.in);

    System.out.print("Digite a quantidade de maças que você pegou: ");
    int macas = feira.nextInt(); // Lê o número de maçãs.

    double precoPorUnidade; // Variável para armazenar o preço unitário.

    // Define o preço por unidade dependendo da quantidade.
    if (macas < 12){
      precoPorUnidade = 0.30;
    } else {
      precoPorUnidade = 0.25;
    }

    // Calcula o valor total
    double total = precoPorUnidade * macas;

    // Exibe o resultado formatado.
    System.out.println("Você está comprando " + macas + " maçãs.");
    System.out.println("O total a pagar é R$ " + String.format("%.2f", total));

    feira.close();
  }
}
