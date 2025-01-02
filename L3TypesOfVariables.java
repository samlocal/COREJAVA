public class L3TypesOfVariables {
  // Global-Reference variable
  static L3TypesOfVariables obj = null;

  public static void main(String[] args) {
    obj = new L3TypesOfVariables();
    System.out.println(obj);
    obj.test();
  }

  public void test() {
    System.out.println(obj);
  }
}
/*
 * Output
 * L3TypesOfVariables@372f7a8d
 * L3TypesOfVariables@372f7a8d
 */