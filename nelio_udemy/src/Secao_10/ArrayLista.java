package Secao_10;

import java.util.ArrayList;
import java.util.List;

public class ArrayLista {
  public static void main(String[] args){

    // Interface LIST e o ArrayList implementa.

      List<String> lista = new ArrayList<>();

      lista.add("Joaquim");
      lista.add("Alex");
      lista.add("Fernanda");
      lista.add("Argentina");
      lista.add("Suiça");
      lista.add("Marrocos");
      lista.add("Canada");
      lista.add("Maranhão");
      lista.add("Navio");

      lista.add(2, "Marco"); // Quer dizer "Na posição 2" eu quero adicionar o elemento "Marco".
    // Logo, Fernanda que era a posição 2 foi deslocada para frente e o Marco ficou na posição 2.

      for(String item : lista){
        System.out.println("Cada item da lista é " + item);
      }

    System.out.println("----------------------------------------------------");

      // E como ver o tamanho da lista? Usa o lista.length?? NÃO! Agora usasse o metodo .size();
    System.out.println(lista.size()); // Resposta 10.

    lista.remove("Alex");
    lista.remove(4);
    lista.removeIf(item -> item.charAt(1) == 'a'); // Remoção por predicado.

    for(String item : lista){
      System.out.println(item);
    }

    System.out.println("------------------------------");
    System.out.println("Encontre o elemento 'Fernanda'. Qual posição está? " + lista.indexOf("Fernanda"));
    // Fernanda está na posição 1, logo, resposta é => 1

  }
}
