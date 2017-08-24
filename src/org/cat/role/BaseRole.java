package org.cat.role;


import org.cat.role.mobs.Ocelot_SerialKiller;
import org.cat.role.monsters.Creeper_Leaderp;
import org.cat.role.monsters.Skeleton_ContractKiller;
import org.cat.role.villagers.Librarian_Doctor;


public abstract class BaseRole {

    private String lastWill;



    //Also, add a bunch of events
    //Meaning: Functions that get called when something happens.
    public void onTrial() {

    }

    public void onDeath() {

    }



    public String getLastWill(){
        return lastWill;
    }

    public void setLastWill(String newLastWill) {
        lastWill = newLastWill;
    }

    //This means that every role HAS TO have a getHelp function
    public abstract String getHelp();


    /**
     * Register all the classes here
     */
    public static Class<BaseRole>[] getRoles() {
        return new Class[] {
                Ocelot_SerialKiller.class,
                Creeper_Leaderp.class,
                Skeleton_ContractKiller.class,
                Librarian_Doctor.class

        };

    }
}
