package aula_classes_metodos_objetos;

public class Account {

  // Atributos
  String accountNumber;
  String accountOwner;
  double balance; // Saldo da conta

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
}
