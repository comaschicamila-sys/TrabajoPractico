import javax.swing.*;
import java.awt.*;

public class problema6 extends JFrame {
    public problema6() {
        setTitle("Problema 6");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 15, 20));

        JLabel label = new JLabel("Seleccione una pizza:");
        String[] pizzas = {"Jamón y Queso", "Muzzarella", "Morrones"};
        JComboBox<String> combo = new JComboBox<>(pizzas);

        JTextField textoPrecio = new JTextField(15);
        textoPrecio.setEditable(false);

        combo.addActionListener(e -> {
            String seleccion = (String) combo.getSelectedItem();

            switch (seleccion) {
                case "Jamón y Queso":
                    textoPrecio.setText("$1500");
                    break;
                case "Muzzarella":
                    textoPrecio.setText("$1300");
                    break;
                case "Morrones":
                    textoPrecio.setText("$1600");
                    break;
                default:
                    textoPrecio.setText("$0");
            }
        });

        add(label);
        add(combo);
        add(textoPrecio);

        setSize(420, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new problema6());
    }
}
