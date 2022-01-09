package swing.frames;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColocandoImagenes extends JFrame {
	private static final long serialVersionUID = 1L;

	public ColocandoImagenes() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		LaminaImagen laminaImagen = new LaminaImagen();
		add(laminaImagen);
	}

	public static void main(String[] args) {
		ColocandoImagenes ventanaOne = new ColocandoImagenes();
		ventanaOne.setBounds(500, 200, 380, 300);
	}
}

class LaminaImagen extends JPanel {
	private static final long serialVersionUID = 1L;

	// la clase Image permite guardar imagenes
	private Image imagen;

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		
		// la clase File permite guardar archivos
		File miImagen = new File("img/car.jpeg");

		try {
			imagen = ImageIO.read(miImagen);
		} catch (IOException e) {
			System.out.println(e);
		}

		// dibujando imagen en la lamina
		g.drawImage(imagen, 10, 10, 340, 230, null);
	}
}