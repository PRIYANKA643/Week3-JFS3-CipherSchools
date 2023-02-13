package week3.Stream;
import java.util.ArrayList;
public class Test0 {
    public static void main(String[] args) {
        ArrayList<String> lang = new ArrayList<String>();
        lang.add("Java");
        lang.add("CSharp");
        lang.add("Python");
        lang.add("PHP");
        
        lang.forEach(System.out::println);
    }
    
}
