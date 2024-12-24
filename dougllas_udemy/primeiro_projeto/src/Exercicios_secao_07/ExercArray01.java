package Exercicios_secao_07;

public class ExercArray01 {
  public static void main(String[] args){
    // 1. Escreva um programa Java que declare e inicialize um array de inteiros com valores
    //de 1 a 10 e, em seguida, imprima cada elemento do array.

    int[] inteiros = {1,2,3,4,5,6,7,8,9,10};
    for(int i = 0; i < inteiros.length; i++){
      System.out.println(inteiros[i]);
    }

  }
}
