public class Player {
    private int exp = 0;
    private String name;
    private int level = 1;
    private int health = 100;
    private int money = 0;
    private double threshold = 20;
    private boolean hasItem = false;

    public Player(String name) {
        //setName(name);
        this.name = name;
    }

    public int getExp() {
        return this.exp;
    }
    public String getName() {
        return this.name;
    }
    public int getLevel() {
        return this.level;
    }
    public int getHealth() {
        return this.health;
    }
    public int getMoney() {
        return this.money;
    }
    public double getThreshold() {
        return this.threshold;
    }
    public boolean getHasItem() {
        return this.hasItem;
    }
    public void setExp(int myExp) {
        this.exp = myExp;
    }
    public void setName(String myName) {
        this.name = myName;
    }
    public void setLevel(int myLevel) {
        this.level = myLevel;
    }
    public void setHealth(int myHealth) {
        this.health = myHealth;
    }
    public void setMoney(int myMoney) {
        this.money = myMoney;
    }
    public void setThreshold(double myThreshold) {
        this.threshold = myThreshold;
    }
    public void setHasItem(boolean myHasItem) {
        this.hasItem = myHasItem;
    }
    public void battle() {
        int damage = 100 - level;
        setHealth(health - damage);
        if(health > 0) {
            setExp(exp + 20);
            setMoney(money + 500);
            if(exp >= threshold && level <= 100) {
                setLevel(level + 1);
                setThreshold(threshold * 1.5);
            }
            System.out.println("YOU WON!");
            System.out.println("you have: ");
            System.out.println(health + " health left");
            System.out.println(exp + " exp");
            System.out.println(money + " money");
            System.out.println(level + " levels");
        } else {
            System.out.println("YOU DIED");
            System.out.println("GAME OVER");
        }
    }
    public void buyItem() {
        if(money >= 500 && !hasItem) {
            System.out.println("YOU BOUGHT AN ITEM!");
            setHasItem(true);
            setMoney(money - 500);
        } else {
            System.out.println("You have either insufficient funds or already have an item");
        }
    }
    public void heal() {
        int amountToHeal = 100 - health;
        if(hasItem && health < 100) {
            System.out.println("YOU'RE HEALTHY AGAIN!");
            setHealth(health + amountToHeal);
            setHasItem(false);
        } else {
            System.out.println("Your already at full or dont have an item");
        }
    }
    public void stats() {
        System.out.println(getName());
        System.out.println("current health: " + getHealth());
        System.out.println("level: " + getLevel());
        System.out.println("exp: " + getExp());
        System.out.println("money: " + getMoney());
        System.out.println("exp for level up: " + getThreshold());
        if(getHasItem()) {
            System.out.println("item slot: occupied");
        } else {
            System.out.println("item slot: empty");
        }
    }
}
