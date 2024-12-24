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

    // Caso deseje atribuir um elemento do array a uma variável, basta fazer conforme abaixo.
    String aluno1 = alunos[2];
    System.out.println(aluno1);

    // Aqui, estou dizendo que o número máximo de elementos no array "paises" é 5.
    String[] paises = new String[2];
    paises[0] = "Brasil";
    paises[1] = "EUA";

    String[] telefones = new String[3];
    telefones[0] = "35997541598";
    telefones[1] = "11759558707";
    telefones[2] = "83945741247";

    System.out.println(telefones[2]);
  }
}
