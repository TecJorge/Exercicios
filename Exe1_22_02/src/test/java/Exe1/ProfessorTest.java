package Exe1;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @org.junit.jupiter.api.Test
    void calcPagMensal() {
        Professor instance = new Professor("Diogo",90,"coordenador");
        double expResult=2250;
        double Result=instance.calcPagMensal();
        assertEquals(expResult,Result,0.001);
    }
}