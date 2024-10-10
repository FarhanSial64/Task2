import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleUI {

    public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("Simple UI Example");

        // Set the frame's size
        frame.setSize(400, 200);

        // Set the close operation so the application exits when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel to hold the components
        JPanel panel = new JPanel();
        panel.setLayout(null); // Set to null for custom positioning

        // Add the panel to the frame
        frame.add(panel);

        // Create a JLabel
        JLabel label = new JLabel("Enter text:");
        label.setBounds(20, 20, 100, 25); // Adjusted position
        panel.add(label);

        // Create a text field
        JTextField textField = new JTextField(20);
        textField.setBounds(120, 20, 200, 25); // Adjusted width and position
        panel.add(textField);

        // Create a button
        JButton button = new JButton("Submit");
        button.setBounds(120, 60, 100, 30); // Adjusted position and size
        panel.add(button);

        // Create a second label to display the result
        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(20, 100, 350, 25); // Adjusted width to fit the frame
        resultLabel.setForeground(Color.BLUE); // Added color to differentiate result label
        panel.add(resultLabel);

        // Add action listener for the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Set the result label's text to whatever is in the text field
                String inputText = textField.getText();
                resultLabel.setText("You entered: " + inputText);
            }
        });

        // Set the frame to be visible
        frame.setVisible(true);
    }
}
