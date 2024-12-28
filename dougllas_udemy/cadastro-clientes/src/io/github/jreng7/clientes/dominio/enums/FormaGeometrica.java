package io.github.jreng7.clientes.dominio.enums;

public enum FormaGeometrica {

  QUADRADO(4, "Quadrado"),
  CIRCULO(1, "Circulo"),
  TRIANGULO(3, "Triangulo"),
  RETANGULO(4, "Retangulo");

  private final int lados;
  private final String descricao;

  FormaGeometrica(int ladosObj, String descricaoObj){
    this.lados = ladosObj;
    this.descricao = descricaoObj;
  }

  public int getLados(){
    return this.lados;
  }

  public String getDescricao(){
    return this.descricao;
  }
}
