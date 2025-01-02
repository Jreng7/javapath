package ArraysList_Secao_10;

import java.util.Scanner;
import java.util.Locale;

public class Vetores2 {
  public static void main(String[] args){

     /*  Fazer um programa para ler um número inteiro N e os dados (nome e preço) de N Produtos.
     Armazene os N produtos em um vetor. Em seguida, mostrar o preço médio dos produtos.
    */

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    Vetores2_Product[] vect = new Vetores2_Product[n];

    for (int i = 0; i < n; i++){
      sc.nextLine();
      String name = sc.nextLine();
      double price = sc.nextDouble();
      vect[i] = new Vetores2_Product(name, price);
    }

    double sum = 0.0;
    for(int i = 0; i < n; i++){
      sum += vect[i].getPrice();
    }

    double avg = sum / n;
    System.out.printf("AVERAGE PRICE: %.2f%n", avg);

    sc.close();
  }
}