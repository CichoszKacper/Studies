import java.io.Serializable;

public class Grid implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String grid[][];

    private int rows;
    private int column;

    public Grid(int rows, int columns) {
        this.rows = rows;
        this.column = columns;
        this.grid = new String[rows][columns];
    }

    public String[][] getGrid() {
        return this.grid;
    }

    public void startGrid() {

        for (int rows = 0; rows < this.grid.length; rows++) {
            for (int columns = 0; columns < this.grid[rows].length; columns++) {
                this.grid[rows][columns] = String.valueOf(Character.toChars(0x25A0));
            }
        }
    }

    public void updateGrid (int column, String player) {
        for (int row = this.grid.length - 1; row >= 0; row--) {
            if (this.grid[row][column - 1].equals(String.valueOf(Character.toChars(0x25A0)))) {
                this.grid[row][column - 1] = player;
                break;
            }
        }
    }


    public String displayGrid () {
        String output = "";
        for (int displayHelp = 0; displayHelp <= this.grid.length; displayHelp++) {
            output += displayHelp+1 + " | ";
        }
        output += "\n";


        for (int row = 0; row < this.grid.length; row++) {
            for (int column = 0; column < this.grid[row].length; column++) {
                output += this.grid[row][column] + "  ";
            }

            output += "\n";
        }
        return output;
    }

    public int getRows() {
        return this.rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumn() {
        return this.column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}