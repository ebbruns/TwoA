package twoApackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoATest
{

  @Test
  public void
    testMultiple ()
  {
    assertEquals ("Simple case", true, TwoA.multiple (9, 3));
    assertEquals ("Identical number case", true, TwoA.multiple (5, 5));
    assertEquals ("Negative pass", true, TwoA.multiple (6, -2));
    assertEquals ("Negative fail", false, TwoA.multiple (7, -13));
  }// testMultiple ()

  @Test
  public void
    testIsOdd ()
  {
    assertEquals ("Simple case", false, TwoA.isOdd (10));
    assertEquals ("Simple case", true, TwoA.isOdd (5));
    assertEquals ("Zero case", false, TwoA.isOdd (0));
    assertEquals ("Negative case", true, TwoA.isOdd (-5));
  }// testIsOdd()

  @Test
  public void
    testOddSumTo ()
  {
    assertEquals ("Even case", 25, TwoA.oddSumTo (10));
    assertEquals ("Odd case", 9, TwoA.oddSumTo (7));
    assertEquals ("Large case", 2500, TwoA.oddSumTo (100));
    assertEquals ("Zero case", 0, TwoA.oddSumTo (0));
  }// testOddSumTo

  @Test
  public void
    testIsOddProd ()
  {
    int[] zeroCase = { 0, 0, 0, 0, 0, 0 };
    int[] evens = { 2, 4, 6, 8 };
    int[] singleOdd = { 3, 2, 4, 6 };
    int[] singleEven = { 2, 3, 5, 7, 9 };

    assertEquals ("Zero case", false, TwoA.isOddProd (zeroCase));
    assertEquals ("Evens case", false, TwoA.isOddProd (evens));
    assertEquals ("Single odd case", false, TwoA.isOddProd (singleOdd));
    assertEquals ("Single even case", true, TwoA.isOddProd (singleEven));
  }// testOddSumTo

  @Test
  public void
    testAllDistinct ()
  {
    int[] zeroCase = { 0, 0, 0, 0, 0, 0 };
    int[] evens = { 2, 4, 6, 8 };
    int[] hasDuplicate = { 2, 4, 6, 8, 8, 8 };

    assertEquals ("Zero case", false, TwoA.allDistinct (zeroCase));
    assertEquals ("Evens", true, TwoA.allDistinct (evens));
    assertEquals ("Duplicate case", false, TwoA.allDistinct (hasDuplicate));
  }

  @Test
  public void
    testReverseInts ()
  {
    int[] zeroCase = { 0, 0, 0, 0, 0, 0 };
    int[] evenNum = { 2, 4, 6, 8 };
    int[] evenNumReversed = {8, 6, 4, 2};
    int[] oddNum = {1, 2, 5, 18, 20};
    int[] oddNumReversed = {20, 18, 5, 2, 1};
    
    assertEquals ("Zero case", zeroCase, TwoA.reverseInts (zeroCase));
    for (int i = 0; i <oddNum.length; i++)
      {
        assertEquals("Odd Array", oddNumReversed[i], (TwoA.reverseInts (oddNum))[i]);
      }
    for (int i = 0; i <evenNum.length; i++)
      {
        assertEquals ("Even Array", evenNumReversed[i], (TwoA.reverseInts (evenNum))[i]);
      }
  }     

  public void
    testMain ()
  {
    fail ("Not yet implemented");
  }

}
