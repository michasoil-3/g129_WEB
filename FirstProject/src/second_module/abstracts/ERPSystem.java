package second_module.abstracts;

public class ERPSystem {
    User[] memory = new User[1000];
    int sizeOfUsers = 0;

    public void addUser(User u) {
        this.memory[this.sizeOfUsers++] = u;
    }

    public void printTeacher() {
        for (int i = 0; i < this.sizeOfUsers; i++) {
            if (this.memory[i] instanceof Teacher) {
                System.out.println(this.memory[i].getUserData());
            }
        }
    }

    public void printStudent() {
        for (int i = 0; i < this.sizeOfUsers; i++) {
            if (this.memory[i] instanceof Student) {
                System.out.println(this.memory[i].getUserData());
            }
        }
    }

    public void printUser(int index) {
        if (index >= this.sizeOfUsers) {
            System.out.println("No such user in this index");
        } else {
            System.out.println(this.memory[index].getUserData());
        }
    }
}
