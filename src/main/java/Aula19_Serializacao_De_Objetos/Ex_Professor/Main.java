package Aula19_Serializacao_De_Objetos.Ex_Professor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Cachorro> cachorros  = new ArrayList<>();

        Cachorro cachorro1 = new Cachorro(3, "Pluto");
        Cachorro cachorro2 = new Cachorro(1, "Snoopy");

        cachorros.add(cachorro1);
        cachorros.add(cachorro2);

        // Salvamos toda a coleção de páginas em um arquivo

        FileOutputStream fo = null;

        try{
            fo = new FileOutputStream("OutputFile.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fo);

            objectOutputStream.writeObject(cachorros);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
            //System.out.println("Error: "+e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Recuperamos toda acoleção com cada uma das páginas do arquivo
        List<Cachorro> cachorros2 = null;

        FileInputStream fi = null;

        try {
            fi = new FileInputStream("OutputFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);

            cachorros2 = (ArrayList)ois.readObject();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (Cachorro cachorro:cachorros2) {
            System.out.println(cachorro.getNome()+ " : "+cachorro.getIdade());
        }

    }
}
