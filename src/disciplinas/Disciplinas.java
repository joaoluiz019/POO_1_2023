package disciplinas;

import javax.swing.JOptionPane;

public class Disciplinas {
	
	String nome;
	Professores professor = new Professores();
	double cargaHoraria;
	
	void cadastraDisciplina() {
		
		nome = JOptionPane.showInputDialog("Informe nome");
		cargaHoraria = Double.parseDouble(JOptionPane.showInputDialog("Informe a Carga Horaria da Matéria"));
		
	}
}
