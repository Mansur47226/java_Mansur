public class Main {
    public static void main(String[] args) {
        User u = new User();

        u.setUsername("Mansur5242");
        u.setPassword("123");
        u.setEmail("mdadashev13gmail.com");
        u.setEmail("mdadashev13@gmail.com");
        u.setBirthDate("2013-08-25");

        u.showProfile();
    }
}

class User {
    private String username;
    private String password;
    private String email;
    private String birth;

    public void setUsername(String u) {
        username = u;
    }

    public void setPassword(String p) {
        if (p.length() >= 6) {
            password = p;
        } else {
            System.out.println("пароль слишком маленнький");
        }
    }

    public void setEmail(String e) {
        if (e.contains("@")) {
            email = e;
        } else {
            System.out.println("неверный mail");
        }
    }

    public void setBirthDate(String d) {
        birth = d;
    }
    public void showProfile() {
        System.out.println("Регистрация");
        System.out.println("имя: " + username);
        System.out.println("mail: " + email);
        System.out.println("дата рождения: " + birth);
    }



}
