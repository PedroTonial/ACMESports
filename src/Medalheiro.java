import java.util.Collection;
import java.util.ArrayList;

public class Medalheiro {

	private ArrayList<Medalha> medalha;

	public Medalheiro() {
		medalha = new ArrayList<>();
	}

	public boolean cadastraMedalha(Medalha m) {
		if (consultaMedalha(m.getCodigo()) != null){
			return false;
		}
		return medalha.add(m);
	}

	public Medalha consultaMedalha(int codigo) {
		for (Medalha m : medalha) {
			if (m.getCodigo() == codigo){
				return m;
			}
		}
		return null;
	}

	public ArrayList<Medalha> consultarMedalhas(String modalidade) {
		ArrayList<Medalha> medalhasEncontradas = new ArrayList<>();

		for (Medalha m : medalha) {
			if (m.getModalidade().equals(modalidade)) {
				medalhasEncontradas.add(m);
			}
		}
		return medalhasEncontradas;
	}

	public ArrayList<Medalha> consultarMedalhas(int tipo) {
		ArrayList<Medalha> medalhasEncontradas = new ArrayList<>();

		for (Medalha m : medalha) {
			if (m.getTipo() == tipo) {
				medalhasEncontradas.add(m);
			}
		}
		return medalhasEncontradas;
	}
}

