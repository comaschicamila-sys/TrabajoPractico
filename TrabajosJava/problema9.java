import javax.swing.*;
import java.awt.*;

public class problema9 extends JFrame {
    public problema9() {
        setTitle("Problema 9");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        JLabel lblUsuario = new JLabel("Nombre de usuario:");
        JTextField txtUsuario = new JTextField();

        JLabel lblClave = new JLabel("Clave:");
        JPasswordField txtClave = new JPasswordField();

        JButton btnAceptar = new JButton("Aceptar");

        txtClave.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                String clave = new String(txtClave.getPassword());
                if (clave.length() < 7 || clave.length() > 20) {
                    JOptionPane.showMessageDialog(problema9.this,
                            "La clave debe tener entre 7 y 20 caracteres.");
                }
            }
        });

        btnAceptar.addActionListener(e -> {
            String usuario = txtUsuario.getText();
            String clave = new String(txtClave.getPassword());

            if (usuario.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe ingresar un nombre de usuario.");
            } else if (clave.length() < 7 || clave.length() > 20) {
                JOptionPane.showMessageDialog(this, "La clave debe tener entre 7 y 20 caracteres.");
            } else {
                JOptionPane.showMessageDialog(this, "Usuario y clave válidos.");
            }
        });

        add(lblUsuario);
        add(txtUsuario);
        add(lblClave);
        add(txtClave);
        add(new JLabel(""));
        add(btnAceptar);

        setSize(420, 180);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new problema9());
    }
}
