package ru.neooffline.homework_j1l7;

public class Cat {
    String name;
    private int appetite;
    private int portion;
    public Cat(String name, int appetite, int portion){
        this.name = name;
        this.appetite = appetite;
        this.portion = portion;
    }
    protected void takePortion(Plate p){
        p.decreaseFood(portion);
        appetite -=portion;
    }
    private boolean isSatisfied(){
        return appetite==0;
    }
}
