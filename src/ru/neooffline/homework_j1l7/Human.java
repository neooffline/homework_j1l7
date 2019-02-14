package ru.neooffline.homework_j1l7;

public class Human {
    protected int additiveEat;
    public Human(int additiveEat){
        this.additiveEat = additiveEat;
    }

    public void addEatToPlata(Plate p) {
        p.increaseFood(additiveEat);
    }


}
