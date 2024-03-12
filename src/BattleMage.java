public class BattleMage extends Character{
    private int magicLvl;
    private int swordQuality;

    public BattleMage(String name, int level, String gender, boolean PKer, int magicLvl, int swordQuality) {
        super(name, level, gender, PKer);
        this.magicLvl = magicLvl;
        this.swordQuality = swordQuality;
    }

    public int getMagicLvl() {
        return magicLvl;
    }

    public String getSwordQuality() {
        return "This is a level " + swordQuality + " sword.";
    }
    public void train(){
        magicLvl++;
        System.out.println("You have trained earnestly and increased your level. Your new magic level is: " + magicLvl);
    }
}
