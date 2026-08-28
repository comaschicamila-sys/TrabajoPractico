import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class problema7 extends JFrame {
    public problema7() {
        setTitle("Problema 7");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        JLabel lblProcesador = new JLabel("Procesador:");
        String[] opcionesProcesador = {"Intel I3", "Intel I5", "Intel I7"};
        int[] valoresProcesador = {400, 600, 800};
        Map<String, Integer> precioProcesador = new HashMap<>();
        for (int i = 0; i < opcionesProcesador.length; i++) {
            precioProcesador.put(opcionesProcesador[i], valoresProcesador[i]);
        }
        JComboBox<String> comboProcesador = new JComboBox<>(opcionesProcesador);

        JLabel lblMonitor = new JLabel("Monitor:");
        String[] opcionesMonitor = {"Samsung 20'", "Samsung 22'", "Samsung 26'"};
        int[] valoresMonitor = {250, 350, 550};
        Map<String, Integer> precioMonitor = new HashMap<>();
        for (int i = 0; i < opcionesMonitor.length; i++) {
            precioMonitor.put(opcionesMonitor[i], valoresMonitor[i]);
        }
        JComboBox<String> comboMonitor = new JComboBox<>(opcionesMonitor);

        JLabel lblDisco = new JLabel("Disco Duro:");
        String[] opcionesDisco = {"500 Gb", "1 Tb", "3 Tb"};
        int[] valoresDisco = {300, 440, 500};
        Map<String, Integer> precioDisco = new HashMap<>();
        for (int i = 0; i < opcionesDisco.length; i++) {
            precioDisco.put(opcionesDisco[i], valoresDisco[i]);
        }
        JComboBox<String> comboDisco = new JComboBox<>(opcionesDisco);

        JButton boton = new JButton("Calcular");
        JTextField txtPresupuesto = new JTextField();
        txtPresupuesto.setEditable(false);

        boton.addActionListener(e -> {
            String proc = (String) comboProcesador.getSelectedItem();
            String mon = (String) comboMonitor.getSelectedItem();
            String disco = (String) comboDisco.getSelectedItem();

            int total = precioProcesador.get(proc) + precioMonitor.get(mon) + precioDisco.get(disco);
            txtPresupuesto.setText(String.valueOf(total));
        });

        add(lblProcesador);
        add(comboProcesador);
        add(lblMonitor);
        add(comboMonitor);
        add(lblDisco);
        add(comboDisco);
        add(boton);
        add(txtPresupuesto);

        setSize(500, 220);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new problema7());
    }
}
