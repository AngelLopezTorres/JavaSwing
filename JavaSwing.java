import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class JavaSwing {

    public static void main(String[] args) {
        // Server Admin
        JFrame finestraAdmin = new JFrame("Tauler d'Administració: Ángel Cristian López Torres");
        finestraAdmin.setSize(800, 600);
        finestraAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finestraAdmin.setLayout(new GridLayout(2, 2, 15, 15));
        finestraAdmin.setLocationRelativeTo(null);
        //
        JPanel panellNordOest = new JPanel();
        panellNordOest.setBorder(new TitledBorder("Estat del Sistema")); // Le ponemos titulillo
        panellNordOest.setLayout(new GridLayout(2, 1));
        JLabel cpu = new JLabel("CPU: 15% Ús", SwingConstants.CENTER);
        cpu.setVerticalAlignment(SwingConstants.BOTTOM);
        JLabel ram = new JLabel("RAM: 4GB / 16GB", SwingConstants.CENTER);
        ram.setVerticalAlignment(SwingConstants.TOP);
        cpu.setFont(new Font("Tahoma", Font.BOLD, 18));
        ram.setFont(new Font("Tahoma", Font.BOLD, 18));
        panellNordOest.add(cpu);
        panellNordOest.add(ram);

        //
        JPanel panellNordEst = new JPanel();
        panellNordEst.setBorder(new TitledBorder("Accions Ràpides"));
        panellNordEst.setLayout(new BorderLayout());
        JPanel panelIntermedio = new JPanel();
        panelIntermedio.setLayout(new BoxLayout(panelIntermedio, BoxLayout.Y_AXIS));
        JButton botonInciar = new JButton("▶ Iniciar Servei");
        botonInciar.setAlignmentX(SwingConstants.CENTER);
        JButton botonAturar = new JButton("■ Aturar Servei");
        JButton botonReiniciar = new JButton("↻ Reiniciar");
        
        //Lo que añadimos al panel que irá en el medio
        panelIntermedio.add(botonInciar);
        panelIntermedio.add(botonAturar);
        panelIntermedio.add(botonReiniciar);

        //Panel Norte Este, lo que realmente añadimos
        panellNordEst.add(new JLabel(""));
        panellNordEst.add(panelIntermedio,SwingConstants.CENTER);
        panellNordEst.add(new JLabel(""));

        //
        JPanel panellSudOest = new JPanel();
        panellSudOest.setBorder(
                new CompoundBorder(new TitledBorder("Parámetres de Carga"), new EmptyBorder(10, 10, 10, 10)));
        panellSudOest.setLayout(new GridLayout(4, 1));
        JLabel conexions = new JLabel("Limit de Connexions (0-500)");
        conexions.setFont(new Font("Tahoma", Font.BOLD, 14));
        conexions.setVerticalAlignment(SwingConstants.BOTTOM);
        panellSudOest.add(conexions);
        JSlider slider = new JSlider(0, 500, 250);
        slider.setMajorTickSpacing(125);
        slider.setMinorTickSpacing(15);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        panellSudOest.add(slider);
        JLabel textOest = new JLabel("Timeout(segons):");
        textOest.setVerticalAlignment(SwingConstants.BOTTOM);
        textOest.setHorizontalAlignment(SwingConstants.LEFT);
        textOest.setFont(new Font("Tahoma", Font.BOLD, 15));
        panellSudOest.add(textOest);
        JPanel panelTimeout = new JPanel();
        JTextField timeOut = new JTextField(31);
        ;
        panelTimeout.add(timeOut);
        panellSudOest.add(panelTimeout);
        //

        JPanel panellSudEst = new JPanel();
        panellSudEst.setLayout(new BorderLayout(10, 10));
        panellSudEst.setBorder(new CompoundBorder(new TitledBorder("Logs de Servidor en vivo"), new EmptyBorder(10, 15, 10, 20)));
        JTextArea texto = new JTextArea();
        texto.setEditable(false);
        texto.setText("[Info] Servei iniciat...\n" + "[Warning] Connexió lenta IP 192...\n" + " ..."
                + "[Warning] Connexió lenta IP 192...\n" + "[Warning] Connexió alenta IP 192...\n"
                + "[Warning] Connexió lenta IP 192...\n" + "[Warning] Connexió lenta IP 192...\n"
                + "[Warning] Connexió lenta IP 192...\n" + "[Warning] Connexió lenta IP 192...\n"
                + "[Warning] Connexió lenta IP 192...\n" + "[Warning] Connexió lenta IP 192...\n"
                + "[Warning] Connexió lenta IP 192...\n" + "[Warning] Connexió lenta IP 192...\n"
                + "[Warning] Connexió lenta IP 192...\n" + "[Warning] Connexió lenta IP 192...\n"
                + "[Warning] Connexió lenta IP 192...\n");
        JScrollPane scroll = new JScrollPane(texto);
        panellSudEst.add(scroll, BorderLayout.CENTER);

        panellSudEst.setBackground(Color.MAGENTA);
        panellNordEst.setBackground(Color.LIGHT_GRAY);
        panellNordOest.setBackground(Color.GREEN);
        //
        finestraAdmin.add(panellNordOest);
        finestraAdmin.add(panellNordEst);
        finestraAdmin.add(panellSudOest);
        finestraAdmin.add(panellSudEst);
        finestraAdmin.setVisible(true);
    }
}
