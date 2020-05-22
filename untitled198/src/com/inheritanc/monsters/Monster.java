package com.inheritanc.monsters;

public abstract class Monster {
    protected double speedMove;
    protected double hitPoint;

    protected void attack(){
        /*
        /   DEFAULT IMPEMENTATION ATTACK
        */

        System.out.println("This is attack from class Monster.");
    }

    protected abstract void descriptionMonster();

    public Monster (){
        System.out.println("Default constructor from class Monster.");
    }

    public Monster(double speedMove, double hitPoint){
        this.speedMove = speedMove;
        this.hitPoint = hitPoint;
        System.out.println("This is not default constructor from class Monster");
    }
}
