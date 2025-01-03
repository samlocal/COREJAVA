public class L7DefaultConstructor {
  L7DefaultConstructor(int x){
    System.out.println(x);
  }
  public static void main(String[] args) {
    L7DefaultConstructor obj=new L7DefaultConstructor(200);
    // L7DefaultConstructor obj1=new L7DefaultConstructor();
  }
}

/*
 * Error because the default constructor (empty body with 0 args) is override by the 
 * parameterized constructor (L7DefaultConstructor(int x))
 */