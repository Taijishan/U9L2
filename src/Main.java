public class Main {
    public static void main(String[] args) {
        Character myChar = new Character("Reinhart", 917, "male", true);
        System.out.println(myChar.isPKer());
        System.out.println(myChar.getLevel());
        System.out.println(myChar.getGender());
        System.out.println(myChar.getName());
        myChar.lootDrop();
        BattleMage mage = new BattleMage("Reinhart", 888, "male", false, 848, 35);
        System.out.println(mage.getMagicLvl());
        System.out.println(mage.getSwordQuality());
        System.out.println(mage.isPKer());
        System.out.println(mage.getLevel());
        System.out.println(mage.getGender());
        System.out.println(mage.getName());
        mage.train();
        HelsPriestess saintess = new HelsPriestess("Erina", 666, "female", true, 222, 444);
        System.out.println(saintess.getNecromancyLvl());
        System.out.println(saintess.getHealingLvl());
        System.out.println(saintess.isPKer());
        System.out.println(saintess.getLevel());
        System.out.println(saintess.getGender());
        System.out.println(saintess.getName());
        saintess.pray();
    }
}
