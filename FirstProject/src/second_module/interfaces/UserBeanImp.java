package second_module.interfaces;

public class UserBeanImp implements UserBean {
    User[] users;

    public UserBeanImp(User[] users) {
        this.users = users;
    }

    @Override
    public void getAllUsers() {
        for (User user : users) {
            System.out.println(user.getName() + " " + user.getSurname());
        }
    }

    @Override
    public void getUsersByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name))
                System.out.println(user.getName() + " " + user.getSurname());
        }
    }

    @Override
    public void getUsersBySurname(String surname) {
        for (User user : users) {
            if (user.getSurname().equals(surname))
                System.out.println(user.getName() + " " + user.getSurname());
        }
    }
}
