package Aula04_ChainOfResponsability;

public class GerenciadorTecnico extends Gerenciador{

    @Override
    public void verificar(Mail email) {
        if((email.getDestino().equalsIgnoreCase("tecnico@colmeia.com")) || (email.getAssunto().equalsIgnoreCase("Técnico"))) {
            System.out.println("Enviando ao depto Técnico");
        } else {
            if(this.getSeguinte()!=null) {
                // chamamos ao método o seguinte objeto
                this.getSeguinte().verificar(email);
            }
        }
    }
}
