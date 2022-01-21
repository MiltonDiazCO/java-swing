package swing.eventos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class EventosDeTeclado extends JFrame {
	private static final long serialVersionUID = 1L;

	public EventosDeTeclado() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel texto = new JLabel("Pulse cualquier tecla");
		add(texto);

		MetodosEventosDeTeclado tecla = new MetodosEventosDeTeclado();
		
		// el metodo addKeyListener() desencadena una accion cuando se pulse una tecla
		addKeyListener(tecla);
	}

	public static void main(String[] args) {
		EventosDeTeclado eventoTeclado = new EventosDeTeclado();
		eventoTeclado.setBounds(500, 200, 380, 300);
	}
}

// la interfaz KeyListener responde a eventos de teclado
class MetodosEventosDeTeclado implements KeyListener {

	public void keyPressed(KeyEvent e) {
		// el metodo getKeyCode() devuelve el codigo de la tecla pulsada		
		System.out.println(e.getKeyCode());
	}
	
	public void keyReleased(KeyEvent e) {
		// el metodo getKeyChar() devuelve el caracter de la tecla pulsada
		System.out.println(e.getKeyChar());
	}
	
	public void keyTyped(KeyEvent e) {}
}