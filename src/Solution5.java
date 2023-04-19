import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution5 {
    public static void main(String[] args) {
        ArrayList menu = new ArrayList();
        menu.add("pizza");
        menu.add("pasta");
        menu.add("salad");
        menu.add("spaghetti");
        System.out.println("menu = " + menu);
        menu.add(0, "sushi");
        System.out.println("menu = " + menu);
        menu.add(1);
        System.out.println("menu = " + menu);

        ArrayList menu2 = new ArrayList();
        menu2.add("pizza");
        System.out.println("menu2 = " + menu2);

        ArrayList menu3 = new ArrayList();
        menu3.add(1);
        System.out.println("menu3 = " + menu3);

        System.out.println(menu.get(1));
        menu.set(1, "burger");
        System.out.println("menu = " + menu);

        // menu.clear();
        System.out.println(menu.size());

        System.out.println(menu.contains("pizza"));

        menu.remove(0);
        System.out.println("menu = " + menu);
        menu.remove("pasta");
        System.out.println("menu = " + menu);

        String[] foods = {"pizza", "pasta", "salad", "spaghetti"};
        ArrayList<String> foods2 = new ArrayList<>(Arrays.asList(foods));
        System.out.println("foods2 = " + foods2);
        foods2.add("sushi");
        System.out.println("foods2 = " + foods2);

        ArrayList<String> foods3 = new ArrayList<>(
                Arrays.asList("pizza", "pasta", "salad", "spaghetti")
        );
        System.out.println("foods3 = " + foods3);

        String join = String.join(", ", foods);
        System.out.println("join = " + join);

        ArrayList<Integer> nums = new ArrayList<>(
                Arrays.asList(31,12,27)
        );
        System.out.println("nums = " + nums);
        nums.sort(null);
        System.out.println("nums = " + nums);
        nums.sort(Comparator.naturalOrder());
        System.out.println("nums = " + nums);
        nums.sort(Comparator.reverseOrder());
        System.out.println("nums = " + nums);
    }
}
