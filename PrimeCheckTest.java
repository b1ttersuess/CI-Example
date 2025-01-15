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
    assertTrue("Test '2' (prime)", isPrime(2));
    assertTrue("Test '3' (prime)", isPrime(3));
    assertTrue("Test '5' (prime)", isPrime(5));
    assertTrue("Test '7' (prime)", isPrime(7));
    assertTrue("Test '11' (prime)", isPrime(11));
    assertTrue("Test '13' (prime)", isPrime(13));
    assertTrue("Test '23' (prime)", isPrime(23));
    assertTrue("Test '43' (prime)", isPrime(43));
    assertTrue("Test '97' (prime)", isPrime(97));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
   assertFalse("Test '4' (non-prime)", isPrime(4));
   assertFalse("Test '6' (non-prime)", isPrime(6));
   assertFalse("Test '8' (non-prime)", isPrime(8));
   assertFalse("Test '10' (non-prime)", isPrime(10));
   assertFalse("Test '25' (non-prime)", isPrime(25));
   assertFalse("Test '50' (non-prime)", isPrime(50));
   assertFalse("Test '100' (non-prime)", isPrime(100));
  }
}
