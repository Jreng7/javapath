package io.github.jreng7.heranca;

public class Animal {

  private String nome;
  private int idade;


  public void setNome(String novoNome){
    this.nome = novoNome;
  }

  public String getNome(){
    return this.nome;
  }

  public void setIdade(int novaIdade){
    this.idade = novaIdade;
  }

  public int getIdade(){
    return this.idade;
  }

  public void andar(){
    System.out.println("Andando...");
  }

  public void comer(){
    System.out.println("Comendo...");
  }

  public void dormir(){
    System.out.println("Dormindo ZZZZ...");
  }

}
