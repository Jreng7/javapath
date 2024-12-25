package io.github.jreng7.heranca;

public class Panda extends Animal {

  //Atributos
  private String cor;
  private String corSecuranria;

  public Panda(int idade){
    super("Pandozz", idade);
  }

  // Metodo que somente o Panda possui.
  public void subirArvore(){
    System.out.println("Subindo ...");
  }

  // Metodos
  public String getCor(){
    return this.cor;
  }

  public void setCor(String novaCor){
    this.cor = novaCor;
  }

  public String getCorSecuranria(){
    return corSecuranria;
  }

  public void setCorSecuranria(String novaCorSegunda){
    this.corSecuranria = novaCorSegunda;
  }

}
