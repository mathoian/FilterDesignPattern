
import java.util.ArrayList;
import java.util.List;

public class HomensCasados implements Criterio {

     @Override

     public List<Individuo> atendeCriterio(List<Individuo> individuoList) {

          List<Individuo> homemCasado = new ArrayList<Individuo>();

          for (Individuo individuo : individuoList) {
               if (individuo.getEstadoCivil().equalsIgnoreCase("Casado") && individuo.getGenero().equalsIgnoreCase("Masculino")) {
                    homemCasado.add(individuo);
               }
          }
          return homemCasado;
     }
}
