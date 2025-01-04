package arrays;

import java.util.Arrays;

public class Exercicio {
  public static void main(String[] args) {

    //  1) Array é indexado, ou seja, você acessa a partir de um determinado índice.
    //  2) Array tem tamanho fixo.
    //  3) Significa que é um tipo homogêneo (todos os dados "elementos" são do mesmo tipo, ou seja, double)

    double[] notasAlunoA = new double[3];
    System.out.println(Arrays.toString(notasAlunoA)); // Inicia com valor padrão do tipo!

    notasAlunoA[0] = 7.9;
    notasAlunoA[1] = 5.8;
    notasAlunoA[2] = 8.7;

    System.out.println(Arrays.toString(notasAlunoA)); // Imprime o array com os elementos.

    double total = 0;
    for(int i = 0; i < notasAlunoA.length; i++){
      total += notasAlunoA[i];
    }
    System.out.println(total); // 7.9 + 5.8 + 8.7 = 22.4

  }
}
