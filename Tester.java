import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        SuperArray words = new SuperArray(20);
        words.add("kani");
        words.add("uni");
        words.add("ebi");
        words.add("ebi");
        words.add("uni");
        words.add("kani");

        System.out.println(Arrays.toString(words.toArray()));

        Demo.removeDuplicates(words);
        System.out.println(Arrays.toString(words.toArray()));

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
