package Collectionsjava;

import java.util.ArrayList;
import java.util.Hashset;

public class ExemploArrayList{
    public static void main(String[] args){
        Hashset<String> listaNomes = new Hashset<>();

        listaNomes.add("TesteUm");
        listaNomes.add("TesteDois");
        listaNomes.add("TesteTres");

        for (String nome : listaNomes){
            System.out.println(nome);
        }
    }

    if(listaNomes.contains("bob")){
        System.out.println("Contem bob");
    }

    listaNomes.remove(listaNomes)

    if(! listaNomes.contains("bob")){
        System.out.println("Nao contem bob");
    }

    listaNomes.isEmpty(){
        System.out.println("Lista de nomes vazia");
    }
}