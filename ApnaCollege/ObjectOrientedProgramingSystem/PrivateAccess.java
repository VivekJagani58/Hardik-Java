package ObjectOrientedProgramingSystem;

class Account {
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return this.password;
    }
}
public class PrivateAccess {
    public static void main(String[] args) {
        Account a1 = new Account(); 
        a1.setPassword("abcd");                 //private ne access kari shakay che 
        System.out.println(a1.getPassword());       // private ne melavva mate
     }
}
