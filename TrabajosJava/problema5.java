import javax.swing.*;
import java.awt.*;

public class problema5 extends JFrame {
    public problema5() {
        setTitle("Problema 5");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 15, 20));

        JLabel labelClave1 = new JLabel("Clave 1:");
        JPasswordField clave1 = new JPasswordField(10);

        JLabel labelClave2 = new JLabel("Clave 2:");
        JPasswordField clave2 = new JPasswordField(10);

        JButton boton = new JButton("Validar claves");

        boton.addActionListener(e -> {
            String pass1 = new String(clave1.getPassword());
            String pass2 = new String(clave2.getPassword());

            if (pass1.equals(pass2)) {
                JOptionPane.showMessageDialog(this, "Las claves ingresadas son iguales.");
            } else {
                JOptionPane.showMessageDialog(this, "Las claves ingresadas NO son iguales.");
            }
        });

        add(labelClave1);
        add(clave1);
        add(labelClave2);
        add(clave2);
        add(boton);

        setSize(420, 160);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new problema5());
    }
}
