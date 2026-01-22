
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JavaSwingExemple {
    private static void mostrarDialeg(JFrame parent) {
        // Bloquea la ventana principal hasta que termine
        JDialog dialeg = new JDialog(parent, "Mensaje importante", true);
        dialeg.setSize(300, 150);
        dialeg.setLayout(new BorderLayout());

        // Añadimos mensaje
        JLabel etiqueta = new JLabel("JPanel abierto de forma correcta, Cierralo", JLabel.CENTER);
        dialeg.add(etiqueta, BorderLayout.CENTER);
        JButton botoTancar = new JButton("De acuerdo");
        botoTancar.addActionListener(e -> dialeg.dispose());
        dialeg.add(botoTancar, BorderLayout.SOUTH);
        dialeg.setLocationRelativeTo(parent);
        dialeg.setVisible(true);
    };

    public static void main(String[] args) {
        JFrame finestra = new JFrame("Exemple de JDialog");
        finestra.setSize(400,200);
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finestra.setLayout(new FlowLayout());

        JButton botoObrir = new JButton("Obrir diàleg");
        finestra.add(botoObrir);

        botoObrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarDialeg(finestra);
            }
    });
        finestra.setVisible(true);
    }
}