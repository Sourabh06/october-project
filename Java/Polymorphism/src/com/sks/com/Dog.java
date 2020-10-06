package com.sks.com;

public class Dog extends Animal{
    private String name;

    public void  move() {
        System.out.println("Move!");
    }

    //Override
    public void makeSound() {
        System.out.println("Woof!!");
    }

    public void makeSound(String soundType) {
        System.out.println(soundType);
    }

}
