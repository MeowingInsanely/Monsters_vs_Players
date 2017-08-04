package org.cat.role;

import sun.util.resources.cldr.ta.CalendarData_ta_IN;

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
        };

    }
}
