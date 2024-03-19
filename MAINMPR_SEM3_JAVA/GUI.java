import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener {
    JPanel selectOrder = new JPanel();
    JButton toMatrix;
    JRadioButton order2;
    JRadioButton order3;
    JPanel subOrderPanel;

    JPanel order2Panel;
    int i, j;

    JPanel order3Panel;
    JButton toResult;
    JButton toResult3;

    JTextField matData21[][];
    JTextField matData22[][];
    JTextField matData31[][];
    JTextField matData32[][];

    GUI() {
        // Select order of payoff
        JPanel headPanel = new JPanel();
        JLabel headLabel = new JLabel("Games Without Saddle Points");
        headLabel.setFont(new Font("Helvetica", Font.BOLD, 30));
        headPanel.add(headLabel);
        headPanel.setPreferredSize(new Dimension(500, 45));
        headPanel.setBackground(new Color(0xFFE5F1));
        selectOrder.add(headPanel);

        JPanel selectOrdertextPanel = new JPanel();
        JLabel selectOrdertextLabel = new JLabel(" Select Order of payoff matrices : ");
        selectOrdertextLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        selectOrdertextPanel.add(selectOrdertextLabel);
        selectOrder.add(selectOrdertextPanel);
        selectOrdertextPanel.setBackground(new Color(0xFFF8E1));

        JPanel radioBtnPanel = new JPanel();
        radioBtnPanel.setBackground(new Color(0xFFF8E1));
        radioBtnPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 0));
        order2 = new JRadioButton("2 x 2");
        order2.setFont(new Font("Helvetica", Font.PLAIN, 20));
        order3 = new JRadioButton("3 x 3");
        order3.setFont(new Font("Helvetica", Font.PLAIN, 20));

        ButtonGroup order = new ButtonGroup();
        order.add(order2);
        order.add(order3);
        radioBtnPanel.add(order2);
        radioBtnPanel.add(order3);
        order2.setBackground(new Color(0xFFF8E1));
        order3.setBackground(new Color(0xFFF8E1));
        selectOrder.add(radioBtnPanel);

        subOrderPanel = new JPanel();
        toMatrix = new JButton("Proceed");
        subOrderPanel.add(toMatrix);
        selectOrder.add(subOrderPanel);
        subOrderPanel.setBackground(new Color(0xFFF8E1));
        toMatrix.setBackground(new Color(0xADA2FF));
        toMatrix.addActionListener(this);

        order2.setFocusable(false);
        order3.setFocusable(false);
        toMatrix.setFocusable(false);
        // End of select order Page

        // Order is 2x2
        order2Panel = new JPanel();
        order2Panel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10));
        order2Panel.setPreferredSize(new Dimension(500, 350));
        order2Panel.setBackground(new Color(0xFFF8E1));

        JPanel header2panel = new JPanel();
        header2panel.setBackground(new Color(0xFFE5F1));
        header2panel.setPreferredSize(new Dimension(575, 35));

        JLabel header2label = new JLabel("Two Player 2x2 game");
        header2label.setFont(new Font("Helvetica", Font.PLAIN, 23));
        header2panel.add(header2label);
        order2Panel.add(header2panel);

        JPanel enter2textPanel = new JPanel();
        enter2textPanel.setBackground(new Color(0xFFF8E1));
        enter2textPanel.setLayout(new BorderLayout());
        JLabel enter2Text = new JLabel("Enter the payoff matrices :");
        enter2Text.setFont(new Font("Helvetica", Font.PLAIN, 20));
        enter2textPanel.setPreferredSize(new Dimension(500, 30));
        enter2textPanel.add(enter2Text);
        order2Panel.add(enter2textPanel);

        JPanel mat2container = new JPanel();
        mat2container.setBackground(new Color(0xFFF8E1));
        mat2container.setLayout(new FlowLayout(FlowLayout.CENTER, 80, 10));
        JPanel mat21 = new JPanel();
        mat21.setBackground(new Color(0xFFF8E1));
        mat21.setLayout(new GridLayout(3, 2, 10, 10));
        matData21 = new JTextField[2][2];
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                matData21[i][j] = new JTextField(2);
                matData21[i][j].setFont(new Font("Helvetica", Font.PLAIN, 15));
                mat21.add(matData21[i][j]);
            }
        }
        JLabel o2p1Label = new JLabel("Player 1");
        o2p1Label.setFont(new Font("Helvetica", Font.PLAIN, 15));

        mat21.add(o2p1Label);
        mat2container.add(mat21);

        JPanel mat22 = new JPanel();
        mat22.setBackground(new Color(0xFFF8E1));
        mat22.setLayout(new GridLayout(3, 2, 10, 10));
        matData22 = new JTextField[2][2];
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                matData22[i][j] = new JTextField();
                matData22[i][j].setFont(new Font("Helvetica", Font.PLAIN, 15));
                mat22.add(matData22[i][j]);
            }
        }
        JLabel o2p2Label = new JLabel("Player 2");
        o2p2Label.setBackground(new Color(0xFFF8E1));
        o2p2Label.setFont(new Font("Helvetica", Font.PLAIN, 15));

        mat22.add(o2p2Label);
        mat2container.add(mat22);
        order2Panel.add(mat2container);

        toResult = new JButton("Submit");
        toResult.addActionListener(this);
        order2Panel.add(toResult);
        toResult.setFocusable(false);
        toResult.setBackground(new Color(0xADA2FF));

        // end of 2x2

        // enter 3x3 data
        order3Panel = new JPanel();
        order3Panel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10));
        order3Panel.setPreferredSize(new Dimension(575, 250));
        order3Panel.setBackground(new Color(0xFFF8E1));

        JPanel header3panel = new JPanel();
        header3panel.setBackground(new Color(0xFFE5F1));
        header3panel.setPreferredSize(new Dimension(550, 35));

        JLabel header3label = new JLabel("Two Player 3x3 game");
        header3label.setFont(new Font("Helvetica", Font.PLAIN, 23));
        header3panel.add(header3label);
        order3Panel.add(header3panel);

        JPanel enter3textPanel = new JPanel();
        enter3textPanel.setBackground(new Color(0xFFF8E1));
        enter3textPanel.setLayout(new BorderLayout());
        JLabel enter3Text = new JLabel("Enter the payoff matrices :");
        enter3Text.setFont(new Font("Helvetica", Font.PLAIN, 20));
        enter3textPanel.setPreferredSize(new Dimension(450, 30));
        enter3textPanel.add(enter3Text);
        order3Panel.add(enter3textPanel);

        JPanel mat3container = new JPanel();
        mat3container.setBackground(new Color(0xFFF8E1));
        mat3container.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 10));
        JPanel mat31 = new JPanel();
        mat31.setBackground(new Color(0xFFF8E1));
        mat31.setLayout(new GridLayout(4, 3, 10, 10));
        matData31 = new JTextField[3][3];
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                matData31[i][j] = new JTextField(5);
                matData31[i][j].setFont(new Font("Helvetica", Font.PLAIN, 15));
                mat31.add(matData31[i][j]);
            }
        }
        JLabel o3p1Label = new JLabel("Player 1");
        o3p1Label.setFont(new Font("Helvetica", Font.PLAIN, 15));

        mat31.add(o3p1Label);
        mat3container.add(mat31);

        JPanel mat32 = new JPanel();
        mat32.setBackground(new Color(0xFFF8E1));
        mat32.setLayout(new GridLayout(4, 3, 10, 10));
        matData32 = new JTextField[3][3];
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                matData32[i][j] = new JTextField(5);
                matData32[i][j].setFont(new Font("Helvetica", Font.PLAIN, 15));
                mat32.add(matData32[i][j]);
            }
        }
        JLabel o3p2Label = new JLabel("Player 2");
        o3p2Label.setBackground(new Color(0xFFF8E1));
        o3p2Label.setFont(new Font("Helvetica", Font.PLAIN, 15));

        mat32.add(o3p2Label);
        mat3container.add(mat32);
        order3Panel.add(mat3container);

        toResult3 = new JButton("Submit");
        toResult3.addActionListener(this);
        order3Panel.add(toResult3);
        toResult3.setFocusable(false);
        toResult3.setBackground(new Color(0xADA2FF));

        this.add(order3Panel);
        this.setVisible(true);
        // end of 3x3

        selectOrder.setLayout(new GridLayout(4, 1, 10, 20));
        selectOrder.setBackground(new Color(0xFFF8E1));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(selectOrder);
        this.setLocationRelativeTo(null);
        this.setSize(550, 400);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == toMatrix) {
            if (order2.isSelected()) {
                Backend.m = Backend.n = 3;
                selectOrder.setVisible(false);
                this.add(order2Panel);
            } else if (order3.isSelected()) {
                Backend.m = Backend.n = 4;
                selectOrder.setVisible(false);
                this.add(order3Panel);
            } else {
                JLabel err = new JLabel("Please select an option");
                err.setPreferredSize(new Dimension(500, 50));
                err.setFont(new Font("Helvetica", Font.PLAIN, 23));
                subOrderPanel.add(err);
                this.setVisible(true);
                return;
            }
        }

        Backend game = new Backend();
        if (e.getSource() == toResult) {
            for (i = 1; i < Backend.m; i++) {
                for (j = 1; j < Backend.n; j++) {
                    try {
                        Backend.p1[i][j] = Integer.parseInt(matData21[i - 1][j - 1].getText());
                    } catch (Exception exc) {
                        JLabel err = new JLabel("Invalid Data Entered!");
                        err.setPreferredSize(new Dimension(500, 50));
                        err.setFont(new Font("Helvetica", Font.PLAIN, 23));
                        order2Panel.add(err);
                        this.setVisible(true);
                        return;
                    }

                }
            }
            for (i = 1; i < Backend.m; i++) {
                for (j = 1; j < Backend.n; j++) {
                    try {
                        Backend.p2[i][j] = Integer.parseInt(matData22[i - 1][j - 1].getText());
                    } catch (Exception exc) {
                        JLabel err = new JLabel("Invalid Data Entered!");
                        err.setPreferredSize(new Dimension(500, 50));
                        err.setFont(new Font("Helvetica", Font.PLAIN, 23));
                        order2Panel.add(err);
                        this.setVisible(true);
                        return;
                    }
                }
            }
            try {
                game.calcNashEqmO2();
                Backend.displayNashEqmO2();
                new outputlayout2();
                this.dispose();
            } catch (Exception exc) {
                JLabel err = new JLabel("Invalid Data Entered!");
                err.setPreferredSize(new Dimension(500, 50));
                err.setFont(new Font("Helvetica", Font.PLAIN, 23));
                order2Panel.add(err);
                this.setVisible(true);
                return;
            }
        }
        if (e.getSource() == toResult3) {
            for (i = 1; i < Backend.m; i++) {
                for (j = 1; j < Backend.n; j++) {
                    try {
                        Backend.p1[i][j] = Integer.parseInt(matData31[i - 1][j - 1].getText());
                    } catch (Exception exc) {
                        JLabel err = new JLabel("Invalid Data Entered!");
                        err.setPreferredSize(new Dimension(500, 50));
                        err.setFont(new Font("Helvetica", Font.PLAIN, 23));
                        order3Panel.add(err);
                        this.setVisible(true);
                        return;
                    }
                }
            }
            for (i = 1; i < Backend.m; i++) {
                for (j = 1; j < Backend.n; j++) {
                    try {
                        Backend.p2[i][j] = Integer.parseInt(matData32[i - 1][j - 1].getText());
                    } catch (Exception exc) {
                        JLabel err = new JLabel("Invalid Data Entered!");
                        err.setPreferredSize(new Dimension(500, 50));
                        err.setFont(new Font("Helvetica", Font.PLAIN, 23));
                        order3Panel.add(err);
                        this.setVisible(true);
                        return;
                    }
                }
            }
            game.checkDominance();
            if (Backend.m == 3 && Backend.n == 3) {
                try {
                    game.calcNashEqmO2();
                    Backend.displayNashEqmO2();
                    new outputlayout();
                    this.dispose();
                } catch (Exception exc) {
                    JLabel err = new JLabel("Invalid Data Entered!");
                    err.setPreferredSize(new Dimension(500, 50));
                    err.setFont(new Font("Helvetica", Font.PLAIN, 23));
                    order3Panel.add(err);
                    this.setVisible(true);
                    return;
                }
            } else if (Backend.m == 4 && Backend.n == 4) {
                try {
                    game.calcNashEqmO3();
                    Backend.displayNashEqmO3();
                    new outputlayout();
                    this.dispose();
                } catch (Exception exc) {
                    JLabel err = new JLabel("Invalid Data Entered!");
                    err.setPreferredSize(new Dimension(500, 50));
                    err.setFont(new Font("Helvetica", Font.PLAIN, 23));
                    order3Panel.add(err);
                    this.setVisible(true);
                    return;
                }
            }
        }
    }
}