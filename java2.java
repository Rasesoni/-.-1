import java.util.ArrayList;
import java.util.List;
 class SplitListExample {
    public static void main(String[] args) {
        ArrayList<String> it= new ArrayList<>();
        it.add("a");
        it.add("1");
        it.add("b");
        it.add("2");
        it.add("c");
        it.add("3");
        List<String> let = new ArrayList<>();
        List<String> num = new ArrayList<>();
        for (String item : it) {
            if (item.matches("[a-zA-Z]")) {
                let.add(item);
            } else if (item.matches("\\d")) {
                num.add(item);
            }
        }
        it.clear();
        it = null;
        System.out.println(let);
        System.out.println(num);
    }
}

