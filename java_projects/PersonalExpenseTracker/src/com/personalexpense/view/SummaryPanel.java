package com.personalexpense.view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.*;

public class SummaryPanel extends JPanel {
    private JLabel titleLable;
    private JLabel totalLable;
    private JLabel categoryLabel; 

    public SummaryPanel(){
        setLayout(new GridLayout(3,1 ));

        titleLable = new JLabel("Summary", SwingConstants.CENTER);
        titleLable.setFont(new Font("Arial", Font.BOLD, 18));

        totalLable = new JLabel("Total spent this monht R0.00", SwingConstants.CENTER);
       
        categoryLabel =new JLabel("Most spent in category:- ", SwingConstants.CENTER);

        add(titleLable);
        add(totalLable);
        add(categoryLabel); 


    }


}
