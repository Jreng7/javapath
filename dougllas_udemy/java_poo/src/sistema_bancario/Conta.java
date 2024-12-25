package sistema_bancario;

public class Conta {

  private Cliente titular;
  private int numero;
  private double saldo;

  Conta(){}

  Conta(Cliente titularConta, int numeroConta, double saldoConta){
    this.titular = titularConta;
    this.numero = numeroConta;
    if (saldoConta >= 0){
      this.saldo = saldoConta;
    }
  }

  public void setSaldo(double atualizarSaldo){
    if(atualizarSaldo >= 0){
     this.saldo = atualizarSaldo;
    } else {
      System.out.println("Saldo não foi alterado. Valor negativo.");
    }
  }

  public double getSaldo(){
    return this.saldo;
  }

  void imprimirSaldo(){
    System.out.println("Saldo atual R$" + this.saldo + " reais.");
  }

  public Cliente getTitular() {
    return titular;
  }

  public void setTitular(Cliente novoTitular) {
    this.titular = novoTitular;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numeroConta) {
    this.numero = numeroConta;
  }
}
