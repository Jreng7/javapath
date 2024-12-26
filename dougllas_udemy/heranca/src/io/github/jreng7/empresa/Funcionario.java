package io.github.jreng7.empresa;

   // SuperClasse
public abstract class Funcionario {

  // Atributos do funcionário.
  private String nome;
  private String cpf;
  private double salario;


  // metodo abstrato não tem "chaves" { } Ele apenas diz para os filhos dele para implementar uma classe
     // com o nome que foi setado aqui e cada um faz a sua lógica, de acordo com cada classe.

     // Outro detalhe, uma classe abstrata só existe em uma classe que foi definida como abstrata
     // no caso, a class funcionario tem abstract.
  public abstract double bonificacaoAnual();



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
