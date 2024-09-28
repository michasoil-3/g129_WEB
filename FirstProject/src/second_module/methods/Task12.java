package second_module.methods;

public class Task12 {
    public static void redouble(String str){
        for (char c: str.toCharArray()) {
            for (int i = 0; i<2; i++)
                System.out.print(c);
        }
    }
}
