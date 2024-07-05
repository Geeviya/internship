package Basic;
import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        String [] Actor= {"vijay","Ajith","Dhanush","Dulquer","simbu","siva","surya"};
        Scanner scan=new Scanner(System.in);

        System.out.println(Actor.length);
        System.out.println("Tell us What is Your favoriate actoress");
        String favor=scan.next();

        for(int pos=0;pos<Actor.length;pos++)
        {
            if(favor.equalsIgnoreCase(Actor[pos]))
            {
                System.out.println(favor+" Actor is founded");
                return;
            }

        }
        System.out.println(favor   +" actor is not founded");
    }
}
