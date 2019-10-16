package program4;

import javax.swing.JOptionPane;

public class calcalateGrade {

	public static void main(String[] args) {
		int userScore = input("Enter a score: ");
		String output = "Your grade is " + calculateGrade(userScore);
		print(output);
	}
	
	public static char calculateGrade(int mark) {	
		int gradeA = 75;
		int gradeB = 60;
		int gradeC = 50;
		char A = 'A';
		char B = 'B';
		char C = 'C';
		char F = 'F';
		
		int correctMark = validateScore(mark);
		
		if(correctMark>gradeA){
			return A;
		}else if(correctMark>gradeB){
			return B;
		}else if(correctMark>gradeC){
			return C;
		}else{
			return F;
		}//end if statement			 	
	}//end calculateGrade
	
	public static int validateScore(int score) {
		String output;
		int minScore = 0;
		int maxScore = 100;
		while(score<minScore || score>maxScore){
			output = "Your score is not valid. Enter your score again.";
			print(output);
			score = input("Enter a score: ");
		}//end while loop
		return score;
	}//end validateScore
	
	public static void print(String output) {
		JOptionPane.showMessageDialog(null, output);
	}//end print
	
	public static int input(String name) {
		int result = Integer.parseInt((JOptionPane.showInputDialog(name)));
		return result;
	}//end input
}
