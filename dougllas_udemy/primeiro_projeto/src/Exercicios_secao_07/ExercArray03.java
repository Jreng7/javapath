package Exercicios_secao_07;
import java.util.Scanner;

public class ExercArray03 {
  public static void main(String[] args){
    // 3. Escreva um programa Java que solicite ao usuário que insira 5 números inteiros e
    // armazene-os em um array. Em seguida, calcule e imprima a média dos números.

    Scanner scanner = new Scanner(System.in);

    // Ex: [ 5, 2, 3, 4, 8 ]
    int[] numeros = new int[5];
    System.out.println("Digite 5 números: ");

    for(int i = 0; i < numeros.length; i++){
      numeros[i] = scanner.nextInt();
    }

    // for-each
    int soma = 0;
    for(int item : numeros){  // ":" Os dois pontos é a forma de dizer "para cada elemento em". (Ou p/ cada item do array numeros).
     soma += item; // Isso é o mesmo que "soma = soma + item"
    }

    double media = (double) soma / numeros.length;
    System.out.println("A média é: " + media);
    scanner.close();

  }
}
