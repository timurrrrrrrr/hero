package Game.Person;

public class Boss {
    private int health;
    private int damage;
    private String defenstype;

    public Boss(){}

    public Boss(int health, int damage, String defenstype) {
        this.health = health;
        this.damage = damage;
        this.defenstype = defenstype;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDefenstype() {
        return defenstype;
    }

    public void setDefenstype(String defenstype) {
        this.defenstype = defenstype;
    }
}
