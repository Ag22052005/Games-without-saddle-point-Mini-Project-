import java.awt.*;
import javax.swing.*;

public class outputlayout2 extends JFrame {
    JLabel label;
    static JLabel matlabel[];
    JPanel content;
    JPanel Matrix;

    public outputlayout2() {
        content = new JPanel();
        label = new JLabel("Probability for the players to choose respective strategy are:");
        label.setPreferredSize(new Dimension(350, 50));
        label.setOpaque(true);
        label.setBackground(new Color(0xFFE5F1));

        matlabel = new JLabel[9];

        for (int i = 0; i < 9; i++) {
            matlabel[i] = new JLabel("");
            matlabel[i].setHorizontalTextPosition(JLabel.CENTER);
            matlabel[i].setVerticalTextPosition(JLabel.CENTER);
        }
        matlabel[0].setText("    Game2X2");
        matlabel[1].setText("    Strategy 1");
        matlabel[2].setText("    Strategy 2");
        matlabel[3].setText("    Player 1");
        matlabel[4].setText("    1");
        matlabel[5].setText("    2");
        matlabel[6].setText("    Player 2");
        matlabel[7].setText("    1");
        matlabel[8].setText("    2");

        int index1 = 4, index2 = 7;
        for (int i = 0; i < 2; i++) {
            matlabel[index1++].setText("      " + Backend.resultsP1[i]);
            matlabel[index2++].setText("      " + Backend.resultsP2[i]);
        }

        Matrix = new JPanel();
        Matrix.setLayout(new GridLayout(3, 4, 10, 10));

        for (int i = 0; i < 9; i++) {
            matlabel[i].setPreferredSize(new Dimension(100, 100));
            matlabel[i].setOpaque(true);
            matlabel[i].setBackground(Color.pink);
            Matrix.add(matlabel[i]);
        }

        content.add(label);
        this.setTitle("Probabilities");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(575, 500);
        this.add(content);
        this.add(Matrix);
        this.getContentPane().setBackground(new Color(0xFFF8E1));
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
    }

}