import javax.swing.*;
import java.awt.*;

public class problema2 extends JFrame {
    public problema2() {
        setTitle("Problema 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 15, 20));

        JLabel label = new JLabel("Ingrese un número entero:");
        JTextField texto = new JTextField(10);
        JButton boton = new JButton("Calcular cubo");

        boton.addActionListener(e -> {
            try {
                int numero = Integer.parseInt(texto.getText());
                int cubo = numero * numero * numero;
                JOptionPane.showMessageDialog(this, "El cubo de " + numero + " es: " + cubo);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Debe ingresar un número entero válido.");
            }
        });

        add(label);
        add(texto);
        add(boton);

        setSize(350, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new problema2());
    }
}
