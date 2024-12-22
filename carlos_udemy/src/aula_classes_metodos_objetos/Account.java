package aula_classes_metodos_objetos;

public class Account {

  // Atributos
  private final String accountNumber;
  private final String accountOwner;
  private double balance; // Saldo da conta

  // Lógica de inicialização fica somente aqui.
  public Account(double balance, String accountNumber, String accountOwner) {
    this.balance = balance;
    this.accountNumber = accountNumber;
    this.accountOwner = accountOwner;
  }

  // Os construtores abaixo delegam a chamada para o construtor principal.
  public Account(String numeroDaConta){
    this(0, numeroDaConta, null);
  }

  public Account(String numeroDaConta, String nomeCliente){
    this(0, numeroDaConta, nomeCliente);
  }

  public Account(String numeroConta, double saldoConta){
    this(saldoConta, numeroConta, null);
  }

  // Métodos
  boolean deposit(double amount){ // Deposito!
    if(amount > 0) {
      balance += amount;
      return true;
    }
    return false;
  }

  // Metodos com o mesmo nome é chamado de "Sobrecarga"
  boolean deposit(String montante){ // Recebe texto, ou seja, String.
    return deposit(Double.parseDouble(montante)); // Converte a String em número e envia para o deposit de cima.
  }

  boolean withDraw(double amount) { // Aqui é o saque.
    if(amount > 0) {
      balance -= amount;
      return true;
    }
    return false;
  }

  // Metodo com mais de 1 parâmetro.
  void transfer(double montante, Account targetAccount){
    withDraw(montante);
    targetAccount.deposit(montante);
  }

  void printBalance(){
    System.out.println("Balance: $" + balance);
  }

  public String getAccountNumber(){
    return accountNumber;
  }

  public String getAccountOwner(){
    return accountOwner;
  }

}
