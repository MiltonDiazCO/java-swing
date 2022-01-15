package swing.componentes;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class BarraDeMenus extends JFrame {
	private static final long serialVersionUID = 1L;

	public BarraDeMenus() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		LaminaMenu laminaMenu = new LaminaMenu();
		add(laminaMenu);
	}

	public static void main(String[] args) {
		BarraDeMenus barraMenu = new BarraDeMenus();
		barraMenu.setBounds(500, 200, 380, 300);
	}
}

class LaminaMenu extends JPanel {
	private static final long serialVersionUID = 1L;

	public LaminaMenu() {
		// la clase JMenuBar nos permite crear barras de menu
		JMenuBar barraPrincipal = new JMenuBar();

		// la clase JMenu nos permite crear menus
		JMenu menuArchivo = new JMenu("Archivo");
		JMenu menuEdicion = new JMenu("Edicion");
		JMenu menuHerramientas = new JMenu("Herramientas");

		// agregando los menus a la barra de menus
		barraPrincipal.add(menuArchivo);
		barraPrincipal.add(menuEdicion);
		barraPrincipal.add(menuHerramientas);

		// la clase JMenuItem nos permite crear los items de un menu
		JMenuItem itemGuardar = new JMenuItem("Guardar");
		JMenuItem itemGuardarComo = new JMenuItem("Guardar Como");

		JMenuItem itemCortar = new JMenuItem("Cortar");
		JMenuItem itemCopiar = new JMenuItem("Copiar");
		JMenuItem itemPegar = new JMenuItem("Pegar");

		JMenuItem itemHerramientas = new JMenuItem("Herramientas");

		// agregando los itemas a los menus
		menuArchivo.add(itemGuardar);
		menuArchivo.add(itemGuardarComo);

		menuEdicion.add(itemCortar);
		menuEdicion.add(itemCopiar);
		menuEdicion.add(itemPegar);

		menuHerramientas.add(itemHerramientas);

		// agregando la barra de menu a la lamina
		add(barraPrincipal);
	}
}