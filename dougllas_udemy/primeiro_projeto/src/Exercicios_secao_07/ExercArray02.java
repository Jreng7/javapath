package Exercicios_secao_07;

public class ExercArray02 {
  public static void main(String[] args){
    // 2. Crie um programa Java que declare um array de strings com nomes de pessoas e
    // imprima todos os nomes em ordem inversa.

//    String[] names = {"Joaquim", "Fernando", "Márcio"};
//    for(int i = 2; i >= 0; i--){
//      System.out.println(names[i]);
//    }

    // Mesmo resultado, porém, aqui foi usado "names.length - 1" que é a mesma coisa de 2.
    String[] names = {"Joaquim", "Fernando", "Márcio"};
    for(int i = names.length - 1; i >= 0; i--){
      System.out.println(names[i]);
    }
  }
}
