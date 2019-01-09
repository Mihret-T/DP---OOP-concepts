package com.company;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Properties courses = new Properties();
        Set name;
        String str;

        courses .put("DP", "Design Pattern");
        courses .put("DSP", "Distributed System Programming");
        courses .put("DBA", "Database Administration");
        courses .put("ITS", "IT Security ");
        courses .put("GIS", "Geographical information system");

        // Show all states and capitals in hashtable.
        name = courses.keySet();   // get set-view of keys
        Iterator itr = name.iterator();

        while(itr.hasNext()) {
            str = (String) itr.next();
            System.out.println(str + " = " +
                    courses.getProperty(str) + ".");
        }

        Set set = courses.stringPropertyNames();
        System.out.print("\nproperty name in the set " + set);


    }
}
