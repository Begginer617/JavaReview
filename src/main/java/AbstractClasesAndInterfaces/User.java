package AbstractClasesAndInterfaces;

public class User {
    String username;
    String password;
    String name;
    String lastName;


    void login(String username, String password) {
        if (username.equals(this.username) && password.equals(this.password)) {
            System.out.println("Logging user:" + username + "/" + password + "\n" + "Logging successful");
        } else System.out.println("Incorrect password and/or username.");

    }

    void logOut() {
        System.out.println("Logged off");
    }

}


