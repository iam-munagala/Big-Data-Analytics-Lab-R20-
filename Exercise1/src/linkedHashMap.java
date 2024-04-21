import java.util.LinkedHashMap;

public class linkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> st = new LinkedHashMap<>();
        st.put(101, "eren");
        st.put(102, "mikasa");
        st.put(103,"Armin");
        st.put(104,"kevin");
        st.put(105,"mitchnick");
        System.out.println("the size of the Linked Hash Map is :"+st.size());

        System.out.println(st);

        if (st.containsKey(105)) {
            String name = st.get(105);
            System.out.println("the name of the student having id 105 is :"+name);
            
        }

    }
}
