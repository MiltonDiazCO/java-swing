package swing.eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class EventosDeVentana extends JFrame {
	private static final long serialVersionUID = 1L;

	public EventosDeVentana() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		VentanaEventos ventanaOyente = new VentanaEventos();
		
		// el metodo "addWindowListener" desencadena eventos de ventana
		addWindowListener(ventanaOyente);
	}

	public static void main(String[] args) {
		EventosDeVentana ventanaEventos = new EventosDeVentana();
		ventanaEventos.setBounds(500, 200, 380, 300);
	}
}

// la interfaz WindowListener responde a eventos de ventana
class VentanaEventos implements WindowListener {

	public void windowOpened(WindowEvent e) {
		System.out.println("Ventana Abierta");
	}

	public void windowClosing(WindowEvent e) {
		System.out.println("Cerrando Ventana");
	}

	public void windowClosed(WindowEvent e) {
		System.out.println("Ventana Cerrada");
	}

	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana Minimizada");
	}

	public void windowDeiconified(WindowEvent e) {
		System.out.println("Ventana Restaurada");
	}

	public void windowActivated(WindowEvent e) {
		System.out.println("Ventana activada");
	}

	public void windowDeactivated(WindowEvent e) {
		System.out.println("Ventana Desactivada");
	}
}