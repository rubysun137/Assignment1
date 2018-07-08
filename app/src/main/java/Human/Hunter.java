package Human;


public class Hunter extends Human {

    private String weapon = "Bow";
    private String[] skills = {"Arrow","Fire Arrow","Ice Arrow"};
    private int weaponTypeNum;

    public Hunter (int weaponTypeNum) {
        this.weaponTypeNum = weaponTypeNum;

        System.out.printf("Hi! %s. %nYour job is %s and your weapon is %s %s%n",
                getName(),getJob(),weaponTypes[weaponTypeNum],weapon);
    }

    public void attack() {

        System.out.printf("%s Attack!%n",skills[weaponTypeNum]);
    }

}
