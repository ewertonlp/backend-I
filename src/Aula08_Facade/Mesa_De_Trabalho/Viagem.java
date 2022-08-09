package Aula08_Facade.Mesa_De_Trabalho;

import java.time.LocalDate;

public class Viagem {

    private String ciaAerea;
    private LocalDate dataPartida;
    private LocalDate dataRetorno;
    private String cidade;
    private String Hotel;

    public Viagem(String ciaAerea, LocalDate dataPartida, LocalDate dataRetorno, String cidade, String hotel) {
        this.ciaAerea = ciaAerea;
        this.dataPartida = dataPartida;
        this.dataRetorno = dataRetorno;
        this.cidade = cidade;
        Hotel = hotel;
    }

    public String getCiaAerea() {
        return ciaAerea;
    }

    public void setCiaAerea(String ciaAerea) {
        this.ciaAerea = ciaAerea;
    }

    public LocalDate getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(LocalDate dataPartida) {
        this.dataPartida = dataPartida;
    }

    public LocalDate getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(LocalDate dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getHotel() {
        return Hotel;
    }

    public void setHotel(String hotel) {
        Hotel = hotel;
    }

    @Override
    public String toString() {
        return "Viagem{" +
                "ciaAerea='" + ciaAerea + '\'' +
                ", dataPartida=" + dataPartida +
                ", dataRetorno=" + dataRetorno +
                ", cidade='" + cidade + '\'' +
                ", Hotel='" + Hotel + '\'' +
                '}';
    }
}
