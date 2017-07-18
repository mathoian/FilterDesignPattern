
import java.util.ArrayList;
import java.util.List;

public class MulheresSolteiras implements Criterio {

	@Override
	
	public List<Individuo> atendeCriterio(List<Individuo> individuoList){
		
		List<Individuo> mulherSolteira = new ArrayList<Individuo>();
		
		for(Individuo individuo : individuoList){
			if(individuo.getEstadoCivil().equalsIgnoreCase("Solteiro") && individuo.getGenero().equalsIgnoreCase("Feminino"))
				mulherSolteira.add(individuo);
		}
		return mulherSolteira; 
	}
}