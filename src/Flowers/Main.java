package Flowers;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Flower rose = new Flower("Rose1");


        Flower lily = new Flower("Lily");

        Flower lotus = new Flower("Lotus");

        Flower peony = new Flower("Peony");

        List<Flower> flowerList = new ArrayList<>(List.of(rose,lotus,lily,peony));
        flowerList.stream().filter(x->x.getDiameter()>=50).forEach(System.out::println);



    }
}
