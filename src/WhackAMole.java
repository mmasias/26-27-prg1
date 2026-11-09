
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class WhackAMole extends JFrame {

    JButton[] casillas = new JButton[16];
    JLabel marcador = new JLabel("", SwingConstants.CENTER);
    Random random = new Random();

    int topo = -1;
    int intentos = 15;
    int puntos = 0;

    Timer temporizador;

    public WhackAMole() {
        setTitle("Whack-a-Mole");
        setSize(500, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel tablero = new JPanel(new GridLayout(4, 4, 8, 8));
        tablero.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        for (int i = 0; i < 16; i++) {
            final int posicion = i;

            casillas[i] = new JButton("");
            casillas[i].setFont(new Font("Arial", Font.BOLD, 25));

            casillas[i].addActionListener(e -> golpear(posicion));
            tablero.add(casillas[i]);
        }

        marcador.setFont(new Font("Arial", Font.BOLD, 20));
        actualizarMarcador();

        add(marcador, BorderLayout.NORTH);
        add(tablero, BorderLayout.CENTER);

        moverTopo();

        temporizador = new Timer(900, e -> moverTopo());
        temporizador.start();
    }

    void moverTopo() {
        if (topo != -1) {
            casillas[topo].setText("");
        }

        int nuevo;
        do {
            nuevo = random.nextInt(16);
        } while (nuevo == topo);

        topo = nuevo;
        casillas[topo].setText("🐹");
    }

    void golpear(int posicion) {
        if (intentos <= 0) return;

        intentos--;

        if (posicion == topo) {
            puntos++;
        }

        actualizarMarcador();

        if (intentos == 0) {
            temporizador.stop();

            for (JButton boton : casillas) {
                boton.setEnabled(false);
            }

            JOptionPane.showMessageDialog(this,
                "Juego terminado. Puntos: " + puntos + "/15");
        } else {
            moverTopo();
            temporizador.restart();
        }
    }

    void actualizarMarcador() {
        marcador.setText(
            "Puntos: " + puntos + " | Intentos: " + intentos
        );
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
            new WhackAMole().setVisible(true)
        );
    }
}
