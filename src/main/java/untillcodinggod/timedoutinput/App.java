package untillcodinggod.timedoutinput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;

public class App {
    private final JFrame frame;
    private final JPanel parentPanel;
    private final JTextField input;
    private final JLabel randomWordLabel;

    public App() {
        this.frame = new JFrame();
        this.parentPanel = new JPanel();
        this.input = new JTextField();
        this.randomWordLabel = new JLabel("test");
    }

    public void setLabel() {
        randomWordLabel.setText("Test");
        parentPanel.add(randomWordLabel);
    }

    public void setInput() {
        input.setColumns(60);
    }

    public void setPanel() {
        parentPanel.setLayout(new GridBagLayout());
        parentPanel.add(input);
    }

    public void setFrame() {
        frame.add(parentPanel);
        frame.setSize(1000, 480);
        frame.setExtendedState(frame.getState() | frame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }

    public void run() {
        setLabel();
        setInput();
        setPanel();
        setFrame();
    }

    public void setWord(String word) {
        randomWordLabel.setText(word);
    }

    public String getUserInput() {
        String userInput = input.getText();
        input.setText("");

        return userInput;
    }

    public void close() {
        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
    }
}