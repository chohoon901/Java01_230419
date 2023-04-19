import java.text.MessageFormat;
import java.util.*;
public class Solution2 {
    public static void main(String[] args) {
        String a="나는나는";
        System.out.println(a);
        a="나나는";
        System.out.println(a);
        String str = new String("Hello World");
        System.out.println(str);
        System.out.println(str.indexOf("l"));
        System.out.println("str.indexOf(\"l\")");
        System.out.println(str.indexOf("World"));
        System.out.println(str.indexOf("Bye"));

        System.out.println(str.charAt(0));
//        System.out.println(str.charAt(11));
//        System.out.println(str.charAt(-1));
        System.out.println(str.length()-1);
        System.out.println(str.replaceAll("ll","LL"));
        // 정규표현식도 가능
        System.out.println(str.replace("LL","ll"));
        // 단어만

        System.out.println(str.substring(0,2));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        String str2 = "H e l l o  w o r l d !";
        System.out.println(Arrays.toString(str2.split(" ")));

        System.out.println(String.format("나는 오늘 %d원의 밥을 먹었다.",6300));
        System.out.println(String.format("나는 오늘 %s에서 밥을 먹었다.","구내식당"));
        int money = 5000;
        System.out.println(String.format("나는 오늘 %d원의 밥을 먹었다.",money));

        String name = "Jung";
        System.out.println(MessageFormat.format("my name is {0}",name));

        double height = 175.5;
        System.out.println(String.format("내 이름은 %s이고, 내 키는 %f이다.", name, height));


    }
}


