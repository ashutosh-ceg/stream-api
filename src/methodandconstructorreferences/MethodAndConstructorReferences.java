package methodandconstructorreferences;

import java.util.Arrays;
import java.util.List;

public class MethodAndConstructorReferences {
    public static void main(String[] args) {
        MethodAndConstructorReferences obj1 = new MethodAndConstructorReferences();
        List<String> list = Arrays.asList("Ashutosh", "Shiw", "Ram");
        list.forEach(obj1::print); // Method refrences
    }

    public void print(String s) {
        System.out.println(s);
    }

}
