import javax.swing.*;
import java.awt.*;

public class problema1 extends JFrame {
    public problema1() {
        setTitle("Problema 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        JButton boton1 = new JButton("1");
        JButton boton2 = new JButton("2");
        JButton boton3 = new JButton("3");

        boton1.addActionListener(e -> JOptionPane.showMessageDialog(this, "Se presionó el botón 1"));
        boton2.addActionListener(e -> JOptionPane.showMessageDialog(this, "Se presionó el botón 2"));
        boton3.addActionListener(e -> JOptionPane.showMessageDialog(this, "Se presionó el botón 3"));

        add(boton1);
        add(boton2);
        add(boton3);

        setSize(300, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new problema1());
    }
}
