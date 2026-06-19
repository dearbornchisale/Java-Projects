package com.personalexpense.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ExpenseTablePanel extends JPanel {
    private JTable table;
    private DefaultTableModel tableModel;

    private JButton deleteButton;
    private JButton filterButton;
    private JButton showAllButton;

    private JComboBox<String> filterCombo;

    public ExpenseTablePanel() {
        setLayout(new BorderLayout());

        String[] columns = { "Amount", "Category", "Date", "Note" };

        tableModel = new DefaultTableModel(columns, 0);

        tableModel.addRow(new Object[] { "120.50", "FOOD", "2026-05-01", "Lunch" });
        tableModel.addRow(new Object[] { "45.00", "TRANSPORT", "2026-05-02", "Taxi" });
        tableModel.addRow(new Object[] { "600.00", "RENT", "2026-05-03", "Apartment" });

        table = new JTable(tableModel);

        JScrollPane scrollpane = new JScrollPane(table);

        add(scrollpane, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel(new FlowLayout());

        deleteButton = new JButton("Delete");
        controlPanel.add(deleteButton);

        filterCombo = new JComboBox<>();

        filterCombo.addItem("All Categories");
        filterCombo.addItem("FOOD");
        filterCombo.addItem("TRANSPORT");
        filterCombo.addItem("RENT");

        controlPanel.add(filterCombo);

        filterButton = new JButton("Filter");
        showAllButton = new JButton("Show All");

        controlPanel.add(filterButton);
        controlPanel.add(showAllButton);

        add(controlPanel, BorderLayout.SOUTH);

    }

}
