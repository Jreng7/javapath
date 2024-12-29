package EstruturaSequencial_Secao_4;
import java.util.Scanner;

public class Exercicio_01 {
  public static void main(String[] args){
  // 1) Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
    // mensagem explicativa, conforme exemplos.

    Scanner numero = new java.util.Scanner(System.in);

    int x, y, soma;

    System.out.print("Digite o primeiro número: ");
    x = numero.nextInt();
    System.out.print("Digite o segundo número: ");
    y = numero.nextInt();

    soma = x + y;

    System.out.println("SOMA: " + soma);

    numero.close();
  }
}
