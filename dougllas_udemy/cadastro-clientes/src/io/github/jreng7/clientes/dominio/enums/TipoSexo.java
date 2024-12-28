package io.github.jreng7.clientes.dominio.enums;

public enum TipoSexo {
  MASCULINO("Masculino"),
  FEMININO("Feminino");

  private final String sexo;

  TipoSexo(String sexo){
    this.sexo = sexo;
  }

  public String getSexo(){
    return sexo;
  }
}
