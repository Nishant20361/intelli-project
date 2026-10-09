package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class DragonTigerGUI extends JFrame implements ActionListener {

    JLabel balanceLabel;
    JLabel resultLabel;
    JLabel statsLabel;

    JTextField nameField;
    JTextField balanceField;
    JTextField betField;

    JButton startButton;
    JButton dragonButton;
    JButton tigerButton;
    JButton saveButton;

    Player player;

    Random random = new Random();

    public DragonTigerGUI() {

        setTitle("Dragon Tiger Game");
        setSize(600, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setBackground(Color.BLACK);

        JLabel title = new JLabel("DRAGON 🐉 TIGER 🐯");
        title.setBounds(170, 20, 300, 40);
        title.setForeground(Color.YELLOW);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        add(title);

        JLabel nameLabel = new JLabel("Enter Name:");
        nameLabel.setBounds(50, 90, 120, 30);
        nameLabel.setForeground(Color.WHITE);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(180, 90, 180, 30);
        add(nameField);

        JLabel balanceText = new JLabel("Add Balance:");
        balanceText.setBounds(50, 140, 120, 30);
        balanceText.setForeground(Color.WHITE);
        add(balanceText);

        balanceField = new JTextField();
        balanceField.setBounds(180, 140, 180, 30);
        add(balanceField);

        startButton = new JButton("START");
        startButton.setBounds(200, 200, 150, 40);
        startButton.addActionListener(this);
        add(startButton);

        balanceLabel = new JLabel("Balance: ₹0");
        balanceLabel.setBounds(50, 260, 250, 30);
        balanceLabel.setForeground(Color.GREEN);
        balanceLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(balanceLabel);

        JLabel betLabel = new JLabel("Bet Amount:");
        betLabel.setBounds(50, 310, 120, 30);
        betLabel.setForeground(Color.WHITE);
        add(betLabel);

        betField = new JTextField();
        betField.setBounds(180, 310, 150, 30);
        add(betField);

        dragonButton = new JButton("Dragon 🐉");
        dragonButton.setBounds(70, 370, 160, 40);
        dragonButton.addActionListener(this);
        add(dragonButton);

        tigerButton = new JButton("Tiger 🐯");
        tigerButton.setBounds(320, 370, 160, 40);
        tigerButton.addActionListener(this);
        add(tigerButton);

        resultLabel = new JLabel("Result will appear here");
        resultLabel.setBounds(150, 420, 350, 30);
        resultLabel.setForeground(Color.CYAN);
        add(resultLabel);

        statsLabel = new JLabel();
        statsLabel.setBounds(380, 260, 200, 80);
        statsLabel.setForeground(Color.WHITE);
        add(statsLabel);

        saveButton = new JButton("SAVE SCORE");
        saveButton.setBounds(210, 450, 150, 30);
        saveButton.addActionListener(this);
        add(saveButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == startButton) {

            try {

                String name = nameField.getText();
                double balance = Double.parseDouble(balanceField.getText());

                if (balance <= 0) {
                    JOptionPane.showMessageDialog(this, "Invalid Balance");
                    return;
                }

                player = new Player(name, balance);

                balanceLabel.setText("Balance: ₹" + player.getBalance());

                resultLabel.setText("Game Started!");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid Input");
            }
        }

        if (e.getSource() == dragonButton) {
            playGame(1);
        }

        if (e.getSource() == tigerButton) {
            playGame(2);
        }

        if (e.getSource() == saveButton) {
            saveScore();
        }
    }

    private void playGame(int choice) {

        if (player == null) {
            JOptionPane.showMessageDialog(this, "Start Game First");
            return;
        }

        try {

            int bet = Integer.parseInt(betField.getText());

            if (bet <= 0 || bet > player.getBalance()) {
                JOptionPane.showMessageDialog(this, "Invalid Bet");
                return;
            }

            player.deductBalance(bet);

            int result = random.nextInt(2) + 1;

            String winner;

            if (result == 1) {
                winner = "Dragon 🐉";
            } else {
                winner = "Tiger 🐯";
            }

            if (choice == result) {

                double tax = bet * 2 * 0.05;
                double winning = (bet * 2) - tax;

                player.addBalance(winning);
                player.addWin();

                resultLabel.setText("You Won! Winner: " + winner);

            } else {

                player.addLoss();

                resultLabel.setText("You Lost! Winner: " + winner);
            }

            balanceLabel.setText("Balance: ₹" + player.getBalance());

            statsLabel.setText(
                    "<html>Wins: " + player.getWins()
                            + "<br>Losses: " + player.getLosses()
                            + "<br>Highest Balance: ₹" + player.getHighestBalance()
                            + "</html>"
            );

            if (player.getBalance() <= 0) {
                JOptionPane.showMessageDialog(this, "Game Over");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Invalid Input");
        }
    }

    private void saveScore() {

        if (player == null) {
            JOptionPane.showMessageDialog(this, "No Data");
            return;
        }

        try {

            FileWriter fw = new FileWriter("leaderboard.txt", true);

            fw.write("Player: " + player.getName() + "\n");
            fw.write("Balance: " + player.getBalance() + "\n");
            fw.write("Wins: " + player.getWins() + "\n");
            fw.write("Losses: " + player.getLosses() + "\n");
            fw.write("----------------------\n");

            fw.close();

            JOptionPane.showMessageDialog(this, "Saved Successfully");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error Saving File");
        }
    }
}