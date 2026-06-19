package com.personalexpense.view;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import java.awt.BorderLayout;

public class ExpenseTrackerView extends javax.swing.JFrame {
        public ExpenseTrackerView(){
            setTitle("Personal Expense Tracker");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new BorderLayout());
        
            JPanel inputPanel = new JPanel();
            JPanel expenseTablePanel = new JPanel();
            JPanel summaryPanel = new JPanel(); 

            add(summaryPanel, BorderLayout.NORTH);
            add(expenseTablePanel, BorderLayout.CENTER);
            add(inputPanel, BorderLayout.SOUTH);

            JMenuBar menuBar = new JMenuBar();

            JMenu fileMenu = new JMenu();
            JMenu helpMenu = new JMenu();

            JMenuItem saveItem = new JMenuItem("Save");
            JMenuItem loadItem = new JMenuItem("Load");
            JMenuItem exitItem = new JMenuItem("Exit");
            JMenuItem aboutItem = new JMenuItem("About");

            fileMenu.add(saveItem);
            fileMenu.add(loadItem);
            fileMenu.add(exitItem);
            fileMenu.add(aboutItem);

            menuBar.add(fileMenu);
            menuBar.add(helpMenu);

            setJMenuBar(menuBar);

            setSize(700, 500);
            setVisible(true);
        }

        public static void main(String[] args) {
            new ExpenseTrackerView();
        }
}
