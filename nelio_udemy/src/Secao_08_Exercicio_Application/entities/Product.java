package Secao_08_Exercicio_Application.entities;

public class Product {

  // Atributos
  public String name;
  public double price;
  public int quantity;


  // Metodos
  public double totalValueInStock(){
    return price * quantity;
  }

  public void addProducts(int quantidade){
    this.quantity += quantidade;
  }

  public void removeProducts(int quantidade){
    this.quantity -= quantidade;
  }
}
