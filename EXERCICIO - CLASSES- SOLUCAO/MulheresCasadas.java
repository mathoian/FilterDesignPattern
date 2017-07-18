import java.util.ArrayList;
import java.util.List;

public class MulheresCasadas implements Criterio {

	@Override
	
	public List<Individuo> atendeCriterio(List<Individuo> individuoList){
		
		List<Individuo> mulherCasada = new ArrayList<Individuo>();
		
		for(Individuo individuo : individuoList){
			if(individuo.getEstadoCivil().equalsIgnoreCase("Casado") && individuo.getGenero().equalsIgnoreCase("Feminino"))
				mulherCasada.add(individuo);
		}
		return mulherCasada; 
	}
}