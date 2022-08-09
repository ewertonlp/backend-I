package Aula07_Flyweight.Teoria;

public class Main {

    private static final String cores[] = {"roxo", "azul", "verde", "preto"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Circulo circulo = FlyweightFactory.obterCirculo(corAleatoria());
            circulo.setRaio(i + 5);
            circulo.setTamanho("Tamanho: " + i + 2);

            circulo.desenhar();
        }
    }

    private static String corAleatoria() {
        return cores[(int)(Math.random()*cores.length)];
    }
}
