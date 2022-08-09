package Aula08_Facade.Mesa_De_Trabalho;

import java.util.Date;

public class Hotel {

    private String dataEntrada;
    private String dataSaida;

    private String cidade;

    public Hotel(String dataEntrada, String dataSaida, String cidade) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.cidade = cidade;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "dataEntrada=" + dataEntrada +
                ", dataSaida=" + dataSaida +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
