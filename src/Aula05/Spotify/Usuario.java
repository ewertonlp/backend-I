package Aula05.Spotify;

public class Usuario {

    private String nome;
    private String id;
    private String tipoUsuario;

    public Usuario(String nome, String id, String tipoUsuario) {
        this.nome = nome;
        this.id = id;
        this.tipoUsuario = tipoUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", id='" + id + '\'' +
                ", tipoUsuario='" + tipoUsuario + '\'' +
                '}';
    }
}
