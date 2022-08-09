package Aula08_Facade.Mesa_De_Trabalho;

import java.time.LocalDate;
import java.util.Date;

public class Voo {

    private String dataPartida;
    private String dataRetorno;
    private String localidade;

    public Voo(String dataPartida, String dataRetorno, String localidade) {
        this.dataPartida = dataPartida;
        this.dataRetorno = dataRetorno;
        this.localidade = localidade;
    }


    public String getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(String dataPartida) {
        this.dataPartida = dataPartida;
    }

    public String getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(String dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    @Override
    public String toString() {
        return "Voo{" +
                "dataPartida=" + dataPartida +
                ", dataRetorno=" + dataRetorno +
                ", localidade='" + localidade + '\'' +
                '}';
    }
}
