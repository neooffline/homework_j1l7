package ru.neooffline.homework_j1l7;

public class Plate {
    private int food;
    public Plate(int food){
        this.food = food;
    }
    public void plateInfo(){
        System.out.println("Еды в тарелке осталось - " + food);
    }
    protected void decreaseFood(int appetite) {
        if(!isLilFood(appetite) && (food-appetite) > 0 ){
            food -=appetite;
        }
    }
    protected int getFood(){
        return food;
    }
    protected boolean isLilFood(int appetite){
        return food<appetite;
    }
    protected void increaseFood(int addactiveEat){
        food += addactiveEat;
    }
}
