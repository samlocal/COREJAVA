public class L6ThisWithParenthesis {
  L6ThisWithParenthesis() {
    System.out.println("Zero -> 0");

    L6ThisWithParenthesis obj2 = new L6ThisWithParenthesis(69);
  }

  L6ThisWithParenthesis(int x) {
    System.out.println("One -> " + x);
  }

  public static void main(String[] args) {
    L6ThisWithParenthesis obj1 = new L6ThisWithParenthesis();
  }
}
/*
 * Output
 * Zero -> 0
 * One -> 69
 */