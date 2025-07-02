package uy.edu.ucu.aed;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Parcial2Test_Junit5
{
    public class TiempoMinimoViaje{
        private TiempoMinimoViaje calculadoraViaje;
        @BeforeEach
        public void setUp() {
            calculadoraViaje = new TiempoMinimoViaje;
            configurarRedBasica();
        }
        public void configurarRedBasica(){
            calculadoraViaje.agregarRuta("A","B",25);
            calculadoraViaje.agregarRuta("C","B",5);
            calculadoraViaje.agregarRuta("A","C",15);
            calculadoraViaje.agregarRuta("D");
        }
        @Test
        public void EncontrarCaminoDirecto(){
            int tiempo = calculadoraViaje.consultaTiempoMinimo("A","C");
            assertEquals(15,tiempo);
        }
        @Test
        public void EncontrarCaminoIndirecto(){
            int tiempo = calculadoraViaje.consultaTiempoMinimo("A","B");
            assertEquals = (20,tiempo); //debería hacer A -> C -> B y no A -> B
        }
        @Test
        public void noExisteCamino(){
            assertThrows (NoExisteCaminoException.class,calculadoraViaje.consultaTiempoMinimo("A","D"));
        }
    }




    @AfterEach
    public void tearDown() {
        // Release any resources or clean up after the tests
        instanceVariable = null;
    }

    /**
     * Sample test in JUnit 5
     */
    @Test
    public void shouldAnswerWithTrueInJUnit5Test()
    {
        assertTrue(instanceVariable != null);
    }
}
/* posibles tests:
-   que calcule el camino directo si no hay otro
-   que calcule el camino indirecto si es menor
-   que retorne -1 si no hay camino que llegue
-   que maneje rutas bidireccionales
-
 */