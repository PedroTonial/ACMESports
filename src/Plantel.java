import java.util.ArrayList;
import java.util.Collection;
public class Plantel {

	private ArrayList<Atleta> atleta;

	public Plantel() {
		atleta = new ArrayList<>();
	}

	public boolean cadastraAtleta(Atleta atleta) {
		if (consultaAtleta(atleta.getNumero()) != null){
			return false;
		}
		return this.atleta.add(atleta);
	}

	public Atleta consultaAtleta(String nome) {
		for (Atleta a : atleta) {
			if (a.getNome().equals(nome)){
				return a;
			}
		}
		return null;
	}

	public Atleta consultaAtleta(int numero) {
		for (Atleta a : atleta) {
			if (a.getNumero() == numero) {
				return a;
			}
		}
		return null;
	}

}
