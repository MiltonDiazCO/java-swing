package swing.componentes;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioBotones extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public RadioBotones() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		LaminaRadio laminaRadios = new LaminaRadio();
		add(laminaRadios);
	}
	
	public static void main(String[] args) {
		RadioBotones radios = new RadioBotones();
		radios.setBounds(500, 200, 380, 300);
	}
}

class LaminaRadio extends JPanel {
	private static final long serialVersionUID = 1L;
	
	public LaminaRadio() {
		JLabel labelColor = new JLabel("Elija un color: ");
		
		// la clase ButtonGroup permite agrupar botones de radio
		ButtonGroup grupoBotones = new ButtonGroup();
		
		// la clase JRadioButton permite crear botones de radio
		JRadioButton btnAmarillo = new JRadioButton("Amarillo");
		JRadioButton btnAzul = new JRadioButton("Azul");
		JRadioButton btnRojo = new JRadioButton("Rojo");
		
		// agregando los botones a un grupo
		grupoBotones.add(btnAmarillo);
		grupoBotones.add(btnAzul);
		grupoBotones.add(btnRojo);
		
		add(labelColor);
		
		// agregando botones a la lamina
		add(btnAmarillo);
		add(btnAzul);
		add(btnRojo);	
	}	
}