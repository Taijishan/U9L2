public class Character {
    private String name;
    private int level;
    private String gender;
    private boolean PKer;

    public Character(String name, int level, String gender, boolean PKer) {
        this.name = name;
        this.level = level;
        this.gender = gender;
        this.PKer = PKer;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }


    public String getGender() {
        return gender;
    }


    public boolean isPKer() {
        return PKer;
    }
    public void lootDrop(){
        int rand = (int)(Math.random()*2);
        if(rand == 0){
            System.out.println("You got afflicted with a curse after killing a faction enemy.");
        }
        else {
            System.out.println("You struck the jackpot! You gained a legendary equipment quest!");
        }
    }
}
