package Flowers;

import java.util.ArrayList;
import java.util.List;

public class Bouqet {
    private List<Flower> flowers =new ArrayList<>();

    public void addFlower(Flower flower){
      flowers.add(flower);

    }
    public void sortFlower(Flower flower){
        List<Flower> flowerList = new ArrayList<>(List.of());
        flowerList.stream().filter(x->x.getStalkLength()>=50).forEach(System.out::println);
        ;
    }


}
