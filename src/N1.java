import java.lang.Math;
public class N1 {
    public static int num(int n)
    {
        int count = 0;
        while (n!=0)
        {
            count=count*10+9;
           // System.out.println(n+"`````````");
            n--;
            //System.out.println(count+"//////////");
        }
        return count;
    }
    public static void main(String[] args)
    {
        System.out.println(num(3));
        for (int i=1;i<=num(3);i++)
        {
            System.out.println(i+" ");
        }
    }
}
