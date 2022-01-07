package swing.frames;

import javax.swing.JFrame;

// la clase JFrame permite crear ventanas
public class CreandoVentanas extends JFrame {
	private static final long serialVersionUID = 1L;

	public CreandoVentanas() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		
		// cada instancia representa una ventana
		CreandoVentanas ventana1 = new CreandoVentanas();
		ventana1.setLocation(300, 200);
		ventana1.setSize(400, 300);
		ventana1.setTitle("Ventana 1");

		CreandoVentanas ventana2 = new CreandoVentanas();
		ventana2.setBounds(700, 200, 380, 300);
		ventana2.setTitle("Ventana 2");		
	}
}