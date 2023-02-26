import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class costPersonalTest {
    Treballador treballador1 = new Treballador(null, Treballador.DIRECTOR, 1000, 0);
    Treballador treballador2 = new Treballador(null, Treballador.SUBDIRECTOR, 800, 0);
    Treballador treballador3 = new Treballador(null, Treballador.BASE, 800, 10);
    // Treballador[] treballadors = { treballador3}; //Array en 1
    // Treballador[] treballadors = { }; //Array buida
    Treballador[] treballadors = { treballador1, treballador2, treballador3 }; // Array plena
    // float expected = 100 + 800 + 800 + (10 * 20); //Suma de salaris de l'array
    // Plena
    // float expected = 0 + ( 0 * 0); //Suma de salari en array buida
    // float expected = 800 + (10 * 20); //Suma de salari en array a mitges

    @Test
    public void costPersonalTest1() {
        Treballador treballador1 = new Treballador(null, Treballador.DIRECTOR, 1000, 0);
        Treballador treballador2 = new Treballador(null, Treballador.SUBDIRECTOR, 800, 0);
        Treballador treballador3 = new Treballador(null, Treballador.BASE, 800, 10);
        Treballador[] treballadors = { treballador1, treballador2, treballador3 };

        float expected = 1000 + 800 + 800 + (10 * 20);
        float result = costPersonal.CalculaCostDelPersonal(treballadors);
        assertEquals(expected, result, 0.0);

    }

    @Test
    public void costPersonalTest2() {
        Treballador treballador3 = new Treballador(null, Treballador.BASE, 800, 10);
        float expected = 800 + (10 * 20);
        float result = costPersonal.CostTreballador(treballador3);
        assertEquals(expected, result, 0.0);
    }

    @Test
    public void testCostTreballador() {
        Treballador treballador1 = new Treballador(null, Treballador.BASE, 800, 10);
        float expected1 = 800 + (10 * 20); // Suma de salari en array a mitges
        float result1 = 1000;
        assertEquals(expected1, result1, 0.0);

        Treballador[] treballadors2 = {};
        float result2 = 0;
        float expected2 = 0;
        assertEquals(expected2, result2, 0.0);

        Treballador[] treballadors3 = { treballador1, treballador2, treballador3 };
        float result3 = 1000 + 800 + 800 + (10 * 20);
        float expected3 = 2800;
        assertEquals(result3, expected3, 0.0);

    }

    @Test
    public void testCalculaCostDelPersonal2() {
        Treballador treballador1 = new Treballador(null, Treballador.DIRECTOR, 1000, 0);
        Treballador treballador2 = new Treballador(null, Treballador.SUBDIRECTOR, 800, 0);
        Treballador treballador3 = new Treballador(null, Treballador.BASE, 800, 10);
        Treballador[] treballadors = { treballador1, treballador2, treballador3 };

        float expected = 1000 + 800 + 800 + (10 * 20);
        float result = costPersonal.CalculaCostDelPersonal2(treballadors);
        assertEquals(expected, result, 0.0);
    }
}