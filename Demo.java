import java.util.Arrays;

public class Demo{

  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    // words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    // words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    // words.add("una");    words.add("ebi");     words.add("toro");
    //
    // System.out.println(words);
    // removeDuplicates(words);
    // System.out.println(words);

    SuperArray a = new SuperArray();
    SuperArray b = new SuperArray();
    a.add("0");
    a.add("0");
    a.add("1");
    a.add("5");
    a.add("7");
    b.add("7");
    b.add("0");
    b.add("2");
    b.add("3");
    System.out.println(findOverlap(a, b));
  }


  public static void removeDuplicates(SuperArray s){
    for (int i = s.size() - 1; i > 0; i --) {
      if (s.indexOf(s.get(i)) != i) s.remove(i);
    }
  }


  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    SuperArray arr = new SuperArray(20);
    removeDuplicates(a);
    removeDuplicates(b);

    for (int i = 0; i < a.size(); i ++) {
      if (b.contains(a.get(i))) arr.add(a.get(i));
    }
    removeDuplicates(arr);
    return arr;
  }


  public static SuperArray zip(SuperArray a, SuperArray b){
    SuperArray arr = new SuperArray(b.size() + a.size());

    if (a.size() < b.size()) {
    for (int i = 0; i < a.size(); i ++) {
      arr.add(a.get(i));
      arr.add(b.get(i));
    }
    for (int i = a.size(); i < b.size(); i ++) {
      arr.add(b.get(i));
      }
    }

    else {
    for (int i = 0; i < b.size(); i ++) {
      arr.add(a.get(i));
      arr.add(b.get(i));
    }
    for (int i = b.size(); i < a.size(); i ++) {
      arr.add(a.get(i));
      }
    }
    
    return arr;
  }

}
