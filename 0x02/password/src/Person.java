public class Person {

  public boolean checkPassword(String password) {
        return password != null &&
                password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[0-9].*") &&
                password.matches(".*[^A-Za-z0-9].*");
    }

    public boolean checkUser(String user) {
        return user != null && user.matches("^[A-Za-z0-9]{8,}$");
    }

  
}
