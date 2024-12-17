public class AulasBasicasOfJava {
    public static void main(String[] args) {
        System.out.println("Casting Explícito");

        double numero1 = 240.77;
        int numero2 = (int) numero1;   // Aqui o Java acusa erro, pois, int não pode conter double.
        // porém, se eu colocar na frente da variável o tipo, logo, estou fazendo o "Casting Explícito".
        // o Java "Trunca" os decimais para armazenar o dado do tipo double em int.

        System.out.println(numero1);
        System.out.println(numero2);

        // Strings
        System.out.println("Olá,\ntudo\nbem"); //     Aqui o "\n" é uma quebra de linha.

        // A partir do Java 15 vieram os "Text Blocks" para usá-los basta colocar 3 aspas duplas """
        // Porém, devesse começar a escrever a partir da linha debaixo, veja um exemplo.

        String texto = """
                Aqui está um texto usando 'Text Blocks' vale lembrar que devemos
                encerrar sempre com ponto e vírgula.
                """;

        System.out.println(texto);
    }
}
