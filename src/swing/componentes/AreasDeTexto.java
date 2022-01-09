package swing.componentes;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AreasDeTexto extends JFrame {
	private static final long serialVersionUID = 1L;

	public AreasDeTexto() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		LaminaAreaDeTexto laminaAreaTexto = new LaminaAreaDeTexto();

		add(laminaAreaTexto);
	}

	public static void main(String[] args) {
		AreasDeTexto areaTexto = new AreasDeTexto();
		areaTexto.setBounds(500, 200, 380, 300);
	}
}

class LaminaAreaDeTexto extends JPanel {
	private static final long serialVersionUID = 1L;

	public LaminaAreaDeTexto() {
		// la clase JTextArea nos permite crear areas de texto
		JTextArea txtArea = new JTextArea(8, 10);

		// la clase JScrollPane permite que un area de texto tenga barras de desplazamiento
		JScrollPane scrollPane = new JScrollPane(txtArea);

		add(scrollPane);
	}
}