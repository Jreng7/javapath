package Exercicios_secao_04;
import java.util.Scanner;

public class ExercicioPdf07 {
  public static void main(String[] args){
    // 7. Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma
    //mensagem que diga se ela poderá ou não votar este ano.

    Scanner votacao = new Scanner(System.in);

    System.out.print("Digite a sua idade: ");
    int idade = votacao.nextInt();

    System.out.println(idade >= 18 ? "Você pode votar este ano" : "Você ainda não pode votar este ano.");
    votacao.close();
  }
}
