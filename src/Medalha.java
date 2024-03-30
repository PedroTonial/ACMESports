import java.util.ArrayList;
import java.util.Collection;
public class Medalha {

	private int codigo;

	private int tipo; //1 - Ouro  2-Prata  3-Bronze

	private boolean individual;

	private String modalidade;

	private ArrayList<Atleta> atleta;

	public Medalha(int codigo, int tipo, boolean individual, String modalidade) {
		this.codigo = codigo;
		this.tipo = tipo;
		this.individual = individual;
		this.modalidade = modalidade;
		this.atleta = new ArrayList<>();
	}

	public void adicionaAtleta(Atleta atleta) {
		this.atleta.add(atleta);
	}

	public int getCodigo() {
		return codigo;
	}

	public int getTipo() {
		return tipo;
	}

	public String getModalidade() {
		return modalidade;
	}

	@Override
	public String toString() {
		return  codigo +
				", " + tipo +
				", " + individual +
				", " + modalidade;
	}
}
