package twoApackage;

public class TwoA
{

  /**
   * @param args
   */
  public static boolean
    multiple (int a, int b)
  {
    if (a % b == 0)
      {
        return true;
      }// if
    else
      return false;
  } // multiple ()

  public static boolean
    isOdd (int a)
  {
    if (a < 0)
      {
        a = (a * -1);
      }// if
    while (a > 0)
      {
        a -= 2;
      }// while (a > 0)
    if (a == 0)
      return false;
    else
      return true;
  } // isOdd()

  public static int
    oddSumTo (int n)
  {
    int sum = 0;
    if (isOdd (n) == false)
      {
        n++;
      }// if
    while (n > 1)
      {
        n -= 2;
        sum = sum + n;
      }// while (n > 1)
    return sum;
  } // oddSumTo()

  public static boolean
    isOddProd (int[] vals)
  {
    int oddCheck = 0;
    for (int i = 0; i < vals.length; i++)
      {
        if (isOdd (vals[i]))
          {
            oddCheck = oddCheck + 1;
          }// if
      }// for
    if (oddCheck >= 2)
      return true;
    else
      return false;
  } // isOddProd (int[] vals

  public static boolean
    allDistinct (int[] vals)
  {
    for (int i = 0; i < vals.length; i++)
      {
         for (int j = i + 1; j < vals.length; j++)
           {
             if (vals[i] == vals[j])
                 return false;
           }
      }
    return true;
  }
  
  public static int[]
      reverseInts(int[] vals)
  {
    int temp;
    for (int i = 0; i < (vals.length-i-1) ; i++)
      {
        temp = vals[vals.length-i-1];
        vals[vals.length-1-i] = vals[i];
        vals[i] = temp;
      }
    return vals;
  }

  public static void
    main (String[] args)
  {
    int[] values = {1, 2, 5, 18, 20};
    reverseInts (values);
    for (int i = 0; i <values.length; i++)
      {
        System.out.print (values[i] + " ");
      }

  }// main(String[] args)

}// TowA
