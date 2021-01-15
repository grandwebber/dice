import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Yahtzee {

   private Dice [] dices = new Dice[5];

   public Yahtzee() {
       dices[0] = new Dice();
       dices[1] = new Dice();
       dices[2] = new Dice();
       dices[3] = new Dice();
       dices[4] = new Dice();

       for (int i = 0; i < dices.length; i++) {
           dices[i].roll();
       }
   }

   public void rollDices(int indexes[]) {
       for (int i = 0; i < indexes.length; i++) {
           dices[indexes[i] - 1].roll();
       }

   }

   public String toString() {
       String toReturn = "";
       for (int i = 0; i < dices.length; i++) {
           toReturn += "Dice " + (i+1) + ": " + dices[i].getValue() + "\n";
       }

       return toReturn;
   }

   public boolean isYahtzee() {

      boolean bool = true;

       for (int i = 0; i < dices.length; i++) {

           int actValue = dices[i].getValue();

           if(i != 0) {
               int prevValue = dices[i-1].getValue();
               if(actValue != prevValue) {
                   return  false;
               }
           }
       }

       return true;

   }

    public static void main(String[] args) {
        Yahtzee game = new Yahtzee();
        Scanner sc = new Scanner(System.in);

        while (!game.isYahtzee()) {
            System.out.println("" + game + " Which dices would you like to roll?");
            char[] selectionChars = sc.nextLine().replaceAll("\\D", "").toCharArray();
            int[] selection = new int[selectionChars.length];
            for (int i = 0; i < selection.length; ++i)
                selection[i] = Character.getNumericValue(selectionChars[i]);
            game.rollDices(selection);
        }
        System.out.println(game);
        System.out.println("Congrats, you won the game!");
    }
}
