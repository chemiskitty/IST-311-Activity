package activity;

public class Enemy {
    private String name;
    private String species;
    private int power;
    private int health;

    public Enemy(String name, String species, int power, int health) {
        this.name = name;
        this.species = species;
        this.power = power;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getPower() {
        return power;
    }

    public int getHealth() {
        return health;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void updateHealth(int attack){
        health -= attack;
        this.health = health;
    }
}
