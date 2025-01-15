import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    assertEquals("Test '2' (prime)", true, PrimeCheck.isPrime(2));
    assertEquals("Test '3' (prime)", true, PrimeCheck.isPrime(3));
    assertEquals("Test '5' (prime)", true, PrimeCheck.isPrime(5));
    assertEquals("Test '7' (prime)", true, PrimeCheck.isPrime(7));
    assertEquals("Test '11' (prime)", true, PrimeCheck.isPrime(11));
    assertEquals("Test '13' (prime)", true, PrimeCheck.isPrime(13));
    assertEquals("Test '23' (prime)", true, PrimeCheck.isPrime(23));
    assertEquals("Test '43' (prime)", true, PrimeCheck.isPrime(43));
    assertEquals("Test '97' (prime)", true, PrimeCheck.isPrime(97));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    assertEquals("Test '4' (non-prime)", false, PrimeCheck.isPrime(4));
    assertEquals("Test '6' (non-prime)", false, PrimeCheck.isPrime(6));
    assertEquals("Test '8' (non-prime)", false, PrimeCheck.isPrime(8));
    assertEquals("Test '10' (non-prime)", false, PrimeCheck.isPrime(10));
    assertEquals("Test '25' (non-prime)", false, PrimeCheck.isPrime(25));
    assertEquals("Test '50' (non-prime)", false, PrimeCheck.isPrime(50));
    assertEquals("Test '100' (non-prime)", false, PrimeCheck.isPrime(100));
  }
}
