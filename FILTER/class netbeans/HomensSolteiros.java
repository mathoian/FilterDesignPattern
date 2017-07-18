import java.util.ArrayList;
import java.util.List;

public class HomensSolteiros implements Criterio {

	@Override
	public List<Individuo> atendeCriterio(List<Individuo> individuoList) {
		
		List<Individuo> solteiros = new ArrayList<Individuo>();
		
		for(Individuo individuo : individuoList){
			if(individuo.getGenero().equalsIgnoreCase("Masculino") && individuo.getEstadoCivil().equalsIgnoreCase("Solteiro"))
					solteiros.add(individuo);				
		}
		return solteiros;
	}
}
