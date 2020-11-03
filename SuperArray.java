public class SuperArray {

  private String [] data;
  private int size = 10; //The current size

  public SuperArray() {
    data = new String [10];
  }

  public int size() {
    int count = 0;
    for (int i = 0; i < size; i ++) {
      if (data[i] != null) count ++;
    }
  return count;
  }


  public boolean add(String element) {
    if (size() != size) {
      data[size()] = element;
    }
    else {
      resize();
      data[size()] = element;
    }
    return true;
  }


  public String get(int index) {
    return data[index];
  }


  public String set(int index, String element) {
    String s = get(index);
    if (s != null) {
      data[index] = element;
      return s;
    }
    else return "invalid entry";
  }


  private void resize() {
    String[] unicorns = new String[size + 5];

    for (int i = 0; i < size; i ++) {
      unicorns[i] = data[i];
    }

    data = unicorns;
    size = data.length;
  }


  public boolean isEmpty() {
    return (size() == 0);
  }


  public void clear() {
    size = 0;
  }


  public String toString() {
    String ans = "[";
    if (size() != 0) {
      for (int i = 0; i < size() - 1; i ++) {
        ans += data[i] + ", ";
      }
      return ans + data[size() - 1] + "]";
    }
    return "[]";
  }


  public boolean contains(String s) {
    for (int i = 0; i < size(); i ++) {
      if (data[i].equals(s)) return true;
    }
    return false;

  }










}
