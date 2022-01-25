package swing.disposiciones;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DisposicionFlowLayout extends JFrame {
	private static final long serialVersionUID = 1L;

	public DisposicionFlowLayout() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		LaminaFlowLayout laminaFlowLayout = new LaminaFlowLayout();
		add(laminaFlowLayout);
	}

	public static void main(String[] args) {
		DisposicionFlowLayout flowLayout = new DisposicionFlowLayout();
		flowLayout.setBounds(500, 200, 380, 300);
	}
}

class LaminaFlowLayout extends JPanel {
	private static final long serialVersionUID = 1L;

	public LaminaFlowLayout() {
		// la clase FlowLayout va colocando los elementos en la parte superior del
		// contenedor y los va colocando uno al lado del otro

		// el metodo 'setLayout' establece que disposicion va a tener el contenedor

		// estableciendo el FlowLayout
		setLayout(new FlowLayout());

		// agregando componentes
		add(new JButton("Boton 1"));
		add(new JButton("Boton 2"));
	}
}