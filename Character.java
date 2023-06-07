
public class Character {
    private String name;
    private int health;
    private int maxHealth;

    public Character() {
        name = "default";
        health = 100;
        maxHealth = 100;

    }

    public Character(String newName, int newHealth) {
        name = newName;
        health = newHealth;
        maxHealth = newHealth;
    }

    public void printInfo() {
        System.out.println("=== CURRENT STATS ===");
        System.out.println("Name: " + name);
        System.out.println("Health: " + health + "/" + maxHealth);
        System.out.println("=====================");
    }

    public boolean modifyHealth(int amount) {
        if (health <= 0) {
            return false;
        }

        if (health + amount > maxHealth) {
            health = maxHealth;

        } else {
            health += amount;
        }


        return true;
    }


    public String getName() {
        return name;
    }

}
