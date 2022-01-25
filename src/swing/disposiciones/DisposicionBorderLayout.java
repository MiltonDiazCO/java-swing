package swing.disposiciones;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class DisposicionBorderLayout extends JFrame {
	private static final long serialVersionUID = 1L;

	public DisposicionBorderLayout() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		LaminaBorderLayout laminaBorderLayout = new LaminaBorderLayout();
		add(laminaBorderLayout);
	}

	public static void main(String[] args) {
		DisposicionBorderLayout borderLayout = new DisposicionBorderLayout();
		borderLayout.setBounds(500, 200, 380, 300);
	}
}

class LaminaBorderLayout extends JPanel {
	private static final long serialVersionUID = 1L;

	public LaminaBorderLayout() {
		// la clase BorderLayout divide el contenedor en 5 partes: norte, centro, oeste, este y sur

		// el metodo 'setLayout' establece que disposicion va a tener el contenedor
		// estableciendo el BorderLayout
		setLayout(new BorderLayout());

		// agregando etiqueta de texto en la parte superior del contenedor
		add(new JLabel("Zona Superior"), BorderLayout.NORTH);

		// agregando area de texto en la parte central del contenedor
		add(new JTextArea("Zona Central"), BorderLayout.CENTER);

		// agregando boton en la parte izquierda del contenedor
		add(new JButton("Boton Izquierdo"), BorderLayout.WEST);

		// agregando boton en la parte derecha del contenedor
		add(new JButton("Boton Derecho"), BorderLayout.EAST);

		// agregando etiqueta de texto en la parte inferior del contenedor
		add(new JLabel("Zona Inferior"), BorderLayout.SOUTH);
	}
}