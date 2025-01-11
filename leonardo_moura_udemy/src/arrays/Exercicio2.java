  package arrays;

  import java.util.Scanner;
  import java.util.Locale;

  public class Exercicio2 {
    public static void main(String[] args){
      Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

      System.out.print("Quantas notas: ");
      int qtdNotas = entrada.nextInt();
      double[] notas = new double[qtdNotas];

      for(int i = 0; i < notas.length; i++){
        System.out.print("Informe a nota " + (i + 1) + ":");
        notas[i] = entrada.nextDouble();
      }

      double total = 0;
      for(double item: notas){
        total += item; // total = total + item
      }
      double media = total / notas.length;
      System.out.println("A média das notas é: " + media);

      entrada.close();
    }
  }
