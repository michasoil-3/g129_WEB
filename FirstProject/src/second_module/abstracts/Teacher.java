package second_module.abstracts;

public class Teacher extends User {
    private String nickName;
    private String status; //// например: Professor, Lecturer, Tutor, Assistant.
    private String subjects[] = new String[10];
    private int sizeOfSubjects = 0;

    public Teacher() {
    }

    public Teacher(int id, String login, String password, String nickName, String status) {
        super(id, login, password);
        this.nickName = nickName;
        this.status = status;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public int getSizeOfSubjects() {
        return sizeOfSubjects;
    }

    public void addSubject(String subject) {
        this.subjects[this.sizeOfSubjects] = subject;
        this.sizeOfSubjects++;
    }

    @Override
    String getUserData() {
//"ID: 1. LOGIN: ilyas@mail.ru. PASSWORD: bitlab11111. NICKNAME: teacher_2023. STATUS: professor."
        return "ID: " + this.getId() + ". LOGIN: " + this.getLogin() + ". PASSWORD: " + this.getPassword() +
                ". NICKNAME: " + this.nickName + ". STATUS: " + this.status + ".";
    }
}
