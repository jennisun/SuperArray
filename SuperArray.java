public class SuperArray {

  private String [] data;
  private int size = 10; //The current size

  public SuperArray() {
    data = new String [10];
  }

  public int size() {
    int i = 0;
    while (i < size && data[i] != null) i ++;

    return i;
  }





}
