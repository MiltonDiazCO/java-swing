package swing.eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class EstadosDeVentana extends JFrame {
	private static final long serialVersionUID = 1L;

	public EstadosDeVentana() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		EstadoVentana oyente = new EstadoVentana();
		
		// el metodo "addWindowStateListener" desencadena un evento cuando la ventana cambie de estado
		addWindowStateListener(oyente);
	}

	public static void main(String[] args) {
		EstadosDeVentana ventana = new EstadosDeVentana();
		ventana.setBounds(500, 200, 380, 300);
	}
}

// la interfaz WindowStateListener permite manejar los estados de una ventana
class EstadoVentana implements WindowStateListener {

	public void windowStateChanged(WindowEvent e) {

		// el metodo "getNewState" devuelve el nuevo estado de una ventana
		if (e.getNewState() == JFrame.MAXIMIZED_BOTH) {
			System.out.println("La ventana ha sido maximizada");
		} else if (e.getNewState() == JFrame.ICONIFIED) {
			System.out.println("La ventana ha sido minimizada");
		// el metodo "getOldState" devueve el estado que tenia una ventana
		} else if (e.getOldState() == JFrame.MAXIMIZED_BOTH) {
			System.out.println("La ventana estaba maximizada");
		} else if (e.getOldState() == JFrame.ICONIFIED) {
			System.out.println("La ventana estaba minimizada");
		}
	}
}