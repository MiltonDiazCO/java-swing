package swing.eventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class EventosDeRaton extends JFrame {
	private static final long serialVersionUID = 1L;

	public EventosDeRaton() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MetodosEventosDeRaton evento = new MetodosEventosDeRaton();
		// el metodo addMouseListener() desencadena un evento cuando se manipula el mouse
		addMouseListener(evento);
	}
	
	public static void main(String[] args) {
		EventosDeRaton eventoDeRaton = new EventosDeRaton();
		eventoDeRaton.setBounds(500, 200, 380, 300);
	}
}

// la interfaz MouseListener responde a ventos del mouse
class MetodosEventosDeRaton implements MouseListener {

	public void mouseClicked(MouseEvent e) {
		System.out.println("has hecho click");
	}

	public void mousePressed(MouseEvent e) {
		System.out.println("Estas presionando el mouse");
	}

	public void mouseReleased(MouseEvent e) {
		System.out.println("Metodo que se ejecuta despues de haber hecho click");
	}

	public void mouseEntered(MouseEvent e) {
		System.out.println("Metodo que se ejecuta cuando se pasa el mouse por encima de un elemento");
	}

	public void mouseExited(MouseEvent e) {
		System.out.println("Metodo que se se ejcuta cuando se deja de pasar el mouse por encima de un elemento");
	}
}