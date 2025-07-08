public class Main {
    public static void main(String[] args) {
        User u = new User();

        u.setUsername("Mansur5242");
        u.setPassword("123");
        u.setEmail("mdadashev13@gmail.com");
        u.setBirthDate("2013-08-25");

        System.out.println("Register");
        System.out.println("username: " + u.getUsername());
        System.out.println("password: " + u.getPassword());
        System.out.println("email: " + u.getEmail());
        System.out.println("date: " + u.getBirthDate());
    }
}
class User {
    private String username;
    private String password;
    private String email;
    private String date;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setBirthDate(String birthDate) {
        this.date = birthDate;
    }

    public String getBirthDate() {
        return date;
    }
}
