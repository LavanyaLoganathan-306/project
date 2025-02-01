import java.util.Scanner;
class project{
  public static void main(String[]args){
    Scanner details = new Scanner(System.in);
    System.out.println("Enter your registration number:");
    int regisnumber=details.nextInt();
    System.out.println("your registration number :"+regisnumber);
    details .nextLine();
    System.out.println("Enter your name:");
    String name= details.nextLine();
    System.out.println("Enter your age:");
    int age=details.nextInt();
    details.nextLine();
    System.out.println("Enter your address:");
    String address=details.nextLine();
    System.out.println("Enter your  father name ");
    String fathersname= details.nextLine();
    System.out.println("Enter your mother name:");
    String mothername=details.nextLine();
    System.out.println("Enter your board mark:");
    int mark=details.nextInt();
    System.out.println("your total mark is "+mark);
    int totalmark=mark/6;
    System.out.println("---------STUDENT DETAILS----------");
    System.out.println("NAME :" +name);
    System.out.println("AGE: "+age);
    System.out.println("ADDRESS :"+address);
    System.out.println("FATHER'S NAME :"+fathersname);
  System.out.println("MOTHER NAME :"+mothername );
    System.out.println("YOUR MARK: "+mark);
    System.out.println("AVERAGE PERCENTAGE:"+totalmark +"%");
    System.out.println("----------------------------------");
  }
}