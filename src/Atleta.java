import java.util.ArrayList;
import java.util.Collection;
public class Atleta {

	private int numero;

	private String nome;

	private String pais;

	private ArrayList<Medalha> medalha;

	public Atleta(int numero, String nome, String pais) {
		this.numero = numero;
		this.nome = nome;
		this.pais = pais;
		this.medalha = new ArrayList<>();
	}

	public void adicionaMedalha(Medalha medalha) {
		this.medalha.add(medalha);
	}

	public int consultaQuantidadeMedalhas() {
		int countMedalhas = 0;
		for (Medalha m : medalha) {
			countMedalhas++;
		}
		return countMedalhas;
	}


	public String getPais() {
		return pais;
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public ArrayList<Medalha> getMedalha() {
		return medalha;
	}

	@Override
	public String toString (){
		return  getNumero() + ", " + getNome() + ", " + getPais();
	}
}

