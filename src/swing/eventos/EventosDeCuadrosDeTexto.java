package swing.eventos;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class EventosDeCuadrosDeTexto extends JFrame {
	private static final long serialVersionUID = 1L;

	public EventosDeCuadrosDeTexto() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		LaminaEventosTexto laminaTexto = new LaminaEventosTexto();
		add(laminaTexto);
	}

	public static void main(String[] args) {
		EventosDeCuadrosDeTexto eventoTexto = new EventosDeCuadrosDeTexto();
		eventoTexto.setBounds(500, 200, 380, 300);
	}
}

class LaminaEventosTexto extends JPanel {
	private static final long serialVersionUID = 1L;

	private JLabel etiquetaNombre = new JLabel("Nombre");
	// creando el cuadro de texto
	private JTextField cuadroDeTexto = new JTextField(20);

	public LaminaEventosTexto() {

		EscuchaTexto evento = new EscuchaTexto();

		// el metodo "getDocument" devuelve un objeto de tipo Documento
		// con una representacion del texto escrito en un cuadro de texto
		Document doc = cuadroDeTexto.getDocument();

		// el metodo "addDocumentListener" hace que un cuadro de texto desencadene un evento
		doc.addDocumentListener(evento);

		add(etiquetaNombre);
		add(cuadroDeTexto);
	}

	// la interfaz DocumentListener responde a eventos de cuadros de texto
	private class EscuchaTexto implements DocumentListener {

		public void validarNombre() {

			if (cuadroDeTexto.getText().length() >= 4 && cuadroDeTexto.getText().length() <= 12) {
				cuadroDeTexto.setBackground(Color.WHITE);
			} else {
				cuadroDeTexto.setBackground(Color.RED);
			}
		}

		// se ejecuta cuando se escribe algo en un cuadro de texto
		public void insertUpdate(DocumentEvent e) {
			validarNombre();
		}

		// se ejecuta cuando se borra algo en un cuadro de texto
		public void removeUpdate(DocumentEvent e) {
			validarNombre();
		}

		// se ejecuta cuando se cambia alguna propiedad de un cuadro de texto
		public void changedUpdate(DocumentEvent e) {
		}

	}
}