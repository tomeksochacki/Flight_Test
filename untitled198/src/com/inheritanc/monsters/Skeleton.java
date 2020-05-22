package com.inheritanc.monsters;

public class Skeleton extends Monster {
    String typeWeapon;

    @Override
    protected void descriptionMonster() {

    }

    public Skeleton(){
        System.out.println("Default constructor from class Skeleton.");
    }

    public Skeleton(double speedMove, double hitPoint){
        super(speedMove, hitPoint);
        System.out.println("Not default constructor from class Skeleton.");

    }

    public Skeleton(double speedMove, double hitPoint, String typeWeapon){
        super(speedMove, hitPoint);
        this.typeWeapon = typeWeapon;
        System.out.println("Not default constructor from class Skeleton.");

    }
}
