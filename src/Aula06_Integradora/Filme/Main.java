package Aula06_Integradora.Filme;

public class Main {

    public static void main(String[] args) {

        GradeDeFilmesProxy proxy = new GradeDeFilmesProxy(new GradeDeFilmes());

        proxy.setIp(new Ip(201,23,23,25));

        try {
            System.out.println(proxy.getFilme("The Batman").getLink());
            System.out.println("Acesso do filme liberado!");
        }
        catch (FilmeNaoHabilitadoException e){
            System.out.println(e);
        }
    }
}
