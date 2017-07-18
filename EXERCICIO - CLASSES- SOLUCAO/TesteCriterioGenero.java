
import java.util.ArrayList;
import java.util.List;

public class TesteCriterioGenero {

     public static void main(String[] args) {
          List<Individuo> listaIndividuo = new ArrayList<Individuo>();

          listaIndividuo.add(new Individuo("Marcos", "Masculino", "Casado"));
          listaIndividuo.add(new Individuo("Lucas", "Masculino", "Solteiro"));
          listaIndividuo.add(new Individuo("Flavia", "Feminino", "Casado"));
          listaIndividuo.add(new Individuo("Leda", "Feminino", "Solteiro"));
          listaIndividuo.add(new Individuo("Alberto", "Masculino", "Casado"));
          listaIndividuo.add(new Individuo("Caio", "Masculino", "Solteiro"));
          listaIndividuo.add(new Individuo("Priscila", "Feminino", "Casado"));

          System.out.println("\n********** Homens **********\n");

          Criterio criterio = new Homem();

          List<Individuo> IndividuosMasculino = criterio.atendeCriterio(listaIndividuo);

          for (Individuo masculino : IndividuosMasculino) {
               System.out.println("Nome: " + masculino.getNome()
                   + " Genero: " + masculino.getGenero()
                   + " Estado Civil: " + masculino.getEstadoCivil());
          }

          System.out.println("\n********** Mulheres **********\n");

          criterio = new Mulheres();

          List<Individuo> IndividuoFeminino = criterio.atendeCriterio(listaIndividuo);

          for (Individuo feminino : IndividuoFeminino) {
               System.out.println("Nome: " + feminino.getNome()
                   + " Genero: " + feminino.getGenero()
                   + "  Estado Civil: " + feminino.getEstadoCivil());
          }

          System.out.println("\n********** Homens Solteiros **********\n");

          criterio = new HomensSolteiros();

          List<Individuo> IndividuosMasculinoSolteiro = criterio.atendeCriterio(listaIndividuo);

          for (Individuo masculinoSolteiro : IndividuosMasculinoSolteiro) {
               System.out.println("Nome: " + masculinoSolteiro.getNome()
                   + " Genero: " + masculinoSolteiro.getGenero()
                   + "  Estado Civil: " + masculinoSolteiro.getEstadoCivil());
          }



          System.out.println("\n********** Solteiros **********\n");

          criterio = new Solteiros();

          List<Individuo> IndividuosSolteiros = criterio.atendeCriterio(listaIndividuo);

          for (Individuo solteiros : IndividuosSolteiros) {
               System.out.println("Nome: " + solteiros.getNome()
                   + " Genero: " + solteiros.getGenero()
                   + " Estado Civil: " + solteiros.getEstadoCivil());
          }

          System.out.println("\n********** Casados **********\n");

          criterio = new Casados();

          List<Individuo> IndividuosCasados = criterio.atendeCriterio(listaIndividuo);

          for (Individuo casados : IndividuosCasados) {
               System.out.println("Nome: " + casados.getNome()
                   + " Genero: " + casados.getGenero()
                   + " Estado Civil: " + casados.getEstadoCivil());
          }

          System.out.println("\n********** Homens Casados **********\n");

          criterio = new HomensCasados();

          List<Individuo> IndividuosHomensCasados = criterio.atendeCriterio(listaIndividuo);

          for (Individuo homensCasados : IndividuosHomensCasados) {
               System.out.println("Nome: " + homensCasados.getNome()
                   + " Genero: " + homensCasados.getGenero()
                   + " Estado Civil: " + homensCasados.getEstadoCivil());
          }

          System.out.println("\n********** Mulheres Casados **********\n");

          criterio = new MulheresCasadas();

          List<Individuo> MlherCasada = criterio.atendeCriterio(listaIndividuo);

          for (Individuo mulhercasada : MlherCasada) {
               System.out.println("Nome: " + mulhercasada.getNome()
                   + " Genero: " + mulhercasada.getGenero()
                   + " Estado Civil: " + mulhercasada.getEstadoCivil());
          }

     }
}
