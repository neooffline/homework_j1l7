package ru.neooffline.homework_j1l7;

public class Plate {
    private int food;
    public Plate(int food){
        this.food = food;
    }
    public void plateInfo(){
        System.out.println("Еды в тарелке осталось - " + food);
    }
    public void decreaseFood(int portion) {
        food -=portion;
    }
    public int getFood(){
        return food;
    }
    public void increaseFood(int addactiveEat){
        food += addactiveEat;
    }
}
