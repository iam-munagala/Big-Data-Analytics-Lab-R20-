
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class setclass{
    public static void main(String[] args) {
        Set <String> colors_set = new HashSet<String>();
        colors_set.add("red");
        colors_set.add("green");
        colors_set.add("blue");
        colors_set.add("yellow");
        System.out.println("set contents :");
        System.out.println(colors_set);

        System.out.println("\nsorted set after converting to treeset ");
        Set <String> treeset = new TreeSet<String>(colors_set);
        System.out.println(treeset);
    }
}