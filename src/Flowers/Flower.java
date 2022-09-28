package Flowers;

import java.util.Comparator;
import java.util.Random;

public class Flower {
    private String name;
    private int freshness;
    private int StalkLength;
    private int price;
    private Freshness fr;
    private double diameter;

    public Flower(String name) {

        Random random = new Random();
        this.name = name;
        this.price = random.nextInt(250, 400);
        this.freshness = random.nextInt(25, 40);
        this.StalkLength=random.nextInt(10,80);
        this.diameter=random.nextInt(30,120);
        switch (random.nextInt(1, 4)) {
            case 1 -> fr = Freshness.OLDFRESH;
            case 2 -> fr = Freshness.FULLFREHNESS;
            case 3 -> fr = Freshness.MILDDLEFRESH;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    public int getStalkLength() {
        return StalkLength;
    }

    public void setStalkLength(int stalkLength) {
        StalkLength = stalkLength;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Freshness getFr() {
        return fr;
    }

    public void setFr(Freshness fr) {
        this.fr = fr;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", freshness=" + freshness +
                ", StalkLength=" + StalkLength +
                ", price=" + price +
                ", fr=" + fr +
                ", diameter=" + diameter +
                '}';
    }
}