package aula_classes_metodos_objetos.labs;

public class LampadaObjeto {
  public static void main(String[] args) {

    LabsLampada lampada1 = new LabsLampada(true);
    lampada1.showState();
    lampada1.turnOn();
    lampada1.showState();

    System.out.println("--------------------------------");

    LabsLampada lampada2 = new LabsLampada(false);
    lampada2.showState();
    lampada2.turnOn();
    lampada2.showState();
  }

}
