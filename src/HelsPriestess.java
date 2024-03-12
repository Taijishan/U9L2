public class HelsPriestess extends Character{
    private int healingLvl;
    private int necromancyLvl;

    public HelsPriestess(String name, int level, String gender, boolean PKer, int healingLvl, int necromancyLvl) {
        super(name, level, gender, PKer);
        this.healingLvl = healingLvl;
        this.necromancyLvl = necromancyLvl;
    }

    public int getHealingLvl() {
        return healingLvl;
    }

    public int getNecromancyLvl() {
        return necromancyLvl;
    }
    public void pray(){
        String blessing = "";
        int rand = (int)(Math.random()*3);
        if(rand == 0){
            blessing = "Your prayers weren't sincere enough";
        } else if (rand == 1) {
            healingLvl++;
            blessing = "The goddess has granted you a blessing.";
        }
        else {
            necromancyLvl++;
            blessing ="The goddess has granted you strength.";
        }
        System.out.println(blessing);
    }
}
