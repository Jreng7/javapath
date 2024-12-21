public class LabsVelocidadeCarro {
    public static void main(String[] args){

        // Exercício Proposto pelo professor - Seção 4 - Aula 37. Calculando o valor da multa por excesso de vel.

        int velocidadePermitida = 80; // Essa velocidade é definida por mim. (Permitida na Rodovia).
        int velocidadeVeiculo = 90; // Velocidade em que o veículo está. (ou seja, acima do permitido).
        // Vale lembrar que essa velocidade também é determinada por quem faz o exercício.
        int velocidadeConsiderada;

        // Com esses dados já podemos achar a velocidade "Considerada".
        // Porém, a velocidade considerada depende da velocidade permitida.

        if (velocidadePermitida < 100) {
            velocidadeConsiderada = velocidadePermitida + 7;
        } else {
            velocidadeConsiderada = velocidadePermitida + (int) (velocidadePermitida * 0.1);
        }

        int diferenca = velocidadeConsiderada - velocidadePermitida;
        int total = diferenca * 10;

        System.out.println("Valor da multa: " + total);
    }
}
