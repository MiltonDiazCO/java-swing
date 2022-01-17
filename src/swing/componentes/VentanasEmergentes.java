package swing.componentes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VentanasEmergentes extends JFrame {
	private static final long serialVersionUID = 1L;

	public VentanasEmergentes() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		LaminaVentanaEmergente laminaEmergente = new LaminaVentanaEmergente();
		add(laminaEmergente);
	}

	public static void main(String[] args) {
		VentanasEmergentes emergente = new VentanasEmergentes();
		emergente.setBounds(300, 200, 780, 300);
	}
}

class LaminaVentanaEmergente extends JPanel {
	private static final long serialVersionUID = 1L;

	JButton boton1, boton2, boton3;

	public LaminaVentanaEmergente() {
		// botones para activar las diferentes ventanas emergentes
		boton1 = new JButton("Ventana de advertencia");
		boton1.addActionListener(new EventosEmergentes());
		add(boton1);

		boton2 = new JButton("Ventana de entrada de texto");
		boton2.addActionListener(new EventosEmergentes());
		add(boton2);

		boton3 = new JButton("Ventana de confirmacion");
		boton3.addActionListener(new EventosEmergentes());
		add(boton3);
	}

	class EventosEmergentes implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			// ventanas emergentes

			if (e.getSource() == boton1) {
				// la clase JOptionPane nos permite crear ventanas emergentes
				JOptionPane.showMessageDialog(LaminaVentanaEmergente.this, "Ventana de advertencia");
			} else if (e.getSource() == boton2) {
				JOptionPane.showInputDialog(LaminaVentanaEmergente.this, "Ventana de entrada de texto");
			} else if (e.getSource() == boton3) {
				JOptionPane.showConfirmDialog(LaminaVentanaEmergente.this, "Ventana de confirmacion");
			}
		}
	}
}