import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
class User{
    private String username;
    private  String password;

    public User(String username,String password){
        this.username=username;
        this.password=password;
    }

    public String getUsername(){
        return  username;
    }
    public String getPassword(){
        return password;
    }
}
public class AuthentiationSystem {
    public static void main(String[] args) {
        AuthentiationSystem authSystem =new AuthentiationSystem();
        Scanner scanner=new Scanner(System.in);
        boolean loggedIn= false;
        while(!loggedIn){
            System.out.println("Choose an Option");
            System.out.println("1.Register");
            System.out.println("2.Login");
            System.out.println("3.Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

        }
    }

}
