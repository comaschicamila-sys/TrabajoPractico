import javax.swing.*;
import java.awt.*;

public class problema3 extends JFrame {
    public problema3() {
        setTitle("Problema 3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 15, 20));

        JLabel label1 = new JLabel("Número 1:");
        JTextField texto1 = new JTextField(8);
        JLabel label2 = new JLabel("Número 2:");
        JTextField texto2 = new JTextField(8);
        JButton boton = new JButton("Mostrar mayor");

        boton.addActionListener(e -> {
            try {
                int num1 = Integer.parseInt(texto1.getText());
                int num2 = Integer.parseInt(texto2.getText());

                if (num1 > num2) {
                    JOptionPane.showMessageDialog(this, "El mayor es: " + num1);
                } else if (num2 > num1) {
                    JOptionPane.showMessageDialog(this, "El mayor es: " + num2);
                } else {
                    JOptionPane.showMessageDialog(this, "Ambos números son iguales.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Debe ingresar números enteros válidos.");
            }
        });

        add(label1);
        add(texto1);
        add(label2);
        add(texto2);
        add(boton);

        setSize(420, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new problema3());
    }
}
