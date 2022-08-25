package Aula04_ChainOfResponsability;

public abstract class Gerenciador {

    protected Gerenciador gerenciadorSeguinte;

    public Gerenciador getSeguinte() {
        return this.gerenciadorSeguinte;
    }

    public void setSeguinte(Gerenciador m) { // set sempre void (ñ tem retorno)
        this.gerenciadorSeguinte = m;
    }

    public abstract void verificar(Mail elMail);
}
