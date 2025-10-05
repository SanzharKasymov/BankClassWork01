public class User {
    private String name;
    private String email;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // new User();
    public User() {
        this.name = null;
        this.email = null;
    }

    // new User("name", "email");
    // this = Class
    // User
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void Info(){
        System.out.println("Name: "+this.name);
        System.out.println("Email: "+this.email);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
