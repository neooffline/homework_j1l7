package ru.neooffline.homework_j1l7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int status = 0;
        Plate plate = new Plate(18);
        Cat cat1 = new Cat("SnowIce", 12);
        Cat cat2 = new Cat("FireStrike", 12);
        Human human = new Human(4);
//        human.addEatToPlata(plate);
        Cat[] cats = {cat1, cat2};
        while (status != 15){
            for (Cat element : cats
                    ) {
                if (!element.isSatisfied()){
                    element.haveSameEat(plate);
                    if (!element.isCanEat(plate)){
                        System.out.printf("Положить еще еды (1-да)? Человек может положить - %d\n",
                                human.additiveEat);
                        if(Integer.parseInt(scanner.next())==1){
                            human.addEatToPlata(plate);
                        }else break;
                    } else break;
                } else {
                    status++;
                }
            }
        }
    }
}
