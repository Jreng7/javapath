package io.github.jreng7.empresa;

public class Main {
  public static void main(String[] args){

    Tecnico tecnico = new Tecnico();

    tecnico.setNome("Fulano");
    tecnico.setSalario(1_200);
    tecnico.setCpf("742.571.852-09");
    tecnico.imprimirRemuneracao();

    Gerente gerente = new Gerente();

    gerente.setNome("Ciclano");
    gerente.setCpf("741.257.784-70");
    gerente.setSalario(7_500);
    gerente.imprimirRemuneracao();

    System.out.println("Bônus Anual:");
    System.out.println("Gerente: " + gerente.bonificacaoAnual());
    System.out.println("Técnico: " + tecnico.bonificacaoAnual());

    ConexaoBancaria conexaoBancaria = new ConexaoBancaria();
    GerenciaRH gerenciaRH = new GerenciaRH(conexaoBancaria);

    gerenciaRH.pagarBonificacaoAnual(tecnico);
    gerenciaRH.pagarBonificacaoAnual(gerente);

  }
}
