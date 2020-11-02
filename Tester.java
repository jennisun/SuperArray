public class Tester{

  public static void main(String[]args) {
    SuperArray a = new SuperArray();

    a.add("hi");
    a.add("bye");
    a.add("cry");

    for(int i = 0; i < a.size(); i++){
          System.out.println( a.get(i) );
    }

    System.out.println( a.size() );




  }





}
