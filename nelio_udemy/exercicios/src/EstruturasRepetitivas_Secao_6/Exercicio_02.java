package EstruturasRepetitivas_Secao_6;
import java.util.Scanner;

public class Exercicio_02 {
  public static void main(String[] args){
    // Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
    //cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
    //menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

    Scanner coordenadas = new Scanner(System.in);

    int x = coordenadas.nextInt();
    int y = coordenadas.nextInt();

    while(x != 0 && y != 0){
      if(x > 0 && y > 0){
        System.out.print("primeiro");
      }
      else if(x < 0 && y > 0){
        System.out.print("segundo");
      }
      else if(x < 0 && y < 0){
        System.out.print("terceiro");
      } else {
        System.out.print("quarto");
      }

      x = coordenadas.nextInt();
      y = coordenadas.nextInt();
    }


    coordenadas.close();
  }
}
