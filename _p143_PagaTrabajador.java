import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _p143_PagaTrabajador {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Calculadora de Paga");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);

        placeComponents(panel);

        frame.pack();
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel horasLabel = new JLabel("Horas Trabajadas:");
        horasLabel.setBounds(10, 20, 150, 25);
        panel.add(horasLabel);

        JTextField horasText = new JTextField(20);
        horasText.setBounds(160, 20, 165, 25);
        panel.add(horasText);

        JLabel pagaLabel = new JLabel("Paga por Hora:");
        pagaLabel.setBounds(10, 50, 150, 25);
        panel.add(pagaLabel);

        JTextField pagaText = new JTextField(20);
        pagaText.setBounds(160, 50, 165, 25);
        panel.add(pagaText);

        JLabel impuestoLabel = new JLabel("Tasa de Impuestos (%):");
        impuestoLabel.setBounds(10, 80, 150, 25);
        panel.add(impuestoLabel);

        JTextField impuestoText = new JTextField(20);
        impuestoText.setBounds(160, 80, 165, 25);
        panel.add(impuestoText);

        JButton calcularButton = new JButton("Calcular");
        calcularButton.setBounds(10, 110, 150, 25);
        panel.add(calcularButton);

        JTextArea resultadoArea = new JTextArea();
        resultadoArea.setBounds(10, 140, 300, 100);
        resultadoArea.setEditable(false);
        panel.add(resultadoArea);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double horasTrabajadas = Double.parseDouble(horasText.getText());
                    double pagaPorHora = Double.parseDouble(pagaText.getText());
                    double tasaDeImpuestos = Double.parseDouble(impuestoText.getText());

                    double pagaBruta = horasTrabajadas * pagaPorHora;
                    double impuesto = pagaBruta * (tasaDeImpuestos / 100);
                    double pagaNeta = pagaBruta - impuesto;

                    resultadoArea.setText("Paga Bruta: $" + pagaBruta + "\nImpuesto: $" + impuesto + "\nPaga Neta: $" + pagaNeta);
                } catch (NumberFormatException ex) {
                    resultadoArea.setText("Ingrese valores numéricos válidos.");
                }
            }
        });
    }
}
