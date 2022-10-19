package model;

import java.util.regex.*;
class RegexExample2{
public static void  main(String[] args){
    Pattern p = Pattern.compile(".s");//. represents single character
    Matcher m = p.matcher("as");
    boolean b = m.matches();
}
}
public class Customer {
    public String firstName = "";
    public String lastName = "";
    public String email = "name@domain.com";
    public final String emailRegex = "^(.+)@(.+).com$";
    public final Pattern pattern = Pattern.compile(emailRegex);
    public Customer(String firstName, String lastName, String email) {
        if(!pattern.matcher(email).matches()) {
            throw new IllegalArgumentException("Error, Invalid email");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    @Override
    public String toString() {
        return getClass(). getName()+ "Please enter your first name and last name and your email.";
    }
}





