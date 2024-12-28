package io.github.jreng7.interfaces;

public class CredencialEmail implements Autenticacao {

  private String senha;
  private String email;

  public CredencialEmail(String senha, String email) {
    this.senha = senha;
    this.email = email;
  }

  @Override
  public String getIdentificacao(){
    return this.email;
  }

  @Override
  public String getSenha(){
    return this.senha;
  }

  @Override
  public boolean isUsaSenha(){
    return true;
  }
}
