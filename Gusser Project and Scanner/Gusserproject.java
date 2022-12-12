import java.util.Scanner;

class gusser {
    int gusserno;

    public int gussernumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Number gussed By Gusser is ");
        gusserno = sc.nextInt();
        // if (gusserno <11 && gusserno >=0) {
        //     // System.out.println(" the given no is wrong plz fill correct no");     
        //     return gusserno;
        // } else {
        //     System.out.println(" the given no is wrong plz fill correct no");
        //  sc.nextInt();
           
        // }
        return gusserno;
        
    }

}

class Player {
    int playerno;

    public int gussernumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Number gussed By Player is ");
        playerno = sc.nextInt();
        return playerno;
    }

}

class Umpire {

    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    public void collectNumFromGuesser() {
        gusser g = new gusser();
        numFromGuesser = g.gussernumber();

    }

    public void collectNumFromPlayer() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        numFromPlayer1 = p1.gussernumber();
        numFromPlayer2 = p2.gussernumber();
        numFromPlayer3 = p3.gussernumber();
    }

    void compare() {
        if (numFromGuesser == numFromPlayer1) {

            if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                System.out.println("The match is Draw");
            } else if (numFromGuesser == numFromPlayer2) {
                System.out.println("Player 1 and 2 is winner");
            } else if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player 1 and 3 is winner");
            } else {

                System.out.println(" Player one is a winner");
            }

        }
         else if (numFromGuesser == numFromPlayer2) {
            if(numFromGuesser == numFromPlayer3){
                System.out.println("Player 2 and 3 is winner");
            }
            else
            {

                System.out.println(" Player Two is a winner");
            }

        } else if (numFromGuesser == numFromPlayer3) {
            System.out.println(" Player Three is a winner");

        } else {
            System.out.println("You all Lost the game");
        }
    }

}

public class Gusserproject {
    public static void main(String[] args) {
        Umpire u1 = new Umpire();
        u1.collectNumFromGuesser();
        u1.collectNumFromPlayer();
        u1.compare();
    }
}
