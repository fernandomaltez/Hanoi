import org.example.CalculadoraHanoi;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class TestaHanoi {
    @Test
    public void TesteHanoi1() {

        CalculadoraHanoi cal1 = new CalculadoraHanoi();

        assertEquals(127, cal1.metodoCalcular(7), 0.0);
    }

    @Test
    public void TesteHanoi2() {

        CalculadoraHanoi cal1 = new CalculadoraHanoi();

        assertEquals(32767, cal1.metodoCalcular(15), 0.0);
    }


    //Teste usando número negativo ( não faz sentido no contexto da torre de Hanoi )
    @Test
    public void TesteHanoi3() {

        CalculadoraHanoi cal1 = new CalculadoraHanoi();

        assertEquals(-0.99609375, cal1.metodoCalcular(-8), 0.0);
    }



    @Test
    public void TesteHanoi4() {

        CalculadoraHanoi cal1 = new CalculadoraHanoi();

        assertEquals(255, cal1.metodoCalcular( 8), 0.0);
    }
}
