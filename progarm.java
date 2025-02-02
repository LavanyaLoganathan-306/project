import java.util.Scanner;

public class progarm {
    public static void main(String[] args) {
        System.out.println("--------student details------");
        System.out.println("enter the student id:");
        Scanner ID = new Scanner(System.in);
        int regisid=ID.nextInt();
        int registerno1=0001;
        int registerno2=0002;
        int registerno3=003;
        if(regisid==registerno1){
            System.out.println("----Student 1 detail");
            System.out.println(" STUDENT REGISTER NUMBER :001");
            System.out.println("NAME :  LAVANYA.L" );
            System.out.println("FATHER NAME: LOGANATHAN");
            System.out.println("MOTHER NAME: GIRIJA");
            System.out.println("ph no: 9841257602");
        }
        else if(regisid==registerno2){

            System.out.println("----Student 2 detail");
            System.out.println(" STUDENT REGISTER NUMBER :002");
            System.out.println("NAME :  mythili.L" );
            System.out.println("FATHER NAME: LOGANATHAN");
            System.out.println("MOTHER NAME: GIRIJA");
            System.out.println("ph no: 9361482154");
        }
        else if(regisid==registerno3){
            System.out.println("----Student 3 detail");
            System.out.println(" STUDENT REGISTER NUMBER :003");
            System.out.println("NAME :  MADHAVAN.R" );
            System.out.println("FATHER NAME: RANGANATHAN");
            System.out.println("MOTHER NAME: MALLIGA");
            System.out.println("ph no: 9789866773");
        }
        else{
            System.out.println("INVALID REGISTER NUMBER-----");
            System.out.println("-----thank you----");
        }
    }
}
        