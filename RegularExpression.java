package Regex;

public class RegularExpression {
    public static void main(String[] args) {
       // System.out.println(firstName("Debasmita"));
        //System.out.println(lastName("Sutar"));
        //System.out.println(mail("abc.xyz@bl.co.in"));
        System.out.println(Password("Deba@1234"));
    }


   // public static boolean firstName(String firstName){
   //public static boolean lastName(String lastName){
       // return lastName.matches("[A-Z]+(['-][a-zA-z]+)*");
    //}
    //Validating email
       // public static boolean mail(String mail){
           // return mail.matches("[a-zA-Z0-9]+[._+-]?[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z]*[.]*[a-zA-Z]*");
      // }
    //Mobile format
   //public static boolean Mobileformat(String Mobileformat) {
       // return Mobileformat.matches("[91]+[ ]+[1-9]{1}[0-9]{9}");

  // }
    //Password rules.
  public static boolean Password(String psword) {
      return psword.matches("[A-Z]+[A-za-z0-9]*[@#%&_]+[0-9]+[A-za-z0-9]*");




  }
}
