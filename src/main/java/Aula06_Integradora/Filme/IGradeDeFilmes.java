package Aula06_Integradora.Filme;

public interface IGradeDeFilmes {

    Filme getFilme(String nomeDoFilme) throws FilmeNaoHabilitadoException;
    
}
