public class Player{
    private String name;
    private int health;
    private int mana;

    public Player(String name, int health, int mana){
        this.name = name;
        this.health = health;
        this.mana = mana;
    }

    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }
}
