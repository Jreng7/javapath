package io.github.jreng7.clientes.dominio;

import io.github.jreng7.clientes.dominio.enums.TipoSexo;

import java.util.UUID; // Universally Unique Identifier  (Identificador Universalmente Único)

public class Cliente {

  // Atributos
  private UUID codigo;
  private String nome;
  private String cpf;
  private TipoSexo sexo;
  private byte[] foto;

  // Construtor
  public Cliente(){
    this.codigo = UUID.randomUUID();
  }

  // Metodos Geters e Seters
  public UUID getCodigo() {
    return codigo;
  }

  public void setCodigo(UUID codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public TipoSexo getSexo() {
    return sexo;
  }

  public void setSexo(TipoSexo sexo) {
    this.sexo = sexo;
  }

  public byte[] getFoto() {
    return foto;
  }

  public void setFoto(byte[] foto) {
    this.foto = foto;
  }
}
