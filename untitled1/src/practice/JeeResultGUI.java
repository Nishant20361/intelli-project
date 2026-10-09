package practice;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Student {
    String name;
    int math, phy, chem;
    int total;
    double percentile;
    int rank;

    Student(String name, int m, int p, int c) {
        this.name = name;
        this.math = m;
        this.phy = p;
        this.chem = c;
        this.total = m + p + c;
    }
}

public class JeeResultGUI extends JFrame {

    JTextField nameField, mathField, phyField, chemField;
    DefaultTableModel model;
    ArrayList<Student> list = new ArrayList<>();

    public JeeResultGUI() {
        setTitle("JEE Result System");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // ===== INPUT PANEL =====
        JPanel inputPanel = new JPanel(new GridLayout(5, 2, 10, 10));

        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Math Marks:"));
        mathField = new JTextField();
        inputPanel.add(mathField);

        inputPanel.add(new JLabel("Physics Marks:"));
        phyField = new JTextField();
        inputPanel.add(phyField);

        inputPanel.add(new JLabel("Chemistry Marks:"));
        chemField = new JTextField();
        inputPanel.add(chemField);

        JButton addButton = new JButton("Add Student");
        JButton calcButton = new JButton("Calculate Result");

        inputPanel.add(addButton);
        inputPanel.add(calcButton);

        add(inputPanel, BorderLayout.NORTH);

        // ===== TABLE =====
        String[] columns = {"Name", "Math", "Physics", "Chem", "Total", "Rank", "Percentile"};
        model = new DefaultTableModel(columns, 0);
        JTable table = new JTable(model);

        add(new JScrollPane(table), BorderLayout.CENTER);

        // ===== BUTTON ACTIONS =====

        // Add Student
        addButton.addActionListener(e -> {
            try {
                String name = nameField.getText();
                int m = Integer.parseInt(mathField.getText());
                int p = Integer.parseInt(phyField.getText());
                int c = Integer.parseInt(chemField.getText());

                list.add(new Student(name, m, p, c));

                // clear fields
                nameField.setText("");
                mathField.setText("");
                phyField.setText("");
                chemField.setText("");

                JOptionPane.showMessageDialog(this, "Student Added!");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid Input!");
            }
        });

        // Calculate Result
        calcButton.addActionListener(e -> {
            if (list.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No Students Added!");
                return;
            }

            // Sort
            Collections.sort(list, (a, b) -> b.total - a.total);

            // Rank
            for (int i = 0; i < list.size(); i++) {
                list.get(i).rank = i + 1;
            }

            // Percentile
            for (int i = 0; i < list.size(); i++) {
                int below = list.size() - i - 1;
                list.get(i).percentile = (below * 100.0) / list.size();
            }

            // Display
            model.setRowCount(0);
            for (Student s : list) {
                model.addRow(new Object[]{
                        s.name, s.math, s.phy, s.chem,
                        s.total, s.rank,
                        String.format("%.2f", s.percentile)
                });
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new JeeResultGUI().setVisible(true);
        });
    }
}
