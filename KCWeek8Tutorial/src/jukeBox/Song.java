package jukeBox;

public class Song {
	private String title;
		
	public Song (String s) {
		setSong(s);
	}
	
	public String getSong(){
		return this.title;
	}
		
	public void setSong(String song) {
		this.title = song;
	}
}
