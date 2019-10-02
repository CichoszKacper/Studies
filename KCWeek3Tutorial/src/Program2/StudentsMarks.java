package Program2;

import javax.swing.JOptionPane;

public class StudentsMarks {
	public static void main(String[] args) {
		int counter = 0;
		int howManyStudents = 10;
		int studentsWhoPassed = 0;
		int studentsWhoFailed = 0;
		int scoreToPass = 50;
		while(counter<howManyStudents){
			String score = JOptionPane.showInputDialog("Enter student score: ");
			int studentsScore = Integer.parseInt(score);
			if(studentsScore>scoreToPass){
				studentsWhoPassed++;
				counter++;
			} else if(studentsScore<scoreToPass){
				studentsWhoFailed++;
				counter++;
			}
		}
		String output = "The number of students who passed exam is: " + studentsWhoPassed + 
				"\nThe number of students who failed exam is: " + studentsWhoFailed;
		JOptionPane.showMessageDialog(null, output);
	}

}
