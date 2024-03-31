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

	public ArrayList<Atleta> consultaAtletaPais(String pais) {
		ArrayList<Atleta> atletasEncontrados = new ArrayList<>();
		for (Atleta a : atleta) {
			if (a.getPais().equals(pais)){
				atletasEncontrados.add(a);
			}
		}
		return atletasEncontrados;
	}

	public ArrayList<Atleta> consultaAtletaPorTipoMedalha(int tipo){
		ArrayList <Atleta> atletasEncontrados = new ArrayList<>();
		for (Atleta a : atleta) {
			for (Medalha m : a.getMedalha()) {
				if (m.getTipo()== tipo){
					atletasEncontrados.add(a);
				}
			}
		}
		return atletasEncontrados;
	}

	public ArrayList<Atleta> consultaAtletaPorModalidadeMedalha(String modalidade){
		ArrayList <Atleta> atletasEncontrados = new ArrayList<>();
		for (Atleta a : atleta) {
			for (Medalha m : a.getMedalha()) {
				if (m.getModalidade().equals(modalidade)){
					atletasEncontrados.add(a);
				}
			}
		}
		return atletasEncontrados;
	}

	@Override
	public String toString() {
		return "Plantel{" +
				"atleta=" + atleta +
				'}';
	}
}
