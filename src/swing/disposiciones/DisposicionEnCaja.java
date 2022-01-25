package swing.disposiciones;

import java.awt.BorderLayout;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DisposicionEnCaja extends JFrame {
	private static final long serialVersionUID = 1L;

	public DisposicionEnCaja() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		LaminaBox laminaCaja = new LaminaBox();
		add(laminaCaja);
	}

	public static void main(String[] args) {
		DisposicionEnCaja disposicionCaja = new DisposicionEnCaja();
		disposicionCaja.setBounds(500, 200, 380, 300);
	}
}

class LaminaBox extends JPanel {
	private static final long serialVersionUID = 1L;

	public LaminaBox() {
		// la clase Box nos permite crear contenedores
		
		// el metodo "createHorizontalBox" permite crear un contenedor horizontal
		Box cajaHorizontalUno = Box.createHorizontalBox();

		// agregando elementos al contenedor horizontal

		cajaHorizontalUno.add(new JLabel("Nombre: "));

		// el metodo "createHorizontalStrut" permite crear un espacio horizontal vacio
		cajaHorizontalUno.add(Box.createHorizontalStrut(10));
		cajaHorizontalUno.add(new JTextField(10));

		Box cajaHorizontalDos = Box.createHorizontalBox();

		cajaHorizontalDos.add(new JLabel("Apellido: "));
		cajaHorizontalDos.add(Box.createHorizontalStrut(10));
		cajaHorizontalDos.add(new JTextField(10));

		// el metodo "createVerticalBox" permite crear un contenedor vertical
		Box cajaVertical = Box.createVerticalBox();

		// agregando elementos al contenedor vertical
		cajaVertical.add(cajaHorizontalUno);
		cajaVertical.add(cajaHorizontalDos);

		// agregando el contenedor principal en el centro de la lamina
		add(cajaVertical, BorderLayout.CENTER);
	}
}