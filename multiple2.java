
class multiple2 {
  public static void main(String args[]) {
    C obj = new C();
    obj.text();
  }
}


interface A {
  default void text() {
    System.out.println("Hello");
  }
}


interface B {
  default void text() {
    System.out.println("What's your name?");
  }
}

class C implements A, B {

  
  public void text() {
  
    
    A.super.text();

    
    B.super.text();
  }
}

