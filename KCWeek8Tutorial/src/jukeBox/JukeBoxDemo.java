package jukeBox;

import java.util.ArrayList;

public class JukeBoxDemo {

	public static void main(String[] args) {
		JukeBox jk = new JukeBox();
		
		Song title1 = new Song("Toto - Africa");
		Song title2 = new Song("Rolling Stones - You Can't Always Got What You Want");
		Song title3 = new Song("Nick Cave and Bad Seeds - Jubile Street");
		
		jk.add(title1);
		//jk.add(title2);
		//jk.add(title3);
		
		jk.printPlayList();
		jk.play();
		
		ArrayList <Song> moreSongsToAdd = new ArrayList <Song> ();
		moreSongsToAdd.add(title2);
		moreSongsToAdd.add(title3);
		
		jk.addSongs(moreSongsToAdd);
		
		jk.printPlayList();
	}

}
