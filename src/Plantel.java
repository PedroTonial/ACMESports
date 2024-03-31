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

	/*public Atleta consultaAtleta(String pais) {
		for (Atleta a : atleta) {
			if (a.getPais().equals(pais)){
				return a;
			}
		}
		return null;
	}*/


	public Atleta consultaAtleta(int numero) {
		for (Atleta a : atleta) {
			if (a.getNumero() == numero) {
				return a;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "Plantel{" +
				"atleta=" + atleta +
				'}';
	}
}
