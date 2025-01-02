public class L2StaticAndNonStatic {
  // Static members
  static int var1 = 99;

  public static void main(String args[]) {
    L2StaticAndNonStatic obj1 = new L2StaticAndNonStatic();
    // Incorrect
    System.out.println(obj1.var1); // L2StaticAndNonStatic.var1

    // Correct way
    System.out.println(L2StaticAndNonStatic.var1); // classname
    System.out.println(var1); // variablename
  }
}

/*
 * Output
 * 99
 * 99
 * 99
 */
