package second_module.exceptions;

class Worker {
    private String name;
    private String surname;

    public Worker(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

class Company {
    private String name;
    private Worker director;

    public Company(String name, Worker director) {
        this.name = name;
        this.director = director;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Worker getDirector() {
        return director;
    }

    public void setDirector(Worker director) {
        this.director = director;
    }

    public String getData() {
        try {
            return "Company name: " + name + ". Information about director -> " + director.getName() + " " +
                    director.getSurname() + ".";
        }
        catch (NullPointerException e) {
            return "Data not found";
        }
    }
}

