package swing.frames;

import java.awt.Graphics;

import javax.swing.*;

// clase para crear ventanas
public class CreandoLaminas extends JFrame {
	private static final long serialVersionUID = 1L;

	public CreandoLaminas() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		LaminaOne lamina = new LaminaOne();
		add(lamina);
	}

	public static void main(String[] args) {
		CreandoLaminas ventana = new CreandoLaminas();
		ventana.setBounds(500, 200, 380, 300);
	}
}

// la clase JPanel permite crear laminas
class LaminaOne extends JPanel {
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// Metodo para dibujar texto
		g.drawString("Primeros pasos", 120, 100);

		// Metodo para dibujar rectangulos
		g.drawRect(50, 50, 40, 30);

		// Metodo para dibujar lineas
		g.drawLine(20, 30, 60, 30);
	}
}