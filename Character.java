package activity;

public class Character {
    private String name;
    private String gender;
    private String type;
    private int power;
    private int health;

    public Character(String name, String gender, String type, int power, int health) {
        this.name = name;
        this.gender = gender;
        this.type = type;
        this.power = power;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getType() {
        return type;
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
