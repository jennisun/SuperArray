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
    String[] unicorns = new String[size * 2];

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
    data = new String[10];
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


  public SuperArray(int initialCapacity) {
    data = new String [initialCapacity];
    size = initialCapacity;
  }


  public void add(int index, String element) {
    if (index >= 0) {
      if (index < size()){
        String hold1 = data[index];
        String hold2 = data[index + 1];

        hold1 = data[index];
        set(index, element);

        if (size() == data.length) resize();

        for (int i = index; i < size() + 1; i ++) {
          hold2 = data[i + 1];
          data[i + 1] = hold1;
          hold1 = hold2;
        }
      }
      else data[size()] = element;
    }
  }


  public String remove(int index) {
    String element = data[index];

    if (index >= 0) {
      String hold1 = data[index + 1];

      for (int i = index; i < size() - 1; i ++) {
        data[i] = hold1;
        hold1 = data[i + 2];
      }
    }
    data[size() - 1] = null;
    return element;
  }


  public int indexOf(String s) {
    for (int i = 0; i < size(); i ++) {
      if (data[i].equals(s)) return i;
    }
    return -1;
  }


   public String[] toArray() {
     String[] arr = new String[size()];

     for (int i = 0; i < size(); i ++) {
       arr[i] = data[i];
     }
     return arr;
   }
}
