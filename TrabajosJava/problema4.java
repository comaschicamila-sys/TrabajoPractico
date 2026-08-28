import javax.swing.*;
import java.awt.*;

public class problema4 extends JFrame {
    public problema4() {
        setTitle("Problema 4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 15, 20));

        JLabel labelNombre = new JLabel("Nombre:");
        JTextField textoNombre = new JTextField(10);

        JLabel labelApellido = new JLabel("Apellido:");
        JTextField textoApellido = new JTextField(10);

        JLabel labelResultado = new JLabel("Resultado:");
        JTextField textoResultado = new JTextField(15);
        textoResultado.setEditable(false);

        JButton boton = new JButton("Concatenar");

        boton.addActionListener(e -> {
            String nombre = textoNombre.getText();
            String apellido = textoApellido.getText();
            textoResultado.setText(nombre + " " + apellido);
        });

        add(labelNombre);
        add(textoNombre);
        add(labelApellido);
        add(textoApellido);
        add(labelResultado);
        add(textoResultado);
        add(boton);

        setSize(500, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new problema4());
    }
}
