package swing.componentes;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class MenuEmergente extends JFrame {
	private static final long serialVersionUID = 1L;

	public MenuEmergente() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		LaminaEmergente laminaEmergente = new LaminaEmergente();
		add(laminaEmergente);
	}

	public static void main(String[] args) {
		MenuEmergente menuEmergente = new MenuEmergente();
		menuEmergente.setBounds(500, 200, 380, 300);
	}
}

class LaminaEmergente extends JPanel {
	private static final long serialVersionUID = 1L;

	public LaminaEmergente() {
		JLabel labelClick = new JLabel("Haga click derecho para activar el menu emergente");

		add(labelClick);

		// la clase JPopupMenu permite crear menus emergentes
		JPopupMenu menu = new JPopupMenu();

		// creando items para agregar al menu emergente
		JMenuItem itemCortar = new JMenuItem("Cortar");
		JMenuItem itemCopiar = new JMenuItem("Copiar");
		JMenuItem itemPegar = new JMenuItem("Pegar");

		// agregando los items al menu emergente
		menu.add(itemCortar);
		menu.add(itemCopiar);
		menu.add(itemPegar);

		// agregando el menu emergente a la lamina
		setComponentPopupMenu(menu);
	}
}