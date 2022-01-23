package swing.eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class MultiplesFuentes extends JFrame {
	private static final long serialVersionUID = 1L;

	public MultiplesFuentes() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Lamina laminaPrincipal = new Lamina();
		add(laminaPrincipal);
	}

	public static void main(String[] args) {
		MultiplesFuentes fuentes = new MultiplesFuentes();
		fuentes.setBounds(500, 200, 380, 300);
	}
}

class Lamina extends JPanel {
	private static final long serialVersionUID = 1L;

	public Lamina() {

		// acciones
		AccionColor accionAmarillo = new AccionColor("Amarillo", Color.YELLOW);
		AccionColor accionRojo = new AccionColor("Rojo", Color.RED);

		// botones
		add(new JButton(accionAmarillo));
		add(new JButton(accionRojo));
		
		// etiquetas
		add(new JLabel("Control + A: Para poner el fondo de color amarillo"));
		add(new JLabel("Control + R: Para poner el fondo de color rojo"));

		// eventos de Teclado

		// creando mapa de entrada
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

		// creando combinacion de teclas
		KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl A");
		KeyStroke teclaRojo = KeyStroke.getKeyStroke("ctrl R");

		// asignando la combinacion de teclas a un objeto
		mapaEntrada.put(teclaAmarillo, "fondoAmarillo");
		mapaEntrada.put(teclaRojo, "fondoRojo");

		// asociando la combinacion de teclas con una accion
		ActionMap mapaAccion = getActionMap();

		// asignando el objeto a la accion
		mapaAccion.put("fondoAmarillo", accionAmarillo);
		mapaAccion.put("fondoRojo", accionRojo);
	}

	// clase para manejar las acciones
	private class AccionColor extends AbstractAction {
		private static final long serialVersionUID = 1L;

		public AccionColor(String nombre, Color colorBoton) {
			putValue(Action.NAME, nombre);
			putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color " + nombre);
			putValue("COLOR_DE_FONDO", colorBoton);
		}

		public void actionPerformed(ActionEvent e) {
			Color colorFondo = (Color) getValue("COLOR_DE_FONDO");

			setBackground(colorFondo);
		}
	}
}