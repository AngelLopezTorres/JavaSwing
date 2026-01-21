import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
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

        JPanel panellNordOest = new JPanel();
        panellNordOest.setBorder(new TitledBorder(" Estat del Sistema"));
        panellNordOest.setLayout(new GridLayout(2, 1));
        panellNordOest.add(new JLabel("CPU: 15% Ús"));
        panellNordOest.add(new JLabel("RAM: 4GB / 16GB"));
        //
        
        JPanel panellNordEst = new JPanel();
        panellNordEst.setBorder(new TitledBorder("Accions Ràpides"));
        GridLayout gridBotons = new GridLayout(3, 1);
        gridBotons.setVgap(10);
        panellNordEst.setLayout(gridBotons);

        panellNordEst.add(new JButton("▶ Iniciar Servei"));
        panellNordEst.add(new JButton("■ Aturar Servei"));
        panellNordEst.add(new JButton("↻ Reiniciar"));
        //
        JPanel panellSudOest = new JPanel();
        panellSudOest.setBorder(new TitledBorder("Parámetres de Carga"));
        panellSudOest.setLayout(new GridLayout(4, 1));
        panellSudOest.add(new JLabel("Límit de Connexions (0-500):"));
        JSlider slider = new JSlider(0, 500, 250);
        slider.setMajorTickSpacing(50);
        slider.setMinorTickSpacing(25);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        panellSudOest.add(slider);
        panellSudOest.add(new JLabel("Timeout(segons):"));
        panellSudOest.add(new TextField("60", 1));
        //
        JPanel panellSudEst = new JPanel();
        panellSudEst.setBorder(new TitledBorder("Logs del Servidor en Viu"));
        panellSudEst.setLayout(new BorderLayout());
        JScrollPane scroll = new JScrollPane(new JTextArea());
        panellSudEst.add(scroll);
        //
        finestraAdmin.add(panellNordOest);
        finestraAdmin.add(panellNordEst);
        finestraAdmin.add(panellSudOest);
        finestraAdmin.add(panellSudEst, BorderLayout.WEST);
        finestraAdmin.setVisible(true);
    }
}