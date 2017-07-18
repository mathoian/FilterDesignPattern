
public class Individuo {

	String nome;
	String genero;
	String estadoCivil;
	public Individuo(String nome, String genero, String estadoCivil) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.estadoCivil = estadoCivil;
	}
	public String getNome() {
		return nome;
	}
	public String getGenero() {
		return genero;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
}
