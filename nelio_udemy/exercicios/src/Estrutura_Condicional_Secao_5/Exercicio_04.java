package Estrutura_Condicional_Secao_5;
import java.util.Scanner;


public class Exercicio_04 {
  public static void main(String[] args){
    // Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
    //começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

    Scanner hora = new Scanner(System.in);

    int horaInicial, horaFinal;
    int duracao;

    System.out.println("Digite a hora inicial do jogo: ");
    horaInicial = hora.nextInt();
    System.out.println("Digite a hora final do jogo: ");
    horaFinal = hora.nextInt();

    if(horaInicial < horaFinal){
      duracao = horaFinal - horaInicial;
    } else {
      duracao = 24 - horaInicial + horaFinal;
    }

    System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

    hora.close();
  }
}
