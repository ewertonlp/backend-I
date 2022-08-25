package Aula01.mesa01;

public class Quadrado extends Figura{

    private double lado;

    public Quadrado(double v) {
        super();
        this.lado = lado;

    }

    @Override
    public double calcularPerimetro() {
        super.calcularPerimetro();
        double perimetro = 4*lado;
        return perimetro;

    }
}
