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

        // Add the panel to the frame
        frame.add(panel);

        // Place components inside the panel
        placeComponents(panel);

        // Set the frame to be visible
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        // Set the layout manager for the panel
        panel.setLayout(null);

        // Create a JLabel
        JLabel label = new JLabel("Enter text:");
        label.setBounds(10, 20, 80, 25);
        panel.add(label);

        // Create a text field
        JTextField textField = new JTextField(20);
        textField.setBounds(100, 20, 165, 25);
        panel.add(textField);

        // Create a button
        JButton button = new JButton("Click Me");
        button.setBounds(10, 80, 100, 25);
        panel.add(button);

        // Create a second label to display the result
        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(10, 110, 300, 25);
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
    }
}
