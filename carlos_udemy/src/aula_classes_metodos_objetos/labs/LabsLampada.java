package aula_classes_metodos_objetos.labs;

public class LabsLampada {

  // Atributo
  private boolean on;

  // construtor
  public LabsLampada(boolean ligado){
    this.on = ligado;
  }

  // metodos
  public void turnOn(){
    this.on = true;
  }

  public void turnOff(){
    this.on = false;
  }

  public void showState(){
    System.out.println("Lâmpada " + (on ? "ligada" : "desligada"));
  }
}
