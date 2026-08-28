import javax.swing.*;
import java.awt.*;

public class problema10 extends JFrame {
    public problema10() {
        setTitle("Problema 10");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 30));

        JLabel label = new JLabel("Página cargada");
        add(label);

        SwingUtilities.invokeLater(() -> {
            JOptionPane.showMessageDialog(this, "Mensaje mostrado al cargar la página.");
        });

        setSize(300, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new problema10());
    }
}
