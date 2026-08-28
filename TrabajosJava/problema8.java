import javax.swing.*;
import java.awt.*;

public class problema8 extends JFrame {
    public problema8() {
        setTitle("Problema 8");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 2, 10, 10));

        String[][] preguntas = {
            {"¿Cuál es la capital de Argentina?", "Buenos Aires", "Córdoba", "Rosario", "La Plata"},
            {"¿Cuántos lados tiene un triángulo?", "2", "3", "4", "5"},
            {"¿En qué año nació Java?", "1991", "1985", "2000", "1995"},
            {"¿Cuál es el planeta más grande del sistema solar?", "Marte", "Júpiter", "Tierra", "Saturno"}
        };

        int[] respuestasCorrectas = {0, 1, 0, 1};
        JComboBox<String>[] selects = new JComboBox[4];

        for (int i = 0; i < 4; i++) {
            JLabel pregunta = new JLabel(preguntas[i][0]);
            add(pregunta);

            String[] opciones = new String[4];
            for (int j = 1; j <= 4; j++) {
                opciones[j - 1] = preguntas[i][j];
            }

            JComboBox<String> combo = new JComboBox<>(opciones);
            selects[i] = combo;
            add(combo);
        }

        JButton boton = new JButton("Calcular resultado");
        JTextField resultado = new JTextField();
        resultado.setEditable(false);

        boton.addActionListener(e -> {
            int correctas = 0;
            int incorrectas = 0;

            for (int i = 0; i < 4; i++) {
                String seleccion = (String) selects[i].getSelectedItem();
                String correcta = preguntas[i][respuestasCorrectas[i] + 1];

                if (seleccion.equals(correcta)) {
                    correctas++;
                } else {
                    incorrectas++;
                }
            }

            resultado.setText("Correctas: " + correctas + "  |  Incorrectas: " + incorrectas);
        });

        add(new JLabel(""));
        add(new JLabel(""));
        add(boton);
        add(resultado);

        setSize(700, 350);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new problema8());
    }
}
