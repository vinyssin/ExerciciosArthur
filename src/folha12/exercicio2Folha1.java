package folha12;

import javax.swing.JOptionPane;
public class exercicio2Folha1 {
	public static void main(String args[]) {
	
	JOptionPane.showMessageDialog(null, "Bem vindo ao sistema");
	
	int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um numero de 1 a 7 para representar um dia da semana"));
	
	switch(opcao) {
	
	case DiasDaSemana.domingo:
		JOptionPane.showMessageDialog(null, "Domingo");
			break;
	
	case DiasDaSemana.segunda:
		JOptionPane.showMessageDialog(null, "Segunda");
			break;	
	case DiasDaSemana.terca:
		JOptionPane.showMessageDialog(null, "Terça");
			break;
	case DiasDaSemana.quarta:
		JOptionPane.showMessageDialog(null, "Quarta");
			break;
	case DiasDaSemana.quinta:
		JOptionPane.showMessageDialog(null, "Quinta");
		break;
	case DiasDaSemana.sexta:
		JOptionPane.showMessageDialog(null, "Sexta");
		break;
	case DiasDaSemana.sabado:
		JOptionPane.showMessageDialog(null, "Sabado");
		break;
		
		}
	}
}
