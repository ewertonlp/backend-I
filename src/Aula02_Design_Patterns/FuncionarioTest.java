package Aula02_Design_Patterns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void Calculos() {
        Funcionario funcionario = new Efetivo("Ewerton", "Lopes", "1234567890", 10000.0, 1.0, 5000.0);
        funcionario.pagamentoSalario();

        funcionario = new Contratado("Issau", "Takeuchi", "1234567891", 1000.0, 40);
        funcionario.pagamentoSalario();

    }

}