import java.util.Random;

public class Dice {

    private Integer dobas;

    public Dice() {
        dobas = null;
    }

    // Dobás fv
    public void roll() {
        Random random = new Random();
        dobas = random.nextInt(6 - 1 + 1) + 1;
    }

    public Integer getValue() {
        return dobas;
    }


    public static void main(String[] args) {
        Dice dice = new Dice();
        if (dice.getValue() == null) System.out.println("[OK] dice not yet rolled.");
        else System.err.println("[ERROR] not yet rolled dice have a value.");
        dice.roll();
        if (dice.getValue() == null) System.err.println("[ERROR] rolled dice does not have a value");
        else System.out.println("[OK] rolled dice has a value");


        boolean stresstest = true;
        for (int i = 0; i < 1000; i++) {
            dice.roll();
            Integer value = dice.getValue();
            if (value == null || value < 1 || value > 6) {
                System.err.println("[ERROR] rolled dice does not have a value or has invalid value: " + value);
                stresstest = false;
            }
        }
        if (stresstest) System.out.println("[OK] Stresstest passed, dice always has proper value.");
    }

}
