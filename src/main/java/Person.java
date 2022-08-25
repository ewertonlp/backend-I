import java.time.LocalDate;

public class Person {

    private String nome;
    private String sobrenome;
    private String email;
    private int idade;

    public Person(String nome, String sobrenome, String email, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String nomeCompleto() {
        String nomeCompleto = this.sobrenome + this.nome;
        return nomeCompleto();
    }

    public boolean maiorDeIdade() {
        if(this.idade < 18) {
            System.out.println("Menor de Idade");
        } else {
            System.out.println("Maior de Idade");
        }
        return true;
    }
}
