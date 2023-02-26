import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CompteCorrentTest {
    @Test
    public void testCompteCorrent() {
        int saldo = 10000;
        String contrasenya = "XD123";
        CompteCorrent meuCompteCorrent = new CompteCorrent(saldo, contrasenya);
        //Comparem el saldo despres de haver-lo modificat amb la funció 
        assertEquals(saldo, meuCompteCorrent.getSaldo2());
        //Comparem la contrasenya
        assertEquals(contrasenya, meuCompteCorrent.getContra());
    }

    @Test
    public void testDiposita() {
        int saldo = 10000;
        String contrasenya = "XD123";
        CompteCorrent meuCompteCorrent = new CompteCorrent(saldo, contrasenya);
        int nouSaldo = meuCompteCorrent.diposita(50);
        assertEquals(10050, nouSaldo);
    }

    @Test
    public void testRetira() {
        int saldo = 10000;
        String contrasenya = "XD123";
        CompteCorrent meuCompteCorrent2 = new CompteCorrent(saldo, contrasenya);
        CompteCorrent meuCompteCorrent3 = new CompteCorrent(saldo, contrasenya);
        CompteCorrent meuCompteCorrent = new CompteCorrent(saldo, contrasenya);
        int dinersRetirats = meuCompteCorrent.retira(50, contrasenya);
        int dinersRetirats2 = meuCompteCorrent2.retira(50, "Incorrecte");
        int dinersRetirats3 = meuCompteCorrent3.retira(200000, contrasenya);

        assertEquals(9950, dinersRetirats);
        assertEquals(-2, dinersRetirats2);
        assertEquals(-1, dinersRetirats3);
    }
    // int saldoActual = meuCompteCorrent.diposita(60);

    // meuCompteCorrent.getSaldo("XD123");
    // System.out.println(meuCompteCorrent);

}
