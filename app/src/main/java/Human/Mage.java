package Human;


public class Mage extends Human {

    private String weapon = "Staff";
    private String[] skills = {"Arcane Missiles","Fireball","Frostbolt"};
    private int weaponTypeNum;

    public Mage (int weaponTypeNum) {
        this.weaponTypeNum = weaponTypeNum;

        System.out.printf("Hi! %s. %nYour job is %s and your weapon is %s %s%n",
                getName(),getJob(),weaponTypes[weaponTypeNum],weapon);
    }

    public void attack() {

        System.out.printf("%s Attack!%n",skills[weaponTypeNum]);
    }

}
