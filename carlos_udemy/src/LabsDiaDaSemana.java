public class LabsDiaDaSemana {
  public static void main(String[] args){

    // Escreva um programa que retorna o nome do dia da semana com base em um número fornecido.
    // OBS: O primeiro dia da semana é Domingo, e corresponde ao número 1.

    // Primeiro, usando o switch clássico.

//    int n = 1;
//    String dow;
//
//    switch(n){
//      case 1:
//        dow = "Domingo";
//        break;
//      case 2:
//        dow = "Segunda";
//        break;
//      case 3:
//        dow = "Terça";
//      etc...
//
//    }
//
//    System.out.println();



    // AGORA USANDO SWITCH EXPRESSIONS.

    int day = 1;

    String dayName = switch (day){
      case 1 -> "Domingo";
      case 2 -> "Segunda";
      case 3 -> "Terça";
      case 4 -> "Quarta";
      case 5 -> "Quinta";
      case 6 -> "Sexta";
      case 7 -> "Sábado";
      default -> "Inválido";
    };

    System.out.println("O dia da semana é: " + dayName);
  }
}

