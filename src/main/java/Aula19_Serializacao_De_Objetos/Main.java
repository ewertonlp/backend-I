package Aula19_Serializacao_De_Objetos;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Fido","Pastor Alemão", 3, "Dir 1");
        Cachorro cachorro2 = new Cachorro("Toby","Labrador", 1, "Dir 2");
        Cachorro cachorro3 = new Cachorro("Bobby","Collie", 7, "Dir 3");
        Cachorro cachorro4 = new Cachorro("Smith","Bull", 4, "Dir 4");

        ArrayList<Cachorro> segunda = new ArrayList<>();
        ArrayList<Cachorro> terca = new ArrayList<>();
        ArrayList<Cachorro> quarta= new ArrayList<>();
        ArrayList<Cachorro> quinta = new ArrayList<>();
        ArrayList<Cachorro> sexta = new ArrayList<>();

        segunda.add(cachorro);
        segunda.add(cachorro2);
        segunda.add(cachorro4);

        terca.add(cachorro2);
        terca.add(cachorro4);
        terca.add(cachorro3);

        quarta.add(cachorro);
        quarta.add(cachorro2);
        quarta.add(cachorro4);

        quinta.add(cachorro2);
        quinta.add(cachorro3);
        quinta.add(cachorro4);

        sexta.add(cachorro);
        sexta.add(cachorro3);
        sexta.add(cachorro4);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("cachorros.datas");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(segunda);
            objectOutputStream.writeObject(terca);
            objectOutputStream.writeObject(quarta);
            objectOutputStream.writeObject(quinta);
            objectOutputStream.writeObject(sexta);

            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
