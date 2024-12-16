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
    }
}
