package Game.Person;

public class Hero {
    private int health;
    private String superpower;

    public String getName() {
        return this.name;
    }

    private String name;
    private int damage;

    public Hero(int health, String superpower,String name, int damage) {
        this.health = health;
        this.superpower = superpower;
        this.damage = damage;
        this.name=name;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public Hero() {
    }


    public int getDamage() {
        return this.damage;
    }

    public String getSuperpower() {
        return this.superpower;
    }

    public int getHealth() {
        return this.health ;
    }


}
