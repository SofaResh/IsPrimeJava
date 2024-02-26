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
}