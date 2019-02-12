package ru.neooffline.homework_j1l7;

public class Human {
    private int additiveEat;
    private int additiveWater;
    public Human(int additiveEat, int additiveWater){
        this.additiveEat = additiveEat;
        this.additiveWater = additiveWater;
    }
    public void addEatToPlata(Plate p){
        p.increaseFood(additiveEat);
    }

}
