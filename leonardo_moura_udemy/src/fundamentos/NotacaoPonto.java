package fundamentos;

public class NotacaoPonto {
  public static void main(String[] args){
    // "String" não é um tipo primitivo e também não é uma palavra reservada da linguagem JAVA.

    String texto = "Suíça é um país frio";
    var frase = texto.toUpperCase();

    System.out.println(frase);

    /*
        No Java, o metodo toUpperCase() não modifica diretamente o conteúdo da variável texto.
        Isso acontece porque String em Java é imutável, o que significa que uma vez criado, o
        valor de um objeto String não pode ser alterado.

        OBS: "Quando você chama texto.toUpperCase(), o metodo cria uma nova String com todas as letras em
        maiúsculas, mas a variável texto original permanece inalterada."

        Por isso, quando você faz apenas:
        ** System.out.println(texto);

        O valor original de texto é exibido, e não a versão modificada (em maiúsculas).

        Se você quiser exibir a versão em maiúsculas sem armazenar em uma nova variável, pode fazer o seguinte:
        ** System.out.println(texto.toUpperCase());

        Nesse caso, o resultado será diretamente exibido no console sem precisar armazenar
        o valor retornado em outra variável.

        Se você quiser atualizar o conteúdo de texto, precisaria reatribuir o resultado do metodo:
        ** texto = texto.toUpperCase();
        ** System.out.println(texto);
    */

    String cumprimento = "Bom dia X";
    String textoSalvoEModificado = cumprimento.replace("X", "sr.(a)");

    System.out.println(textoSalvoEModificado); // Resultado => Bom dia sr.(a)

    // O metodo "replace" vai procurar o texto que foi setado no primeiro parâmetro "target" e vai substituir
    // Pelo texto em "replacement" no segundo parâmetro que no caso é "sr.(a)"

    // O mesmo valor para replace "TEM QUE SALVAR" o resultado em uma
    // variável para somente depois alterar o texto.

  }
}
