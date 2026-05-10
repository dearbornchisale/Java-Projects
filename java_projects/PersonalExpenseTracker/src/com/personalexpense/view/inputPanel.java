package com.personalexpense.view;

import javax.swing.JPanel;
import java.awt.*;
import java.util.Locale.Category;

import javax.swing.*;

public class inputPanel extends JPanel {
    private JTextField amountField;
    private JComboBox<Category> categoryCombo;
    private JTextField dateField;
    private JTextField noteField; 

    private  JButton addButton;
    private JButton clearButton; 

    public inputPanel(){
        setLayout(new BorderLayout());

        JPanel formPanel = new JPanel(new GridLayout(0, 2, 5, 5));

        formPanel.add(new JLabel("Amount: "));

        amountField = new JTextField(10);
        formPanel.add(amountField);

        formPanel.add(new JLabel("Category: "));

        categoryCombo = new JComboBox<>(Category.values());
        formPanel.add(categoryCombo);

        formPanel.add(new JLabel("Date (YYYY-MM-DD): "));

        dateField = new JTextField(10);
        formPanel.add(dateField);

        formPanel.add(new JLabel("Note: "));

        noteField = new JTextField(15);
        formPanel.add(noteField);

        JPanel buttonPanel = new JPanel(new FlowLayout()); 

        addButton = new JButton("Add");
        addButton = new JButton("Clear");

        buttonPanel.add(addButton);
        buttonPanel.add(clearButton);

        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public String getAmount(){
        return amountField.getText(); 
    }
}
