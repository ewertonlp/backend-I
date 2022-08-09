package Aula08_Facade.Mesa_De_Trabalho;

public class FacadeTurismo implements IFacadeTurismo {

    private ApiVoo apiVoo;
    private ApiHotel apiHotel;

    public FacadeTurismo() {
        apiVoo = new ApiVoo();
        apiHotel = new ApiHotel();
    }

    @Override
    public String buscas(Voo voo, Hotel hotel) {
        System.out.println("Cidade disponível: "+hotel.getCidade());
        System.out.println("Data da Partida: "+voo.getDataPartida());
        System.out.println("Data de Retorno: "+voo.getDataRetorno());
        return null;
    }

}
