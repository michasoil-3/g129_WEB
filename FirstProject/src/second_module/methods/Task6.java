package second_module.methods;

import java.lang.String;

public class Task6 {
    public static String check(String login, String password){
        return (login.equals("admin") && password.equals("qwerty")) ? "Authentication completed" : "Invalid login or password";
    }
}
