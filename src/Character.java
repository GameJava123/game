public class Character {
    public String race;
    public int health =150;
    public int stamina;
    public int magicResistance;


    public int getHealth() {
        return health;
    }

    public int getStamina() {
        return stamina;
    }

    public int getMagicResistance() {
        return magicResistance;
    }

    public String getRace() {
        return race;
    }

    public Character(int health, int stamina, int magicResistance,String race) {
        this.health = health;
        this.stamina = stamina;
        this.magicResistance = magicResistance;
        this.race=race;

    }
}
