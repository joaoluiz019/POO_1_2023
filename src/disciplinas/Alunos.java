package disciplinas;
import java.util.ArrayList;

public class Alunos {
	
	private String nome;
	private ArrayList<Disciplinas> disciplinas = new ArrayList<Disciplinas>();
	private ArrayList<Notas> notas = new ArrayList<Notas>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Disciplinas> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(ArrayList<Disciplinas> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public ArrayList<Notas> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Notas> notas) {
		this.notas = notas;
	}
	
	
	
}
