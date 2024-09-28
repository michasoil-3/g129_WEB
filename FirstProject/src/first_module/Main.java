package first_module;

public class Main {
    public static void main(String[] args) {
        boolean a = 14>=7;
        boolean b = 7==8;
        boolean c = (4 == 9) && (8 > 5);
        boolean d = (4 == 5) || (0>-1);
        boolean e = 1!=2;
        char f = 't';
        var g = "Hello"; // var is like auto in C++, the type can be anything and then sticks to the defined one
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        // Use shift + F6 when cursor is on a variable to rename it and have the IDE refactor name elsewhere
    }
}
