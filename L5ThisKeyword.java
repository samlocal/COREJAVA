public class L5ThisKeyword {
  public static void main(String[] args) {
    L5ThisKeyword obj1 = new L5ThisKeyword();
    System.out.println("Address of obj1-> " + obj1);
    obj1.test();

    L5ThisKeyword obj2 = new L5ThisKeyword();
    System.out.println("Address of obj2-> " + obj2);
    obj2.test();
    obj1.test();

    L5ThisKeyword obj3 = new L5ThisKeyword();
    System.out.println("Address of obj3-> " + obj3);
    obj3.test();
    obj2.test();
    obj1.test();
  }

  public void test() {
    System.out.println("this holds ->" + this);
  }
}
/*
 * Output
 * Address of obj1-> L5ThisKeyword@372f7a8d
 * this holds ->L5ThisKeyword@372f7a8d
 * Address of obj2-> L5ThisKeyword@63961c42
 * this holds ->L5ThisKeyword@63961c42
 * this holds ->L5ThisKeyword@372f7a8d
 * Address of obj3-> L5ThisKeyword@65b54208
 * this holds ->L5ThisKeyword@65b54208
 * this holds ->L5ThisKeyword@63961c42
 * this holds ->L5ThisKeyword@372f7a8d
 */