package ru.neooffline.homework_j1l7;

public class Main {

    public static void main(String[] args) {
	 Plate plate = new Plate(15);
	 Cat cat1 = new Cat("SnowIce", 12,3);
	 Cat cat2 = new Cat("FireStrike",7,2);
	 Human human = new Human(4,3);
	 plate.plateInfo();
	 cat1.takePortion(plate);
	 cat2.takePortion(plate);
//	 human.addEatToPlata(plate);
	 plate.plateInfo();
	 cat1.takePortion(plate);
    }
}
