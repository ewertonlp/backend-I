import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void MaiorDeIdade() {
        Person user = new Person("Ewerton","Lopes", "teste@teste.com", 40);
        Person user2 = new Person("Joao", "Gordo", "joao@gordo.com", 17);

        boolean maiorDeIdade = user.maiorDeIdade();

        assertEquals(true, user.maiorDeIdade());
        assertFalse(maiorDeIdade);

    }

}