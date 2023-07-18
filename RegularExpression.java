package Regex;

public class RegularExpression {
    public static void main(String[] args) {
       // System.out.println(firstName("Cap"));
        System.out.println(lastName("Cap"));
    }
   // public static boolean firstName(String firstName){
   public static boolean lastName(String lastName){
        return lastName.matches("[A-Z]+(['-][a-zA-z]+)*");
    }
}
