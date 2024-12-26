package io.github.jreng7.empresa;

public class GerenciaRH {

  // Atributo do tipo "Instância"
  private ConexaoBancaria conexaoBancaria;

  //                       Variável (parâmetro)
  public GerenciaRH(ConexaoBancaria conexao01){
    this.conexaoBancaria = conexao01;
  }

  public void pagarBonificacaoAnual(Funcionario funcionario){
    conexaoBancaria.enviarPagamento(funcionario.getCpf(), funcionario.bonificacaoAnual());
    enviarEmail();
  }

  private void enviarEmail(){
    System.out.println("E-mail enviado com sucesso.");
  }

}
