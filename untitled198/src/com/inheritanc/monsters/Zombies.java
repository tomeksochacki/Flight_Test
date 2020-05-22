package com.inheritanc.monsters;

public class Zombies extends Monster {
    String typeWeapon;

    @Override
    protected void descriptionMonster() {

    }

    public Zombies(){
        System.out.println("Default constructor from class Zombies");
    }

    public Zombies(double speedMove, double hitPoint){
        super(speedMove, hitPoint);
        System.out.println("This is not default constructor from class Zombies with two arguments");
    }

    public Zombies(double speedMove, double hotPoint, String typeWeapon){
        super(speedMove, hotPoint);
        this.typeWeapon = typeWeapon;
        System.out.println("This is not default constructor from class Zombies");
    }
}
