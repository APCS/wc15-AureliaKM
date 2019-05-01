
/**
 * Do not upload this file to webcat if you like good grades.
 * @version 1.0 - Initial release
 */
import static org.junit.Assert.*;

import java.util.*;
import org.junit.Test;

//UNCOMMENT THESE TO PUT TESTS IN ORDER

import org.junit.runners.*;
import org.junit.FixMethodOrder;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WC15Test
{
  
  @Test
  public void test01CentralThree()
  {
    assertEquals("and", WC15.centralThree("Candy"));
  }
  
  @Test
  public void test02CentralThree()
  {
    assertEquals("meh", WC15.centralThree("meh"));
  }
  
  @Test
  public void test03CentralThree()
  {
    assertEquals("yet", WC15.centralThree("java yet java"));
    assertEquals("yet", WC15.centralThree("Hi yet Hi"));
  }
  
  @Test
  public void test04CentralThree()
  {
    assertEquals("col", WC15.centralThree("Chocolate"));
    assertEquals("lvi", WC15.centralThree("solving"));
  }
  
  @Test
  public void test05ChopFront()
  {
    assertEquals("llo", WC15.chopFront("hello"));
    assertEquals("z", WC15.chopFront("zzz"));
  }
  
  @Test
  public void test06ChopFront()
  {
    assertEquals("va", WC15.chopFront("java"));
    assertEquals("zz", WC15.chopFront("bazz"));
  }
  
  @Test
  public void test07ChopFront()
  {
    assertEquals("aay", WC15.chopFront("away"));
    assertEquals("ab", WC15.chopFront("ab"));
    assertEquals("brabyy", WC15.chopFront("hbrabyy"));
  }
  
  @Test
  public void test08ChopFront()
  {
    assertEquals("abxyz", WC15.chopFront("abxyz"));
    assertEquals("", WC15.chopFront("hi"));
  }
  
  @Test
  public void test09HateX()
  {
    assertEquals("MyMy", WC15.hateX("xMyMy"));
    assertEquals("MBubba", WC15.hateX("MxBubba"));
  }
  
  @Test
  public void test10HateX()
  {
    assertEquals("Hi", WC15.hateX("Hi"));
    assertEquals("Hi", WC15.hateX("Hxi"));
  }
  
  @Test
  public void test11HateX()
  {
    assertEquals("Hexagon", WC15.hateX("Hexagon"));
    assertEquals("UUI", WC15.hateX("UxUI"));
    assertEquals("", WC15.hateX("xx"));
  }
  
  @Test
  public void test12swapRows()
  {
    //@formatter:off
    int [][] matrix = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 1, 2, 3}};
    //@formatter:on
    WC15.swapRows(matrix, 0, 1);
    assertEquals("[5, 6, 7, 8]\n" + 
                 "[1, 2, 3, 4]\n" + 
                 "[9, 1, 2, 3]\n" + 
        "", beautify(matrix));
  }
  
  @Test
  public void test13swapRows()
  {
    //@formatter:off
    int [][] matrix = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 1, 2, 3}};
    //@formatter:on
    WC15.swapRows(matrix, 0, 2);
    assertEquals("[9, 1, 2, 3]\n" + 
        "[5, 6, 7, 8]\n" + 
        "[1, 2, 3, 4]\n" + 
        "", beautify(matrix));
  }
  
  @Test
  public void test14swapRows()
  {
    //@formatter:off
    int [][] matrix = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 1, 2, 3}};
    //@formatter:on
    WC15.swapRows(matrix, 2, 1);
    assertEquals("[1, 2, 3, 4]\n" + 
        "[9, 1, 2, 3]\n" + 
        "[5, 6, 7, 8]\n" + 
        "", beautify(matrix));
  }
  
  @Test
  public void test15swapColumns()
  {
    //@formatter:off
    int [][] matrix = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 1, 2, 3}};
    //@formatter:on
    WC15.swapColumns(matrix, 2, 1);
    assertEquals("[1, 3, 2, 4]\n" + 
                 "[5, 7, 6, 8]\n" + 
                 "[9, 2, 1, 3]\n" + 
        "", beautify(matrix));
  }
  
  @Test
  public void test16swapColumns()
  {
    //@formatter:off
    int [][] matrix = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 1, 2, 3}};
    //@formatter:on
    WC15.swapColumns(matrix, 0, 3);
    assertEquals("[4, 2, 3, 1]\n" + 
        "[8, 6, 7, 5]\n" + 
        "[3, 1, 2, 9]\n" + 
        "", beautify(matrix));
  }
  
  @Test
  public void test17swapColumns()
  {
    //@formatter:off
    int [][] matrix = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 1, 2, 3}};
    //@formatter:on
    WC15.swapColumns(matrix, 2, 3);
    assertEquals("[1, 2, 4, 3]\n" + 
        "[5, 6, 8, 7]\n" + 
        "[9, 1, 3, 2]\n" + 
        "", beautify(matrix));
  }
  
  @Test
  public void test18Fill2DWithLetters()
  {
    String [][] matrix = WC15.fill2DWithLetters("dorados", 5, 3);
    assertEquals("[d, o, r]\n" + 
                 "[a, d, o]\n" + 
                 "[s, null, null]\n" + 
                 "[null, null, null]\n" + 
                 "[null, null, null]\n" + 
        "", beautify(matrix));
  }
  
  @Test
  public void test19Fill2DWithLetters()
  {
    String [][] matrix = WC15.fill2DWithLetters("dorados", 3, 2);
    assertEquals("[d, o]\n" + 
        "[r, a]\n" + 
        "[d, o]\n" + 
        "", beautify(matrix));
  }
  
  @Test
  public void test20Fill2DWithLetters()
  {
    String [][] matrix = WC15.fill2DWithLetters("dorados", 3, 3);
    assertEquals("[d, o, r]\n" + 
        "[a, d, o]\n" + 
        "[s, null, null]\n" + 
        "", beautify(matrix));
  }
  
  @Test
  public void test21Fill2DWithLetters()
  {
    String [][] matrix = WC15.fill2DWithLetters("irhsisreallynotcool", 4, 5);
    assertEquals("[i, r, h, s, i]\n" + 
        "[s, r, e, a, l]\n" + 
        "[l, y, n, o, t]\n" + 
        "[c, o, o, l, null]\n" + 
        "", beautify(matrix));
  }
  
  @Test
  public void test22Fill2DWithLetters()
  {
    String [][] matrix = WC15.fill2DWithLetters("irhsisreallynotcool", 4, 2);
    assertEquals("[i, r]\n" + 
        "[h, s]\n" + 
        "[i, s]\n" + 
        "[r, e]\n" + 
        "", beautify(matrix));
  }
  
  @Test
  public void test22FillDownAndUp()
  {
    int [] vals = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    int rows = 3;
    int cols = vals.length / rows;
    int [][] matrix = WC15.fillDownAndUp(vals, rows, cols);
    assertEquals("[1, 6, 7, 12]\n" + 
                 "[2, 5, 8, 11]\n" + 
                 "[3, 4, 9, 10]\n" + 
        "", beautify(matrix));
  }
  
  @Test
  public void test23FillDownAndUp()
  {
    int [] vals = {12, 2, 5, 4, 4, 6, 7, 8, 5, 5, 11, 3};
    int rows = 3;
    int cols = vals.length / rows;
    int [][] matrix = WC15.fillDownAndUp(vals, rows, cols);
    assertEquals("[12, 6, 7, 3]\n" + 
        "[2, 4, 8, 11]\n" + 
        "[5, 4, 5, 5]\n" + 
        "", beautify(matrix));
  }
  
  @Test
  public void test24FillDownAndUp()
  {
    int [] vals = {5, 4, 3, 2, 1, 8, 9, 1};
    int rows = 2;
    int cols = vals.length / rows;
    int [][] matrix = WC15.fillDownAndUp(vals, rows, cols);
    assertEquals("[5, 2, 1, 1]\n" + 
        "[4, 3, 8, 9]\n" + 
        "", beautify(matrix));
  }
  
  @Test
  public void test25FillDownAndUp()
  {
    int [] vals = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    int rows = 3;
    int cols = vals.length / rows;
    int [][] matrix = WC15.fillDownAndUp(vals, rows, cols);
    assertEquals("[9, 4, 3]\n" + 
        "[8, 5, 2]\n" + 
        "[7, 6, 1]\n" + 
        "", beautify(matrix));
  }
  
  @Test
  public void test26FillDownAndUp()
  {
    int [] vals = {5, 4, 2, 9};
    int rows = 2;
    int cols = vals.length / rows;
    int [][] matrix = WC15.fillDownAndUp(vals, rows, cols);
    assertEquals("[5, 9]\n" + 
        "[4, 2]\n" + 
        "", beautify(matrix));
  }
  
  @Test
  public void test27Crop2D()
  {
    //@formatter:off

    int [][] matrix = {{10, 9,  8, 7},
                       {6,  5,  4, 3},
                       {2,  1, -1, 0}};
    //@formatter:on
    int [][] croppedMatrix = WC15.crop2D(matrix, 0, 1, 1, 2);
    assertEquals("[9, 8]\n" + 
        "[5, 4]\n" + 
        "", beautify(croppedMatrix));
  }
  
  @Test
  public void test28Crop2D()
  {
    //@formatter:off

    int [][] matrix = {{10, 9,  8, 7},
                       {6,  5,  4, 3},
                       {2,  1, -1, 0}};
    //@formatter:on
    int [][] croppedMatrix = WC15.crop2D(matrix, 1, 2, 2, 3);
    assertEquals("[4, 3]\n" + 
                "[-1, 0]\n" + 
        "", beautify(croppedMatrix));
  }
  
  @Test
  public void test29Crop2D()
  {
    //@formatter:off

    int [][] matrix = {{10, 9,  8, 7},
                       {6,  5,  4, 3},
                       {2,  1, -1, 0}};
    //@formatter:on
    int [][] croppedMatrix = WC15.crop2D(matrix, 1, 1, 2, 2);
    assertEquals("[5, 4]\n" + 
        "[1, -1]\n" + 
        "", beautify(croppedMatrix));
  }
  
  @Test
  public void test30Crop2D()
  {
    //@formatter:off

    int [][] matrix = {{10, 9,  8, 7},
                       {6,  5,  4, 3},
                       {2,  1, -1, 0}};
    //@formatter:on
    int [][] croppedMatrix = WC15.crop2D(matrix, 0, 0, 2, 1);
    assertEquals("[10, 9]\n" + 
                  "[6, 5]\n" + 
                  "[2, 1]\n" + 
        "", beautify(croppedMatrix));
  }
  
  @Test
  public void test31Crop2D()
  {
    //@formatter:off

    int [][] matrix = {{10, 9,  8, 7},
                       {6,  5,  4, 3},
                       {2,  1, -1, 0}};
    //@formatter:on
    int [][] croppedMatrix = WC15.crop2D(matrix, 0, 2, 1, 3);
    assertEquals("[8, 7]\n" + 
        "[4, 3]\n" + 
        "", beautify(croppedMatrix));
  }
  
  @Test
  public void test32Crop2D()
  {
    //@formatter:off

    int [][] matrix = {{10, 9,  8, 7, 1},
                       {6,  5,  4, 3, 2},
                       {2,  1, -1, 0, 3},
                       {8,  7, 3,  9, 5}};
    //@formatter:on
    int [][] croppedMatrix = WC15.crop2D(matrix, 2, 2, 3, 4);
    assertEquals("[-1, 0, 3]\n" + 
        "[3, 9, 5]\n" + 
        "", beautify(croppedMatrix));
  }
  
  @Test
  public void test33Crop2D()
  {
    //@formatter:off

    int [][] matrix = {{10, 9,  8, 7, 1},
                       {6,  5,  4, 3, 2},
                       {2,  1, -1, 0, 3},
                       {8,  7, 3,  9, 5}};
    //@formatter:on
    int [][] croppedMatrix = WC15.crop2D(matrix, 0, 2, 1, 4);
    assertEquals("[8, 7, 1]\n" + 
        "[4, 3, 2]\n" + 
        "", beautify(croppedMatrix));
  }
  
  @Test
  public void test34Crop2D()
  {
    //@formatter:off

    int [][] matrix = {{10, 9,  8, 7, 1},
                       {6,  5,  4, 3, 2},
                       {2,  1, -1, 0, 3},
                       {8,  7, 3,  9, 5}};
    //@formatter:on
    int [][] croppedMatrix = WC15.crop2D(matrix, 1, 1, 3, 3);
    assertEquals("[5, 4, 3]\n" + 
        "[1, -1, 0]\n" + 
        "[7, 3, 9]\n" + 
        "", beautify(croppedMatrix));
  }
    
    /**
     * Make it easier for students to find the differences between the expected
     * and actual values of 2D arrays of integers.
     * 
     * @param arr
     *          can be anything.
     * @return a nice pretty string of values.
     */
    private String beautify(int[][] arr)
    {
      if (arr == null)
      {
        return "null";
      }

      if (arr.length == 0)
      {
        return "empty";
      }
      String answer = "";
      for (int[] row : arr)
      {
        if (row == null)
        {
          answer += "null\n";
        }
        else
        {
          answer += Arrays.toString(row) + "\n";
        }
      }
      return answer;
    }
    
    private String beautify(String[][] arr)
    {
      if (arr == null)
      {
        return "null";
      }

      if (arr.length == 0)
      {
        return "empty";
      }
      String answer = "";
      for (String[] row : arr)
      {
        if (row == null)
        {
          answer += "null\n";
        }
        else
        {
          answer += Arrays.toString(row) + "\n";
        }
      }
      return answer;
    }
  
  
  
}
