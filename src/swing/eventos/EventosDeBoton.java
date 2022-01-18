package swing.eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventosDeBoton extends JFrame {
	private static final long serialVersionUID = 1L;

	public EventosDeBoton() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		LaminaBotones laminaConBotones = new LaminaBotones();
		add(laminaConBotones);
	}

	public static void main(String[] aegs) {
		EventosDeBoton ventanaEventosDeBoton = new EventosDeBoton();
		ventanaEventosDeBoton.setBounds(500, 200, 380, 300);
	}
}

// la interfaz ActionListener responde a eventos de boton
class LaminaBotones extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;

	// creando loss botones
	JButton botonAzul = new JButton("Boton Azul");
	JButton botonAmarillo = new JButton("Boton Amarillo");

	public LaminaBotones() {
		add(botonAzul);
		add(botonAmarillo);

		// el metodo "addActionListener" desencadena eventos de boton
		botonAzul.addActionListener(this);
		botonAmarillo.addActionListener(this);
	}

	// el metodo "actionPerformed" estara a la escucha de un evento
	public void actionPerformed(ActionEvent e) {

		// el metodo "getSource" devuelve el objeto fuente que desencadeno el evento
		Object botonPulsado = e.getSource();

		if (botonPulsado == botonAzul) {
			setBackground(Color.BLUE);
		} else if (botonPulsado == botonAmarillo) {
			setBackground(Color.YELLOW);
		}
	}
}