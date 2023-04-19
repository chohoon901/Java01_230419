import java.util.*;
public class Solution4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("arr = " + Arrays.toString(arr));

        String[] strArr = {"Hello","World","Java"};
        System.out.println("strArr = " + Arrays.toString(strArr));

        String[] weeks = new String[7];
        weeks[0] = "Mon";
        weeks[1] = "Tue";
        weeks[2] = "Wed";
        weeks[3] = "Thu";
        weeks[4] = "Fri";
        weeks[5] = "Sat";
        weeks[6] = "Sun";
        System.out.println("weeks = " + Arrays.toString(weeks));

        System.out.println("Sat : " + weeks[5]);
        System.out.println("weeks.length = " + weeks.length);

        int[] intArr = new int[5];
        intArr[0] = 10;
        intArr[1] = 20;
        intArr[2] = 30;
        System.out.println("intArr = " + Arrays.toString(intArr));
        System.out.println("intArr.length = " + intArr.length);

//        intArr[6] = 100;
//        intArr[-1] = 100;
    }
}
