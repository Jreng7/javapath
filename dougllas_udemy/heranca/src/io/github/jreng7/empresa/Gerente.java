package io.github.jreng7.empresa;

public class Gerente extends Funcionario{

  // @Override significa que houve uma sobescrita no metodo definido em "Funcionário"
  // Porquanto a aplicação do metodo é diferente do tecnico para o gerente.

  @Override
  public double bonificacao(){
    double bonificacaoGerente = super.bonificacao();
    return bonificacaoGerente + 500;
  }

  @Override
  public double bonificacaoAnual(){
    return super.getSalario() * 3;
  }

}
