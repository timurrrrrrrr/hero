package com.company;

import Game.Person.Boss;
import Game.Person.Hero;


public class Main {

    public static void main(String[] args) {
        Hero hero1 = new Hero(500, "Magic", "Magical", 50);

        System.out.println(hero1.getHealth() + " " + hero1.getSuperpower() + " " + hero1.getDamage() + " ");
        Hero hero2 = new Hero(500, 50);

        System.out.println(hero2.getDamage() + " " + hero2.getHealth() + " ");

        Boss boss = new Boss(1500,100,"Magic");

        System.out.println(boss.getHealth()+" "+ boss.getDamage()+" "+boss.getDefenstype()+" ");

        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("" +
                    createHeroes()[i].getName() +"\n"+
                    " super power: " + createHeroes()[i].getSuperpower() +"\n"+
                   " Damage " + createHeroes()[i].getDamage() +"\n"+
                   " Hp "+ createHeroes()[i].getHealth());
        }


    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(450, "Physycal", "Berserk", 70);
        Hero hero2 = new Hero(300, "Magic", "Magical", 120);
        Hero hero3 = new Hero(250, "Mental", "Kinetic", 100);

        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;

    }


}
