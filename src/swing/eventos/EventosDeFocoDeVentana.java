package swing.eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

public class EventosDeFocoDeVentana extends JFrame {
	private static final long serialVersionUID = 1L;

	public EventosDeFocoDeVentana() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// ventana principal
		EventosDeFocoDeVentana ventanaFocoMain = new EventosDeFocoDeVentana();
		ventanaFocoMain.setBounds(500, 200, 380, 300);
		ventanaFocoMain.setTitle("Ventana Foco");
		
		LanzaFocos foco = new LanzaFocos();
		ventanaFocoMain.addWindowFocusListener(foco);
		
		// ventana secundaria
		EventosDeFocoDeVentana ventanaFocoTwo = new EventosDeFocoDeVentana();
		ventanaFocoTwo.setBounds(500, 100, 380, 300);
	}	
}

// la interfaz WindowFocusListener responde a eventes de foco
class LanzaFocos implements WindowFocusListener {

	public void windowGainedFocus(WindowEvent e) {
		System.out.println("Ventana Foco: Has ganado el foco");
	}

	public void windowLostFocus(WindowEvent e) {
		System.out.println("Ventana Foco: Has perdido el foco");
	}		
}