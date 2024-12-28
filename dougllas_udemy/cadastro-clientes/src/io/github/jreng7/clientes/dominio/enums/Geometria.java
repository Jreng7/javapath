package io.github.jreng7.clientes.dominio.enums;

public class Geometria {
  public static void main(String[] args){

    FormaGeometrica formas = FormaGeometrica.QUADRADO;
    int lados = formas.getLados();
    System.out.println(lados);
  }
}
