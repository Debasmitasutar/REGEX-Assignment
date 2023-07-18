package Regex;

public class RegularExpression {
    public static void main(String[] args) {
        System.out.println(firstName("Cap"));
    }
    public static boolean firstName(String firstName){
        return firstName.matches("[A-Z][a-z]*");
    }
}
