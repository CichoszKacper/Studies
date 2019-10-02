package program3;

import javax.swing.JOptionPane;

public class VariationOfProgram2 {

	public static void main(String[] args) {
		int counter = 0;
		int howManyStudents = 10;
		int studentsWhoPassed = 0;
		int studentsWhoFailed = 0;
		int scoreToPass = 50;
		int smallestPossibleMark = 0;
		int highestPossibleMark = 100;
		String output;
		while(counter<howManyStudents){
			String score = JOptionPane.showInputDialog("Enter student score: ");
			int studentScore = Integer.parseInt(score);
			if(studentScore < smallestPossibleMark || studentScore>highestPossibleMark){
				output = "You entered invalid number";
				JOptionPane.showMessageDialog(null, output);		
			}else{
				if(studentScore>scoreToPass){
					studentsWhoPassed++;
					counter++;
				} else if(studentScore<scoreToPass){
					studentsWhoFailed++;
					counter++;
				}
			}
		}
		output = "The number of students who passed exam is: " + studentsWhoPassed + 
				"\nThe number of students who failed exam is: " + studentsWhoFailed;
		JOptionPane.showMessageDialog(null, output);
	}

}
