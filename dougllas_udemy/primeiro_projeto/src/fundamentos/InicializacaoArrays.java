package fundamentos;

public class InicializacaoArrays {
  public static void main(String[] args){
    // Exemplos de Arrays

    // Exemplo de uma variável normal vs array de números. O Array consegue conter uma quantidade maior
    // de elementos em uma única variável "único array".
    int idade = 30;
    int[] numeroImpares = { 1,3,5,7,9 };

    // Aqui, já foi setado 3 elementos no array "alunos".
    String[] alunos = {"Joaquim", "Fulano", "Luiz"};

    // Para acessar um elemento específico dentro do array, basta chamar o array e colocar o índice
    // do elemento que deseja pegar, exemplo, abaixo pega o elemento 1 "Fulano"
    System.out.println(alunos[1]);

    // Aqui, estou dizendo que o número máximo de elementos no array "paises" é 5.
    String[] paises = new String[5];

  }
}
