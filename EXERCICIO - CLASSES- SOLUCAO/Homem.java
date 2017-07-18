
import java.util.ArrayList;
import java.util.List;

public class Homem implements Criterio {

     @Override

     public List<Individuo> atendeCriterio(List<Individuo> individuoList) {

          List<Individuo> masculino = new ArrayList<Individuo>();

          for (Individuo individuo : individuoList) {
               if (individuo.getGenero().equalsIgnoreCase("Masculino")) {
                    masculino.add(individuo);
               }
          }
          return masculino;
     }
}
