package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.TreeSet;

public class JukeBox {
    private LinkedList <Song> JukeBox = new LinkedList <Song> ();


    public void add(Song song){
        this.JukeBox.add(song);
    }

    public void play(){
        System.out.println(this.JukeBox.removeFirst().getSong());
    }

    public void printPlayList(){
        for(Song tempTitle : JukeBox){
            System.out.println(tempTitle.getSong());
        }
    }

    public void size(){
        System.out.println(this.JukeBox.size());
    }

    public void addSongs(Collection <Song> songs){
        this.JukeBox.addAll(songs);
    }

    public void sortList (){
        TreeSet <Song> songsSorted = new TreeSet<Song>();
        for (Song tempSong : JukeBox){
            songsSorted.add(tempSong);
        }
        JukeBox.clear();
        for (Song tempSong : songsSorted){
            JukeBox.add(tempSong);
        }
    }
    public void reverseSort (){
        TreeSet <Song> songsSorted = new TreeSet<Song>();
        for (Song tempSong : JukeBox){
            songsSorted.add(tempSong);
        }
        JukeBox.clear();
        for (Song tempSong : songsSorted){
            JukeBox.addFirst(tempSong);
        }
    }

    public int numberPopular(){
        int counter = 0;
        for (Song tempSong : JukeBox){
            for (PopularSongTitleWords tempWord : PopularSongTitleWords.values()){
                if (tempSong.getSong().toLowerCase().contains(tempWord.toString())){
                    counter++;
                }
            }
        }
        return counter;
    }

    public int numberUnusual() {
        int counterOfUnusualSongs = JukeBox.size() - numberPopular();
        return counterOfUnusualSongs;
    }

    public void removeSoppySongs (){
        String soppyWord = "love";
        ArrayList <Song> songsToRemove = new ArrayList<Song>();

        for (Song tempSong : this.JukeBox) {
             try {
                 if (tempSong.getSong().toLowerCase().contains(soppyWord)) {
                     songsToRemove.add(tempSong);
                     throw new NoSoppyLoveSongs();
                 }
             }catch (NoSoppyLoveSongs e){
                 System.out.println(e.toString());
             }
        }

       for (Song tempSong : songsToRemove){
           this.JukeBox.remove(tempSong);
       }
    }

    public LinkedList<Song> getJukeBox() {
        return this.JukeBox;
    }
}

