import javax.swing.*;
import java.io.Serializable;

public class Check implements Serializable {
    private Grid grid;
    private boolean finish = false;

    private String mainGrid[][];

    public Check(Grid aGrid) {

        this.grid = aGrid;

        this.mainGrid = this.grid.getGrid();
    }

    public boolean invalidColumn(int column) {

        int count = 0;

        for (int j = this.mainGrid.length - 1; j >= 0; j--) {

            if (!this.mainGrid[j][column - 1].equals(String.valueOf(Character.toChars(0x25A0)))) {
                count = count + 1;
            }
        }

        if (count == this.mainGrid.length) {
            return true;
        }

        return false;
    }

    public void verifyDraw(int totalMoves) {

        int total = this.grid.getColumn() * this.grid.getRows();

        if (totalMoves == total) {
            print("No winner!\n\nGame Over");
            finish = true;
        }
    }

    public void checkingIfConnectedHorizontal(int userInput, String player, String playerName) {

        for (int rows = 0; rows < this.mainGrid.length; rows++) {

            int count = 0;
            int userColumn = userInput;

            //HORIZONTAL.
            while (userColumn < grid.getRows() && mainGrid[rows][userColumn].equals(player)) {
                count++;
                userColumn++;
            }
            userColumn = userInput - 1;

            while (userColumn >= 0 && mainGrid[rows][userColumn].equals(player)) {
                count++;
                userColumn--;
            }

            checkResult(count, playerName);
        }
    }
    public void checkingIfConnectedVertical(int userInput, String player, String playerName) {
        for (int rows = 0; rows < this.mainGrid.length; rows++) {
            //VERTICAL.
            int count = 0;
            int rowsForLoop = rows;
            while (rowsForLoop < grid.getRows() && this.mainGrid[rowsForLoop][userInput - 1].equals(player)) {
                count++;
                rowsForLoop++;
            }

            checkResult(count, playerName);
        }
    }
    public void checkingIfConnectedDiagonal(int userInput, String player, String playerName) {
        for (int rows = 0; rows < this.mainGrid.length; rows++) {
            //LEADING DIAGONAL.
            int count = 0;
            int userColumn = rows;
            int rowsForLoop = userInput - 1;
            while (userColumn < grid.getRows() && rowsForLoop >= 0 && this.mainGrid[userColumn][rowsForLoop].equals(player)) {
                count++;
                userColumn++;
                rowsForLoop--;
            }
            userColumn = rows - 1;
            rowsForLoop = (userInput - 1) + 1;
            while (userColumn >= 0 && rowsForLoop < grid.getColumn() && this.mainGrid[userColumn][rowsForLoop].equals(player)) {
                count++;
                userColumn--;
                rowsForLoop++;
            }

            checkResult(count, playerName);
        }
    }
    public void checkingIfConnectedOtherWayDiagonal(int userInput, String player, String playerName) {
        for (int rows = 0; rows < this.mainGrid.length; rows++) {
            //SECONDARY DIAGONAL.
            int count = 0;
            int userColumn = rows;
            int rowsForLoop = userInput;
            while (userColumn < grid.getRows() && rowsForLoop < grid.getColumn() && this.mainGrid[userColumn][rowsForLoop].equals(player)) {
                count++;
                userColumn++;
                rowsForLoop++;
            }
            userColumn = rows - 1;
            rowsForLoop = userInput - 1;
            while (userColumn >= 0 && rowsForLoop >= 0 && this.mainGrid[userColumn][rowsForLoop].equals(player)) {
                count++;
                userColumn--;
                rowsForLoop--;
            }

            checkResult(count,playerName);
        } // end loop
    }


    public void checkResult(int count, String player) {

        int total = 4;

        if (count == total) {
            print(player + " wins!\n\nGame Over!\n\n\n" + this.grid.displayGrid());
            finish = true;
        }

    }

    public boolean getFinish (){
        return finish;
    }


    public void print(String output) {
        JOptionPane.showMessageDialog(null,output,"Player name", JOptionPane.PLAIN_MESSAGE);
    }
}
