import java.util.ArrayList;
import java.util.List;

public class Casados implements Criterio {

	@Override
	
	public List<Individuo> atendeCriterio(List<Individuo> individuoList){
		
		List<Individuo> casados = new ArrayList<Individuo>();
		
		for(Individuo individuo : individuoList){
			if(individuo.estadoCivil.equalsIgnoreCase("Casado"))
				casados.add(individuo);
		}
		return casados; 
	}
}