package swing.disposiciones;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DisposicionLibre extends JFrame {
	private static final long serialVersionUID = 1L;

	public DisposicionLibre() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		LaminaLibre laminaLibre = new LaminaLibre();
		add(laminaLibre);
	}

	public static void main(String[] args) {
		DisposicionLibre disposicionLibre = new DisposicionLibre();
		disposicionLibre.setBounds(500, 200, 380, 300);
	}
}

class LaminaLibre extends JPanel {
	private static final long serialVersionUID = 1L;

	public LaminaLibre() {
		// estableciendo una disposicion libre
		setLayout(null);

		// al trabajar con disposiciones libres tenemos que colocar la ubicación
		// de cada elemento con el metodo "setBounds"
		JButton botonUno = new JButton("Boton 1");
		botonUno.setBounds(20, 20, 100, 30);
		add(botonUno);

		JButton botonDos = new JButton("Boton 2");
		botonDos.setBounds(140, 20, 100, 30);
		add(botonDos);
	}
}