package Secao_11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {
  public static void main(String[] args){

    // Imprime a data atual, porém, sem fuso horário e também não tem hora, minuto e nem seg.
    LocalDate data01 = LocalDate.now();

    // Imprime completo, ou seja, data com hora.
    LocalDateTime data02 = LocalDateTime.now();

    // INSTANT É DATA/HORA GLOBAL. GMT DE LONDRES. ( Greenwich Mean Time )
    // Igual ao LocalDateTime, porém, além disso o Instant vem com a letra "Z" no final
    // Que indica que é uma data/hora GMT.
    Instant data03 = Instant.now();

    System.out.println("Variável data01 = " + data01);
    System.out.println("Variável data02 = " + data02);
    System.out.println("Variável data03 = " + data03);
  }
}
