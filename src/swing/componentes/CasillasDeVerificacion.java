package swing.componentes;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CasillasDeVerificacion extends JFrame {
	private static final long serialVersionUID = 1L;

	public CasillasDeVerificacion() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		LaminaVerificacion laminaVerifica = new LaminaVerificacion();
		add(laminaVerifica);
	}

	public static void main(String[] args) {
		CasillasDeVerificacion verificacion = new CasillasDeVerificacion();
		verificacion.setBounds(500, 200, 380, 300);
	}
}

class LaminaVerificacion extends JPanel {
	private static final long serialVersionUID = 1L;

	public LaminaVerificacion() {
		// la clase JCheckBox nos permite crear casillas de verificacion
		JCheckBox checkEdad = new JCheckBox("Soy mayor de edad");
		JCheckBox checkDocumento = new JCheckBox("Documento de Identidad");

		add(checkEdad);
		add(checkDocumento);
	}
}