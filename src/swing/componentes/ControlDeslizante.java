package swing.componentes;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class ControlDeslizante extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public ControlDeslizante() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		LaminaDeslizante laminaControl = new LaminaDeslizante();
		add(laminaControl);
	}
	
	public static void main(String[] args) {
		ControlDeslizante controlDeslizante = new ControlDeslizante();
		controlDeslizante.setBounds(500, 200, 380, 300);
	}
}

class LaminaDeslizante extends JPanel {
	private static final long serialVersionUID = 1L;
	
	public LaminaDeslizante() {
		// la clase JSlider nos permite crear controles deslizantes
		JSlider slider = new JSlider(0, 100, 50);
		
		// metodo para indicar de cuanto en cuanto van las rayas grandes
		slider.setMajorTickSpacing(25);
		
		// metodo para indicar de cuanto en cuanto van las rayas pequeñas
		slider.setMinorTickSpacing(5);
		
		// metodo para mostrar las rayas del slider
		slider.setPaintTicks(true);
		
		// metodo para mostar los números que van en las rayas grandes del slider
		slider.setPaintLabels(true);
		
		// metodo para ajustar el control del slider de acuerdo a las rayas
		slider.setSnapToTicks(true);
		
		// agregando slider a la lamina
		add(slider);
	}
}