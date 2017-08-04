package org.cat.role;

import org.cat.role.mobs.Ocelot_SerialKiller;
import org.cat.role.monsters.Creeper_Leaderp;
import org.cat.role.monsters.Skeleton_ContractKiller;

public class BaseRole {

    String lastWill;


    //Also, add a bunch of "Hooks".
    //Meaning: Functions that get called when something happens.
    public void OnTrial() {

    }

    public void DeathHook() {

    }

    /**
     * Register all the classes here
     */
    public static Class<BaseRole>[] getRoles() {
        return new Class[] {
                Ocelot_SerialKiller.class
                Creeper_Leaderp.class
                Skeleton_ContractKiller.class
        };

    }
}
