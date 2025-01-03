public class L4Constructors {
  // Different number of arguments
  L4Constructors() {
    System.out.println("Zero Arguments");
  }

  L4Constructors(int p1) {
    System.out.println("One Arguments");
  }

  // Different type of arguments
  L4Constructors(double p1, double p2) {
    System.out.println("Two Double Constructor");
  }

  L4Constructors(String p1, String p2) {
    System.out.println("Two String constructor");
  }

  public static void main(String[] args) {
    L4Constructors obj = new L4Constructors(23);
    L4Constructors obj1 = new L4Constructors();

    L4Constructors obj2 = new L4Constructors(2.3, 2.8);
    L4Constructors obj3 = new L4Constructors("sam", "eer");
  }
}
/*
 * Output
 * One Arguments
 * Zero Arguments
 * Two Double Constructor
 * Two String constructor
 */