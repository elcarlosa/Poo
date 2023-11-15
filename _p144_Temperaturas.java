import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _p144_Temperaturas {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Conversor de Temperatura");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);

        placeComponents(panel);

        frame.pack();
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel temperaturaLabel = new JLabel("Temperatura:");
        temperaturaLabel.setBounds(10, 20, 80, 25);
        panel.add(temperaturaLabel);

        JTextField temperaturaText = new JTextField(20);
        temperaturaText.setBounds(100, 20, 165, 25);
        panel.add(temperaturaText);

        JRadioButton fahrenheitButton = new JRadioButton("Fahrenheit");
        fahrenheitButton.setBounds(10, 50, 100, 25);
        panel.add(fahrenheitButton);

        JRadioButton celsiusButton = new JRadioButton("Celsius");
        celsiusButton.setBounds(120, 50, 100, 25);
        panel.add(celsiusButton);

        ButtonGroup grupoBotones = new ButtonGroup();
        grupoBotones.add(fahrenheitButton);
        grupoBotones.add(celsiusButton);

        JButton convertirButton = new JButton("Convertir");
        convertirButton.setBounds(10, 80, 150, 25);
        panel.add(convertirButton);

        JLabel resultadoLabel = new JLabel("Resultado:");
        resultadoLabel.setBounds(10, 110, 80, 25);
        panel.add(resultadoLabel);

        JTextField resultadoText = new JTextField(20);
        resultadoText.setBounds(100, 110, 165, 25);
        resultadoText.setEditable(false);
        panel.add(resultadoText);

        convertirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double temperatura = Double.parseDouble(temperaturaText.getText());

                    if (fahrenheitButton.isSelected()) {
                        double celsius = (temperatura - 32) * 5 / 9;
                        resultadoText.setText(String.format("%.2f °C", celsius));
                    } else if (celsiusButton.isSelected()) {
                        double fahrenheit = (temperatura * 9 / 5) + 32;
                        resultadoText.setText(String.format("%.2f °F", fahrenheit));
                    } else {
                        resultadoText.setText("Seleccione una opción");
                    }
                } catch (NumberFormatException ex) {
                    resultadoText.setText("Ingrese una temperatura válida");
                }
            }
        });
    }
}
