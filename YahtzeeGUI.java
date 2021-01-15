import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class YahtzeeGUI {
    private JPanel mainPanel;
    private JTextArea state;
    private JButton dice_5;
    private JButton dice_4;
    private JButton dice_3;
    private JButton dice_2;
    private JButton dice_1;
    private JLabel status;

    private Yahtzee game;

    public YahtzeeGUI() {
        game = new Yahtzee();

        state.setText(game.toString());

        dice_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int indexes[] = {1};
                game.rollDices(indexes);

                state.setText(game.toString());

                if(game.isYahtzee()) {
                    status.setText("Nyertél!!!!!");
                }
            }
        });
        dice_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int indexes[] = {2};
                game.rollDices(indexes);

                state.setText(game.toString());

                if(game.isYahtzee()) {
                    status.setText("Nyertél!!!!!");
                }
            }
        });
        dice_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int indexes[] = {3};
                game.rollDices(indexes);

                state.setText(game.toString());

                if(game.isYahtzee()) {
                    status.setText("Nyertél!!!!!");
                }
            }
        });
        dice_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int indexes[] = {4};
                game.rollDices(indexes);

                state.setText(game.toString());

                if(game.isYahtzee()) {
                    status.setText("Nyertél!!!!!");
                }
            }
        });
        dice_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int indexes[] = {5};
                game.rollDices(indexes);

                state.setText(game.toString());

                if(game.isYahtzee()) {
                    status.setText("Nyertél!!!!!");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("YahtzeeGUI");
        frame.setContentPane(new YahtzeeGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }

}
