package person1;

import javax.swing.JOptionPane;

public class Rectangle {
	
	private int height;
	private int width;
	static int counter;
	
	public Rectangle(){
		this(1,1);
	}
	
	
	public Rectangle (int height, int width ){
		setHeight(height);
		setWidth(width);
		counter++;
	}
	
	public String toString(){
		String output = "";
	
		return output;
	}
	
	public boolean isSquare(){
		if(this.height == this.width){
			return true;
		}else{
			return false;
		}
	}

	public void increaseHeightBy(int increaser){
		this.height += increaser;
	}
	
	public void increaseWidthtBy(int increaser){
		this.width += increaser;
	}
	
	public void increaseBy (int heightIncreaser, int widthIncreaser){
		this.height += heightIncreaser;
		this.width += widthIncreaser;
	}
	
	public int getArea (){
		return this.height * this.width;
	}
	
	public int getPerimeter(){
		return (this.height*2)+(this.width*2);
	}
	
	
	public int getHeight(){
		return this.height;
	}
	public int getWidth(){
		return this.width;
	}
	public void setHeight(int height){
		this.height = height;
	}
	
	public void setWidth(int width){
		this.width = width;
	}
	
	
	public static void print(String output) {
		JOptionPane.showMessageDialog(null, output);
	}//end print
	
	public static int input(String name) {
		int result = Integer.parseInt((JOptionPane.showInputDialog(name)));
		return result;
	}//end input		
}
