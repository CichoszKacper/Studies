package jukeBox;

import java.util.Collection;
import java.util.LinkedList;

public class JukeBox {
	private LinkedList <Song> JukeBox = new LinkedList <Song> ();
	
	public void add(Song s){
		this.JukeBox.add(s);
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
}
