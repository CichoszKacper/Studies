import javax.swing.*;
import java.io.*;

public class Game implements Serializable{
    private Grid grid;
    private User[] users;
    private int userInput;
    private Check check;
    private boolean runGame = true;
    private final int ROWS = 6;
    private final int COLUMNS = 7;
    private int totalMoves = 0;

    public Game() {
        users = new User[2];
        grid = new Grid(this.ROWS, this.COLUMNS);
        check = new Check(grid);
        for (int i = 0; i < users.length; i++) {

            users[i] = new User();
        }

    }//end of Game

    public void menu() throws IOException, ClassNotFoundException {

        String output = "Welcome to Connect Four game\n\n\n";

        JLabel newOutput = new JLabel(output,SwingConstants.CENTER);

        int playAgain;

        ImageIcon icon = new ImageIcon(Game.class.getResource("/connectFour.png"));

        Object[] options = {"Play game", "Load game", "Exit game"};
        int userChoice = JOptionPane.showOptionDialog(null,newOutput,"Connect Four",JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE,icon,options,options[0]);
        if (userChoice==0){
            run();
            playAgain = JOptionPane.showConfirmDialog(null,"Do you want to come back to main menu?","Connect Four", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null);
            if (playAgain==0){
                check.getFinish();
                menu();
            }
            else {
                System.exit(0);
            }
        }

        else if (userChoice==1){
            loadGameDataFromFile();
        }
        else {
            System.exit(0);
        }
    }

    public void run() throws IOException, ClassNotFoundException {

        initPlayers();
        grid.startGrid();
        grid.displayGrid();


        while (runGame) {

            processChecks();
            userInputTurn(users[0].getName(),users[0].getType());
            this.totalMoves = this.totalMoves + 1;

            if (check.getFinish()){
                break;
            }

            processChecks();
            userInputTurn(users[1].getName(),users[1].getType());
            this.totalMoves = this.totalMoves + 1;

            if (check.getFinish()){
                break;
            }
        }
    }//end of run

    public void processChecks() {
        grid.displayGrid();
        check.verifyDraw(this.totalMoves);
    }//end of processChecks


    private void userInputTurn(String playerName, String gridInput) throws IOException, ClassNotFoundException {

        while (true) {
            String input = String.format("Player: %s\n%s\n\nPlease enter a column number between 1 to %s" +
                    "\nin which you want to place the disc.", playerName, grid.displayGrid(), COLUMNS);
            Object[] choicesOfColumns = {1,2,3,4,5,6,7,"Save game", "Exit"};
            userInput = JOptionPane.showOptionDialog(null,input,"Connect Four", JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE,null,choicesOfColumns,choicesOfColumns[0]);
            userInput++;
            if(userInput==9){
                menu();
            }
            else if(userInput==8) {
                saveGameDataToFile();
            }
            else {
                grid.updateGrid(userInput, gridInput);
                check.checkingIfConnectedHorizontal(userInput, gridInput, playerName);
                check.checkingIfConnectedVertical(userInput, gridInput, playerName);
                check.checkingIfConnectedDiagonal(userInput, gridInput, playerName);
                check.checkingIfConnectedOtherWayDiagonal(userInput, gridInput, playerName);
                break;
            }//end of if statement
        }//end of while loop
    }//end of userInputTurn

    private void initPlayers() {

        while (true) {

            users[0].setType("P1");
            users[0].setName(inputStr("Player 1 please enter your name?"));

            users[1].setType("P2");
            users[1].setName(inputStr("Player 2 please enter your name?"));


            if (users[0].getName().length() > 0 && users[1].getName().length() > 0) {
                break;
            }
        }
    }

    private void saveGameDataToFile() throws IOException {
        ObjectOutputStream fileStream = new ObjectOutputStream(new FileOutputStream("savegame.txt"));
        fileStream.writeObject(grid);
        fileStream.close();
        System.out.println("Done writing");
    }

    private void loadGameDataFromFile() throws IOException, ClassNotFoundException {
        ObjectInputStream file = new ObjectInputStream(new FileInputStream("savegame.txt"));
        Grid g = (Grid) file.readObject();
        System.out.println(file.toString());
        System.out.println("done loading");
        file.close();

    }

    public String inputStr(String input) {
        return JOptionPane.showInputDialog(null,input,"Player name", JOptionPane.PLAIN_MESSAGE);
    }


    public void print(String output) {
        JOptionPane.showMessageDialog(null,output,"Player name", JOptionPane.PLAIN_MESSAGE);
    }
}