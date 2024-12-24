package fundamentos;

import java.util.Scanner;

public class CalculoMediaAluno {
  public static void main(String[] args){
    // Programa que calcula a média da nota de um aluno com base nos três trimestres.

    Scanner lerNotas = new java.util.Scanner(System.in);

    System.out.print("Digita a nota do 1 Trimestre: ");
    int nota1 = lerNotas.nextInt();

    System.out.print("Digita a nota do 2 Trimestre: ");
    int nota2 = lerNotas.nextInt();

    System.out.print("Digite a nota do 3 Trimestre: ");
    int nota3 = lerNotas.nextInt();

    double media = (nota1 + nota2+ nota3) / 3;

    System.out.println(media >= 6 ? "Aprovado": "Reprovado");

    lerNotas.close();
  }
}
