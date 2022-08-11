package Aula08_Facade.Mesa_De_Trabalho;

public class FacadeTurismo implements IFacadeTurismo {

    private ApiVoo apiVoo;
    private ApiHotel apiHotel;

    public FacadeTurismo() {
        apiVoo = new ApiVoo();
        apiHotel = new ApiHotel();
    }


    @Override
    public Viagem buscas(Viagem viagem) {
        viagem.setCiaAerea(apiVoo.listaVoo(viagem.getDataPartida(), viagem.getDataRetorno(), viagem.getCidadeOrigem(), viagem.getCidadeDestino()));
        viagem.setHotel(apiHotel.listaHotel(viagem.getDataPartida(), viagem.getDataRetorno(), viagem.getCidadeDestino()));
        return viagem;
    }
}
