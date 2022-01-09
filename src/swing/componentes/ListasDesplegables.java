package swing.componentes;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ListasDesplegables extends JFrame {
	private static final long serialVersionUID = 1L;

	public ListasDesplegables() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		LaminaDesplegable laminaLista = new LaminaDesplegable();
		add(laminaLista);
	}
	
	public static void main(String[] args) {
		ListasDesplegables lista = new ListasDesplegables();
		lista.setBounds(500, 200, 380, 300);
	}
}

class LaminaDesplegable extends JPanel {
	private static final long serialVersionUID = 1L;

	public LaminaDesplegable() {
		JLabel labelPais = new JLabel("Elija un pais: ");
		
		// la clase JComboBox nos permite crear listas desplegables
		JComboBox comboUno = new JComboBox();
		
		// agregando opciones a la lista desplegable
		comboUno.addItem("Colombia");
		comboUno.addItem("Argentina");
		comboUno.addItem("Chile");
		
		add(labelPais);
		add(comboUno);
	}
}