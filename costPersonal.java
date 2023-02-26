/**
 * Classe per a calcular el cost total de les nomines del personal *
 * 
 * @author Erick Gomez
 * 
 */
public class costPersonal {
    // static enum TipusTreballador{
    // DIRECTOR, SUBDIRECTOR, BASE
    // }
    static float CalculaCostDelPersonal(Treballador treballadors[]) {
        float costFinal = 0;
        Treballador treballador;
        for (int i = 0; i < treballadors.length; i++) {
            treballador = treballadors[i];
            if (treballador.getTipusTreballador() == Treballador.DIRECTOR ||
                    treballador.getTipusTreballador() == Treballador.SUBDIRECTOR) {
                costFinal += treballador.getNomina();
            } else {
                costFinal += treballador.getNomina() +
                        (treballador.getHoresExtres() * 20);
            }
        }
        return costFinal;
    }

    static float CostTreballador(Treballador treballador) {
        if (treballador.getTipusTreballador() == Treballador.DIRECTOR ||
                treballador.getTipusTreballador() == Treballador.SUBDIRECTOR) {
            return treballador.getNomina();

        } else {
            return treballador.getNomina() +
                    (treballador.getHoresExtres() *
                            20);
        }
    }

    static float CalculaCostDelPersonal2(Treballador treballadors[]) { // Versio refactoritzada del mètode anterior
        float costFinal = 0;
        Treballador treballador;
        for (int i = 0; i < treballadors.length; i++) {
            costFinal = costFinal + CostTreballador(treballadors[i]);
        }
        return costFinal;
    }
}

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

class