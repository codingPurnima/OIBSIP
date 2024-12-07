import java.util.Scanner;
public class Task2 {
    public static final int rounds=3;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score=0,attempts=1,chances=5;
        System.out.println("\t\t\t\t\t  ---------WELCOME PLAYER---------");
        System.out.println("\t\t\t\t\t\t This is a Number Guessing Game");
        System.out.println("\t\t Computer has generated a number between 1 and 100,which you need to guess");
        System.out.println("\t\t\t\tThere are 3 rounds in this game with 5 chances each");
        System.out.println("\t  You score 10 points for a correct guess and lose 1 point for each incorrect guess");
        System.out.println("\t\t\t\tIf you guess in less than 5 chances you get a bonus of one chance");
        System.out.println("\t\t\t\t\t\t------HAPPY PLAYING------");
        while(attempts<=rounds) {
            int rand = (int)(Math.random()*100)+1;


            for (int i = 0; i < chances; i++) {
                System.out.println("\nGuess a number");
                int n = sc.nextInt();

                if (n == rand) {
                    System.out.println("You win");
                    score+=10;
                    chances++;
                    break;
                }
                else if (n < rand) {
                    System.out.println("You entered a lesser value");
                    if(i==chances-1){
                        System.out.println();
                    }
                    else
                        System.out.println("Retry");
                    score-=1;
                }
                else if (n > rand) {
                    System.out.println("You entered a greater value");
                    if(i==chances-1){
                        System.out.println();
                    }
                    else
                        System.out.println("Retry");
                    score-=1;
                }
            }
            System.out.println("The number is " + rand);
            attempts++;
        }

        System.out.println("Your score is "+score);
        System.out.println("\t\t\t\t\t\t\tTHANKS FOR PLAYING!\n\t\t\t\t\t\t\t\tDO REVISIT");
        sc.close();
    }
}
