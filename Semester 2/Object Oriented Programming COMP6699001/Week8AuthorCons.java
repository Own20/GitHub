public class Week8AuthorCons {
    private String name, email;
    private char gender;

    public Week8AuthorCons(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    public String toString() {
        return "Author[name = " + name + ", email = " + email + ", gender = " + gender;
    }
}
