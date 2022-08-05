package Aula01.mesa01;

public class Circulo extends Figura{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularPerimetro() {
        super.calcularPerimetro();
        double perimetro = 2*Math.PI*raio;
        if (raio > 0) {
            return perimetro;
        } else {
            System.out.println("Valor invalido");
        }
        return perimetro;
    }


    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }


}
