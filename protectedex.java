public class protectedex {
    protected String fname = "John";
    protected String lname = "Doe";
    protected String email = "john@doe.com";
    protected int age = 24;
}
class Student extends protectedex {
        private int graduationYear = 2018;
        public static void main(String[] args) {
          protectedex myObj = new protectedex();
            System.out.println("Name: " + myObj.fname + " " + myObj.lname);
            System.out.println("Email: " + myObj.email);
            System.out.println("Age: " + myObj.age);
            System.out.println("Graduation Year: " + myObj.graduationYear);
        }
    }

