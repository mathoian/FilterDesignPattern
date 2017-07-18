
import java.util.ArrayList;
import java.util.List;

public class Mulheres implements Criterio {

	@Override
	public List<Individuo> atendeCriterio(List<Individuo> individuoList) {
		
		List<Individuo> feminino = new ArrayList<Individuo>();
		
		for(Individuo individuo : individuoList){
			if(individuo.getGenero().equalsIgnoreCase("Feminino"))
				feminino.add(individuo);
		}
		return feminino; 
	}
}