package io.github.jreng7.empresa;

   // SuperClasse
public class Funcionario {

  // Atributos do funcionário.
  private String nome;
  private String cpf;
  private double salario;


  public double bonificacao(){
    return ( this.salario / 10 ) + 200;
  }

  public void imprimirRemuneracao(){
    double remuneracao = salario + this.bonificacao();
    System.out.println("Remuneração do funcionário " + nome + " é $" + remuneracao);
  }

  // Metodos de Funcionário (Gets e Sets)
  public String getNome(){
    return this.nome;
  }

  public void setNome(String novoNome){
    this.nome = novoNome;
  }

  public String getCpf(){
    return this.cpf;
  }

  public void setCpf(String novoCpf){
    this.cpf = novoCpf;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }
}
