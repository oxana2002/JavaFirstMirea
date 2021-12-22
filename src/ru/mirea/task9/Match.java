package ru.mirea.task9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Match extends JFrame{
    private static JButton btn_AC_Milan;
    private static JButton btn_Real_Madrid;
    private static JLabel label_result;
    private static JLabel label_scorer;
    private static JLabel label_winner;
    private static int counter_AC_Milan = 0;
    private static int counter_Real_Madrid = 0;

    public static void addComponentsToPane(Container pane) {
        pane.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        label_winner = new JLabel("Winner: DRAW");
        label_winner.setFont(new Font("Tahoma", Font.PLAIN, 40));
        label_winner.setHorizontalAlignment(label_winner.CENTER);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        gbc.gridx = 0;
        gbc.gridy = 0;
        pane.add(label_winner, gbc);


        btn_AC_Milan = new JButton("  AC Milan  ");
        btn_AC_Milan.setFont(new Font("Tahoma", Font.PLAIN, 20));
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 2;
        gbc.gridx = 0;
        gbc.gridy = 1;
        pane.add(btn_AC_Milan, gbc);

        btn_AC_Milan.setActionCommand("Last Scorer: AC Milan");


        label_result = new JLabel("Result: 0 X 0");
        label_result.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label_result.setHorizontalAlignment(label_result.CENTER);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.gridx = 1;
        gbc.gridy = 1;
        pane.add(label_result, gbc);


        label_scorer = new JLabel("Last Scorer: N/A");
        label_scorer.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label_scorer.setHorizontalAlignment(label_scorer.CENTER);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.gridx = 1;
        gbc.gridy = 2;
        pane.add(label_scorer, gbc);


        btn_Real_Madrid = new JButton("Real Madrid");
        btn_Real_Madrid.setFont(new Font("Tahoma", Font.PLAIN, 20));
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 2;
        gbc.gridx = 2;
        gbc.gridy = 1;
        pane.add(btn_Real_Madrid, gbc);

        btn_Real_Madrid.setActionCommand("Last Scorer: Real Madrid");


        ActionListener actionListener = new TestActionListener();
        btn_AC_Milan.addActionListener(actionListener);
        btn_Real_Madrid.addActionListener(actionListener);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Match");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addComponentsToPane(frame.getContentPane());

        frame.pack();
        frame.setSize(600, 300);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public static class TestActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            label_scorer.setText(e.getActionCommand());
            if (e.getSource() == btn_AC_Milan)
            {
                label_result.setText("Result: " + ++counter_AC_Milan + " X " + counter_Real_Madrid);
            }
            else if (e.getSource() == btn_Real_Madrid)
            {
                label_result.setText("Result: " + counter_AC_Milan + " X " + ++counter_Real_Madrid);
            }
            if (counter_AC_Milan > counter_Real_Madrid)
            {
                label_winner.setText("Winner: AC Milan");
            }
            else if (counter_AC_Milan < counter_Real_Madrid)
            {
                label_winner.setText("Winner: Real Madrid");
            }
            else
            {
                label_winner.setText("Winner: DRAW");
            }
        }

    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}