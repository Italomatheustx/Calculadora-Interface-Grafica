package calculadora.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import calculadora.modelo.Memoria;
import calculadora.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador {
	
	private final JLabel label;
	
	public Display() {
		Memoria.getInstancia().adicionarObservador(this);
		
		setBackground(new Color(30, 30, 30));
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setForeground(Color.white);
		label.setFont(new Font("Counter", Font.BOLD, 45));
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 80));
		add(label);
			}
	
	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
	}
}
