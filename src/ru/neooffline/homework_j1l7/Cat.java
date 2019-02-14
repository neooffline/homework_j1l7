package ru.neooffline.homework_j1l7;

public class Cat {
    String name;
    private int appetite;
    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
    }
    protected void haveSameEat(Plate p){
        if (isCanEat(p) && appetite >= 0) {
            p.decreaseFood(appetite);
            appetite-=appetite;
            if (isSatisfied()) {
                System.out.printf("%s наелся, спасибо\n", name);
            } else {
                System.out.println(name + " appetite = " + appetite);
            }
        } if (!isCanEat(p)){
                System.out.printf("В миске мало еды...%s не будет есть, " +
                        "животному требуется еще %d, а миске осталось %d\n",
                        name,appetite,p.getFood());
        }
        }
    protected boolean isCanEat(Plate p){
        return appetite <= p.getFood();
    }
    protected boolean isSatisfied(){
        return appetite == 0;
    }
}
