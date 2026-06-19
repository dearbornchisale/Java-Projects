import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class ProposalApp {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Proposal App");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel nameLabel = new JLabel("Nobuntu Gumende");
        nameLabel.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 40));
        nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel questionLabel = new JLabel("Will you be my girlfriend? ❤️");
        questionLabel.setFont(new Font("Arial", Font.BOLD, 28));
        questionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        nameLabel.setBounds(100, 30, 300, 50);
        questionLabel.setBounds(50, 100, 400, 50);

        // frame.add(nameLabel);
        // frame.add(questionLabel);

        panel.add(Box.createVerticalStrut(30));
        panel.add(questionLabel);
        panel.add(Box.createVerticalStrut(40));
        panel.add(nameLabel);

        frame.add(panel);
        frame.setVisible(true);

        JButton yesButton = new JButton("YES");
        JButton noButton = new JButton("NO");

        yesButton.setPreferredSize(new Dimension(100, 50));
        noButton.setPreferredSize(new Dimension(100, 50));

        yesButton.setBounds(120, 200, 100, 50);
        noButton.setBounds(260, 200, 100, 50);

        frame.add(yesButton);
        frame.add(noButton);

        Random random = new Random();

        noButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                int x = random.nextInt(400); // random x
                int y = random.nextInt(300); // random y

                noButton.setBounds(x, y, 100, 50);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(yesButton);
        buttonPanel.add(noButton);

        ImageIcon bg = new ImageIcon(ProposalApp.class.getResource("background.gif"));
        JLabel background = new JLabel(bg);
        background.setBounds(0, 0, 600, 800);

        frame.setContentPane(background);
        background.setLayout(null);

        background.add(nameLabel);
        background.add(questionLabel);
        background.add(yesButton);
        background.add(noButton);

        noButton.addActionListener(e -> {
            Dimension size = yesButton.getSize();

            size.width += 20;
            size.height += 10;

            yesButton.setSize(size);
            yesButton.repaint();
        });

        panel.add(Box.createVerticalStrut(10));
        panel.add(buttonPanel);
        panel.add(nameLabel);
        panel.add(Box.createVerticalStrut(20)); // spacing between
        panel.add(questionLabel);

        frame.add(panel);
        frame.setVisible(true);

        JButton yesButton1 = new JButton("YES");
        JButton noButton1 = new JButton("NO");

        yesButton1.setPreferredSize(new Dimension(100, 50));
        noButton1.setPreferredSize(new Dimension(100, 50));
        noButton1.setBackground(new Color(255, 69, 0));
        noButton1.setForeground(Color.WHITE);
        noButton1.setFont(new Font("Arial", Font.BOLD, 24));
        yesButton1.setPreferredSize(new Dimension(100, 50));
        noButton1.setPreferredSize(new Dimension(100, 50));

        yesButton.setBackground(new Color(255, 105, 180));
        yesButton.setForeground(Color.WHITE);

        yesButton.setFocusPainted(false);
        yesButton.setBorderPainted(false);
        yesButton.setOpaque(true);

        noButton.setBackground(new Color(255, 105, 180));
        noButton.setForeground(Color.WHITE);

        noButton.setFocusPainted(false);
        noButton.setBorderPainted(false);
        noButton.setOpaque(true);

        JPanel buttonPanel1 = new JPanel();
        buttonPanel1.add(yesButton1);
        buttonPanel1.add(noButton1);

        panel.add(Box.createVerticalStrut(30));
        panel.add(buttonPanel);

        ImageIcon bg1 = new ImageIcon("src/background.jpg");
        JLabel background1 = new JLabel(bg1);

        frame.setContentPane(background1);
        background1.setLayout(null);

        // Labels
        nameLabel.setBounds(100, 30, 300, 50);
        nameLabel.setForeground(Color.BLACK);

        questionLabel.setBounds(50, 100, 400, 50);
        questionLabel.setForeground(Color.BLACK);

        // Buttons
        yesButton.setBounds(120, 200, 100, 50);
        noButton.setBounds(260, 200, 100, 50);

        // Add to background
        background1.add(nameLabel);
        background1.add(questionLabel);
        background1.add(yesButton);
        background1.add(noButton);

        final int[] noClicks = { 0 };

        noButton.addActionListener(e -> {
            noClicks[0]++;

            if (noClicks[0] < 3) {
                // Grow YES button
                Dimension size = yesButton.getPreferredSize();
                size.width += 300;
                size.height += 150;
                yesButton.setPreferredSize(size);
                yesButton.revalidate(); // update UI
            } else {
                // Third NO click show sad GIF
                ImageIcon sad = new ImageIcon(ProposalApp.class.getResource("sad.gif"));
                JOptionPane.showMessageDialog(frame, "Oh no 😢", "Sad", JOptionPane.INFORMATION_MESSAGE, sad);
            }
        });

        yesButton.addActionListener(e -> {
            ImageIcon happy = new ImageIcon(ProposalApp.class.getResource("happy.gif"));
            JOptionPane.showMessageDialog(frame, "YAY!!!", "She said YES!", JOptionPane.INFORMATION_MESSAGE, happy);
        });

    }
}