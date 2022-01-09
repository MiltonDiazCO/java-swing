package swing.componentes;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CuadrosDeTexto extends JFrame {
	private static final long serialVersionUID = 1L;

	public CuadrosDeTexto() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		LaminaTexto laminaTexto = new LaminaTexto();
		add(laminaTexto);
	}

	public static void main(String[] args) {
		CuadrosDeTexto cuadroTexto = new CuadrosDeTexto();
		cuadroTexto.setBounds(500, 200, 380, 300);
	}
}

class LaminaTexto extends JPanel {
	private static final long serialVersionUID = 1L;

	public LaminaTexto() {
		// la clase JLabel nos permite crear etiquetas de texto
		JLabel etiquetaNombre = new JLabel("Nombre: ");
		
		// la clase JTextField nos permite crear cuadros de texto
		JTextField cuadroDeTexto = new JTextField(20);
		
		add(etiquetaNombre);
		add(cuadroDeTexto);
	}
}