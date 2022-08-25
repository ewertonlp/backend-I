package Aula07_Flyweight.Aula_Pratica.model;

public class Computador {

    private int ram;
    private int hd;
    //private String id;
    private static int contador; // ñ pode ser utilizada por outra classe

    public Computador(int ram, int hd) {
        super();
        this.ram = ram;
        this.hd = hd;
        contador++;
        System.out.println("\nContador: "+contador);
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "ram=" + ram +
                ", hd=" + hd +
                '}';
    }
}
