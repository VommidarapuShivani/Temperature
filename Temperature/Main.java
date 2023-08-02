import javax.swing.*;
import java.awt.BorderLayout;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TemperatureConverterGUI converter = new TemperatureConverterGUI();
            JButton convertButton = new JButton("Convert");
            convertButton.addActionListener(converter);
            converter.add(convertButton, BorderLayout.NORTH);
            converter.setVisible(true);
        });
    }
}

