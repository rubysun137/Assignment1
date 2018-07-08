package Human;


public class Warrior extends Human {


    private String weapon = "Blade";
    private String[] skills = {"Slash","Fire Slash","Ice Slash"};
    private int weaponTypeNum;

    public Warrior (int weaponTypeNum) {
        this.weaponTypeNum = weaponTypeNum;

        System.out.printf("Hi! %s. %nYour job is %s and your weapon is %s %s%n",
                            getName(),getJob(),weaponTypes[weaponTypeNum],weapon);
    }

    public void attack() {

        System.out.printf("%s Attack!%n",skills[weaponTypeNum]);
    }

}
