package swing.disposiciones;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DisposicionGridLayout extends JFrame {
	private static final long serialVersionUID = 1L;

	public DisposicionGridLayout() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		LaminaGridLayout laminaGridLayout = new LaminaGridLayout();
		add(laminaGridLayout);
	}

	public static void main(String[] args) {
		DisposicionGridLayout gridLayout = new DisposicionGridLayout();
		gridLayout.setBounds(500, 200, 380, 300);
	}
}

class LaminaGridLayout extends JPanel {
	private static final long serialVersionUID = 1L;

	public LaminaGridLayout() {
		// la clase GridLayout divide el contenedor en filas y columnas

		// estableciendo el GriLayout(3 filas, 2 columnas)
		setLayout(new GridLayout(3, 2));

		// agregando componentes
		
		// fila 1
		add(new JButton("1"));
		add(new JButton("2"));
		
		// fila 2
		add(new JButton("3"));
		add(new JButton("4"));
		
		// fila 3
		add(new JButton("5"));
		add(new JButton("6"));
	}
}