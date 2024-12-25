package io.github.jreng7.heranca;

public class Hipopotamo extends Animal {
  // atributo
  private int forcaMordida;

  public Hipopotamo(int idade, int forcaMordida){
    super("Hipopotamo", idade);
    this.forcaMordida = forcaMordida;
  }

  // metodo (ação) somente do hipopotamo
  public void ficarNaAgua(){
    System.out.println("Estou na água...");
  }

  // get e set
  public int getForcaMordida() {
    return forcaMordida;
  }

  public void setForcaMordida(int forcaMordida) {
    this.forcaMordida = forcaMordida;
  }
}
