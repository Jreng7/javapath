package io.github.jreng7.heranca;

public class Animal {

  // Atributos
  private String nome;
  private int idade;

  public Animal(String novoNome, int novaIdade){
    this.nome = novoNome;
    this.idade = novaIdade;
  }

  // Metodos get e set
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

  // Metodos características.
  public void andar(){
    System.out.println("Andando...");
  }

  public void comer(){
    System.out.println("Comendo...");
  }

  public void dormir(){
    System.out.println("Dormindo ZZZZ...");
  }

  public void imprimirDados(){
    System.out.println("Nome: " + this.nome);
    System.out.println("idade: " + this.idade);
  }

}
