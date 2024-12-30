package Secao_08_Exercicio_Application.application;
import Secao_08_Exercicio_Application.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args){

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Product produto = new Product();
    System.out.println("Enter product data: ");
    System.out.print("Name: ");
    produto.name = sc.nextLine();
    System.out.print("Price: ");
    produto.price = sc.nextDouble();
    System.out.print("Quantity in Stock: ");
    produto.quantity = sc.nextInt();

    sc.close();
  }
}
