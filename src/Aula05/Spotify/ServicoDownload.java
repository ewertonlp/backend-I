package Aula05.Spotify;

public class ServicoDownload implements IDownload{

    @Override
    public void musicaDownload(String nome, String id, String tipoUsuario) {
        System.out.println(nome + ", id:" + id + " é usuário " + tipoUsuario + ". Download permitido." );
    }
}
