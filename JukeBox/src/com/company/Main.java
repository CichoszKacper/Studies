package com.company;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        JukeBox jk = new JukeBox();

        Song title1 = new Song("Toto - Africa Love");
        Song title2 = new Song("Rolling Stones - You Can't Always Got What You Love Want");
        Song title3 = new Song("Nick Cave and Bad Seeds - Jubile Street");

        jk.add(title1);
        jk.add(title2);
        jk.add(title3);
        jk.sortList();
        System.out.println("Number of popular songs: " + jk.numberPopular());
        System.out.println("Number of unusual songs: " + jk.numberUnusual());
        jk.size();

        jk.removeSoppySongs();
        jk.printPlayList();
    }
}
