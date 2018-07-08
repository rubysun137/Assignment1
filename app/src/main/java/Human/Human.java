package Human;

import java.util.Random;

public class Human {


/*	String[] jobs = {"Warrior","Hunter","Mage"};
	String[] weapons = {"Blade","Bow","Staff"};
	String[] weaponTypes = {"Default","Fire","Ice"};
	String[][] skills = {{"Slash","Fire Slash","Ice Slash"},
			{"Arrow","Fire Arrow","Ice Arrow"},
			{"Arcane Missiles","Fireball","Frostbolt"}};



	private int jobsNum;//Warrior=0;Hunter=1;Mage=2;
	private int weaponTypesNum;//Default=0;Fire=1;Ice=2;     */

    private String name;
    public void setName(String name) {

        this.name = name;
    }
    public String getName() {
        return name;
    }

    public Human() {

    }

    public final static int FIRE_BOW = 1;   //???
    public final static int ICE_BOW = 2;

    public final String[] jobs = {"Warrior","Hunter","Mage"};
    public String getJob() {
        Random random = new Random();
        return jobs[random.nextInt(jobs.length)];
    }

    public final String[] weaponTypes = {"Default","Fire","Ice"};

    public void checkJob(){
        if (getJob() == "Warrior"){
            Warrior warrior = new Warrior(0);
        }
        if(getJob() == "Hunter"){
            Hunter hunter = new Hunter(1);
        }
        if(getJob() == "Mage"){
            Mage mage = new Mage(2);
        }
    }





    public void attack() {
        System.out.println("Fist Attack!");
    }



}
