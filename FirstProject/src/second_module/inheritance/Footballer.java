package second_module.inheritance;

public class Footballer extends Sportsman {
    private String position;
    private String club;

    public Footballer() {
        this.position = "None";
        this.club = "None";
    }

    public Footballer(String fullName, int age, String country, String position, String club) {
        super(fullName, age, country);
        this.position = position;
        this.club = club;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public String play() {
        return "Footballer " + this.fullName + " from " + this.country + ", " + this.age + " years old, " +
                this.position + " is playing for " + this.club + ".";
    }
}
