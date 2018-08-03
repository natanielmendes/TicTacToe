import org.junit.Test;

public class TicTacToeTest {

    public static void main(String[] main) {
        TicTacToe ticTacToeFirstWinner = new TicTacToe(3);
        ticTacToeFirstWinner.move(0,0,1);
        ticTacToeFirstWinner.move(1,0,2);
        ticTacToeFirstWinner.move(0,1,1);
        int noOneFirstWinner = ticTacToeFirstWinner.move(1,1,2);
        int player1 = ticTacToeFirstWinner.move(0,2,1);

        System.out.println("No one wins: " + noOneFirstWinner);
        System.out.println("Player 1 wins: " + player1);

        TicTacToe ticTacToeSecondWinner = new TicTacToe(3);
        ticTacToeSecondWinner.move(0,0,2);
        ticTacToeSecondWinner.move(1,0,1);
        ticTacToeSecondWinner.move(0,1,2);
        int noOneSecondWinner = ticTacToeSecondWinner.move(1,1,1);
        int player2 = ticTacToeSecondWinner.move(0,2,2);

        System.out.println("No one wins: " + noOneSecondWinner);
        System.out.println("Player 2 wins: " + player2);
    }

    @Test
    public void Player1Winner() {
        TicTacToe ticTacToeFirstWinner = new TicTacToe(3);
        ticTacToeFirstWinner.move(0,0,1);
        ticTacToeFirstWinner.move(1,0,2);
        ticTacToeFirstWinner.move(0,1,1);
        int noOneFirstWinner = ticTacToeFirstWinner.move(1,1,2);
        int player1 = ticTacToeFirstWinner.move(0,2,1);

        System.out.println("No one wins: " + noOneFirstWinner);
        System.out.println("Player 1 wins: " + player1);
    }

    @Test
    public void Player2Winner() {
        TicTacToe ticTacToeSecondWinner = new TicTacToe(3);
        ticTacToeSecondWinner.move(0,0,2);
        ticTacToeSecondWinner.move(1,0,1);
        ticTacToeSecondWinner.move(0,1,2);
        int noOneSecondWinner = ticTacToeSecondWinner.move(1,1,1);
        int player2 = ticTacToeSecondWinner.move(0,2,2);

        System.out.println("No one wins: " + noOneSecondWinner);
        System.out.println("Player 2 wins: " + player2);
    }

    @Test
    public void Player2WinnerDiagonal() {
        TicTacToe ticTacToeSecondWinner = new TicTacToe(3);
        ticTacToeSecondWinner.move(0,0,2);
        ticTacToeSecondWinner.move(1,0,1);
        ticTacToeSecondWinner.move(1,1,2);
        int noOneSecondWinner = ticTacToeSecondWinner.move(0,1,1);
        int player2 = ticTacToeSecondWinner.move(2,2,2);

        System.out.println("No one wins: " + noOneSecondWinner);
        System.out.println("Player 2 wins: " + player2);
    }

}
