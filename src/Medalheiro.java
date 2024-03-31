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

	public ArrayList<Medalha> consultaMedalhas(String modalidade) {
		ArrayList<Medalha> medalhasEncontradas = new ArrayList<>();
		for (Medalha m : medalha) {
			if (m.getModalidade().equals(modalidade)){
				medalhasEncontradas.add(m);
			}
		}
		return medalhasEncontradas;
	}

	/* @Override
	public String toString() {
		return "Medalheiro{" +
				"medalha=" + medalha +
				'}';
	}*/ //toString pra testas na ACME se as medalhas estavam sendo cadastradas corretamente
}
