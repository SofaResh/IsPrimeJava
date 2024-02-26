import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class IsPrimeTest {

    @Test
    void isPrimeTrue1() {
        assertTrue(IsPrime.isPrime(2));
    }

    @Test
    void isPrimeTrue2() {
        assertTrue(IsPrime.isPrime(3));
    }

    @Test
    void isPrimeTrue3() {
        assertTrue(IsPrime.isPrime(11));
    }

    @Test
    void isPrimeFalse1() {
        assertFalse(IsPrime.isPrime(4));
    }

    @Test
    void isPrimeFalse2() {
        assertFalse(IsPrime.isPrime(12));
    }

    @Test
    void isPrimeFalse3() {
        assertFalse(IsPrime.isPrime(26));
    }
}