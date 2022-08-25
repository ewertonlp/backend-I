package Aula05.Spotify;

public class Main {

    public static void main(String[] args) {

        Usuario user1 = new Usuario("Ewerton", "08", "Premium");
        Usuario user2 = new Usuario("Jim Morrison", "12", "Free");
        Usuario user3 = new Usuario("Bob Marley", "420", "Premium");
        Usuario user4 = new Usuario("Bono", "04", "Free");

        IDownload download = new ServicoDownloadProxy();

        download.musicaDownload(user1.getNome(), user1.getId(), user1.getTipoUsuario());
        download.musicaDownload(user2.getNome(), user2.getId(), user2.getTipoUsuario());
        download.musicaDownload(user3.getNome(), user3.getId(), user3.getTipoUsuario());
        download.musicaDownload(user4.getNome(), user4.getId(), user4.getTipoUsuario());

    }
}
