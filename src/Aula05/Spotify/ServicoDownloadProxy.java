package Aula05.Spotify;

public class ServicoDownloadProxy implements IDownload{

    @Override
    public void musicaDownload(String nome, String id, String tipoUsuario) {

        if (tipoUsuario.equalsIgnoreCase("premium")) {
            ServicoDownload servicoDownload = new ServicoDownload();
            servicoDownload.musicaDownload(nome, id, tipoUsuario);
            System.out.println("Efetuando o download...");
        } else {
            System.out.println(nome+", você não possui privilégios para fazer o download da música. Atualize seu plano para Premium.");
        }
    }
}
