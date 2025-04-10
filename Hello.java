package p.main;

import p.main.Hoge;
import p.sub.*;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Sub.test();

        Hoge origin = new Hoge(1, "fuga", true);
        Hoge copy = origin;
        System.out.println(origin == copy);
        System.out.println(origin.equals(copy));

        Hoge diffOrigin = new Hoge(1, "fuga", true);
        System.out.println(origin == diffOrigin);
        System.out.println(origin.equals(diffOrigin));

        Hoge diffOrigin2 = new Hoge(2, "fuga2", false);
        System.out.println(origin == diffOrigin2);
        System.out.println(origin.equals(diffOrigin2));

        // new RuntimeException("イジョジョ");
		Dummy
    }
}
