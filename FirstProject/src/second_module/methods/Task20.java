package second_module.methods;

public class Task20 {
    public static String getSeason(int m){
        if (m == 12 || m < 3) {
            return "Winter";
        } else if (m < 6) {
            return "Spring";
        } else if (m < 9) {
            return "Summer";
        } else {
            return "Autumn";
        }
    }
}
