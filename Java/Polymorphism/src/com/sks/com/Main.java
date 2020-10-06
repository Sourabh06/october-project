package com.sks.com;

public class Main {

    public static void main(String[] args) {

        Vet myVet = new Vet();

        Cat myCat = new Cat();
        Dog myDog = new Dog();

        myVet.giveShot(myCat);
        myVet.giveShot(myDog);

//        myDog.makeSound();
//        myDog.makeSound("woof");
//        myDog.makeSound("Woof!", "Very Loud");
//        myDog.move();
//        myDog.makeSound();
//        myDog.makeSound("another Woof");

    }
}
