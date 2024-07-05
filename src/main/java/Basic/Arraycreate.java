package Basic;
import java.util.Arrays;

public class Arraycreate {
    public static void main(String[] args) {
        int a=10;
        int [] a1= {11,22,27,23,16};
        int [] a2=new int[15];
        System.out.println(a1.length);
        for(int i=0;i<a1.length;i++)
        {
            System.out.println(a1[i]);
        }
        for(int hoi:a1)
        {
            System.out.println(hoi);
        }
        System.out.println(Arrays.toString(a1));

    }
}
