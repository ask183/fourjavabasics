package rockPaperScissors2;

import java.util.Scanner;

public class RockPaperScissors2 {
	private static final String USER_PLAYER = "User Wins!";
    private static final String COMPUTER_PLAYER = "Computer Wins!";
    private static final String TIE = "It's a Tie.";
    private static final String[] keys = {"rock", "paper", "scissors"};
  
  
    public static void main(String args[]) {
    	//declare and initalize the scanner
        Scanner myScanner = new Scanner(System.in);
        //while loop
        char c = 'Y';
        while (c == 'Y' || c == 'y') {

            int numOfRounds= 0;
            //recieve info from user
            System.out.print("how many rounds you want to play: ");
            //convert the strings to ints
            numOfRounds = Integer.parseInt(myScanner.nextLine());
            //check if input from the user is in the range of 1-10
            if(numOfRounds < 1 || numOfRounds > 10) {
                System.out.println("Invalid rounds.");
                System.exit(1);
            }

            int currentRound = 0;
            int numOfTies=0, winsForUser=0, winsForComputer=0;

            while(currentRound < numOfRounds) {

                int usersChoice = getUserChoiceForRockPaperScissorGame(myScanner);
                int computerChoice = (int) (Math.random() * 3);

                System.out.println("Round " + (currentRound + 1) + ":");
                System.out.println("User picked " + keys[usersChoice]);
                System.out.println("Computer picked " + keys[computerChoice]);

                String winner = getWinnerForRockPaperScissorGame(usersChoice, computerChoice);
                System.out.println(winner);

                if(winner.equals(USER_PLAYER)) {
                    winsForUser++;
                }if(winner.equals(COMPUTER_PLAYER)) {
                    winsForComputer++;
                }if(winner.equals(TIE)) {
                    numOfTies++;
                }
                System.out.println();
                currentRound++;
            }

            System.out.println("Match finished");
            System.out.println("User won " + winsForUser);
            System.out.println("Computer won " + winsForComputer);
            System.out.println("Ties " + numOfTies);
            if(winsForUser > winsForComputer) {
                System.out.println("Player won!");
            } else if(winsForComputer > winsForUser) {
                System.out.println("Computer won!");
            } else {
                System.out.println("Match drawn!");
            }

            System.out.print("Do you want to play again(y/n): ");
            c = myScanner.nextLine().charAt(0);
        }

        System.out.println("Thanks for playing!");
        myScanner.close();
    }
  
    
    //Method to get Users Choice for Rock Paper Scissor Game (Either 1 for rock, 2 for paper, or 3 for scissors).
    public static int getUserChoiceForRockPaperScissorGame(Scanner myScanner){
        int usersChoice = 0;
        System.out.println("Enter you choice: 1.rock 2.paper 3.scissors");
         
        boolean isValid = false;
        while (!isValid){
            usersChoice = Integer.parseInt(myScanner.nextLine());
            if (usersChoice >= 1 && usersChoice <=3){
                isValid = true;
            }else{
                System.out.println("Not a valid choice. Try again please!:");
            }
        }
         // to make it between 0 to 2
        usersChoice--;

        return usersChoice;
    }
    
    //Method to get the Winner of the Rock Paper Scissor Game
    private static String getWinnerForRockPaperScissorGame(int user, int computer){
        //switch statement displays the result of the Round, based on the values User and Computer Will Choose during the round.
        //switch statement selects one of many code blocks to be executed.
        switch(user){
            case 0:
                switch (computer){
                    case 0:
                        return TIE;
                    case 1:
                        return COMPUTER_PLAYER;
                    case 2:
                        return USER_PLAYER;
                }
            case 1:
                switch (computer){
                    case 0: 
                        return USER_PLAYER;
                    case 1:
                        return TIE;
                    case 2:
                        return COMPUTER_PLAYER;
                }
            case 2:
                switch (computer){
                    case 0:
                        return COMPUTER_PLAYER;
                    case 1:
                        return USER_PLAYER;
                    case 2:
                        return TIE;
                }
        }
        return TIE;
    }
    
}
    
	
