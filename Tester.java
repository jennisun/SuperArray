import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        SuperArray words = new SuperArray(20);
        SuperArray a = new SuperArray(20);
        words.add("1");
        words.add("2");
        words.add("3");
        words.add("4");
        words.add("5");

        a.add("1");
        a.add("2");
        a.add("6");

        System.out.println(Demo.zip(a, words).toString());

        // words.remove(0);
        // System.out.println(words.toString());
        //
        // words.remove(1);
        // System.out.println(words.toString());

        // words.remove(2);
        // System.out.println(words.toString());


        // for(int i = 0; i < words.size(); i++){
        //     System.out.println( words.get(i) );
        // }

        // for(int i = 0; i < 10; ++i) {
        //     words.add("mhm");
        // }
        //
        // for(int i = 0; i < words.size(); ++i) {
        //     if(!words.get(i).equals("mhm")) {
        //         System.out.println("Don't say " + words.set(i, "hmh") + "!");
        //     }
        //     System.out.println( words.get(i) );
        // }

        // System.out.println(words.toString());
        // System.out.println(words.contains("uni"));
        // words.clear();
        // System.out.println(words.toString());
        // System.out.println(words.isEmpty());
        // System.out.println(words.contains("uni"));

    }
}
