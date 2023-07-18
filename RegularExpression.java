package Regex;

public class RegularExpression {
    public static void main(String[] args) {
       // System.out.println(firstName("Debasmita"));
        //System.out.println(lastName("Sutar"));
        System.out.println(mail("abc.xyz@bl.co.in"));
    }


   // public static boolean firstName(String firstName){
   //public static boolean lastName(String lastName){
       // return lastName.matches("[A-Z]+(['-][a-zA-z]+)*");
    //}
    //Validating email
        public static boolean mail(String mail){
            return mail.matches("[a-zA-Z0-9]+[._+-]?[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z]*[.]*[a-zA-Z]*");
       }

}
