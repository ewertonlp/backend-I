package Aula08_Facade.Mesa_De_Trabalho;

import java.time.LocalDate;

public class Viagem {

    private String ciaAerea;
    private LocalDate dataPartida;
    private LocalDate dataRetorno;
    private String cidadeOrigem;
    private String cidadeDestino;
    private String Hotel;


    public Viagem( LocalDate dataPartida, LocalDate dataRetorno, String cidadeOrigem, String cidadeDestino, String hotel) {
        
        this.dataPartida = dataPartida;
        this.dataRetorno = dataRetorno;
        this.cidadeOrigem = cidadeOrigem;
        this.cidadeDestino = cidadeDestino;
        Hotel = hotel;
    }

    public Viagem(LocalDate of, LocalDate of1, String são_paulo, String dubai) {
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

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
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
                ", cidadeOrigem='" + cidadeOrigem + '\'' +
                ", cidadeDestino='" + cidadeDestino + '\'' +
                ", Hotel='" + Hotel + '\'' +
                '}';
    }
}
