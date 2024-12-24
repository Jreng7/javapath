package Exercicios_secao_07;

public class ExercArray04 {
  public static void main(String[] args){
    // 4. Crie um programa Java que declare um array contendo 5 números double (ex: 10.5,
    // 20.7, 15.3, 40.2, 8.9) e encontre o maior elemento no array (resposta: 40.2)

    double[] numeros = { 10.5, 20.7, 15.3, 40.2, 8.9 };
    double maior = numeros[0];

    for(int i = 1; i < numeros.length; i++){
      if(numeros[i] > maior) {
        maior = numeros[i];
      }
    }

    System.out.println("O maior elemento é: " + maior);
  }
}
