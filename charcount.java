import java.util.*;

public class charstuff 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String a, fs = "", t, x, s, d, y;
        char sd, ed;
        int i;
        int p = 0, q = 0;

        System.out.print("Enter characters to be stuffed: ");
        a = sc.nextLine();

        System.out.print("Enter a character that represents starting delimiter: ");
        sd = sc.nextLine().charAt(0);

        System.out.print("Enter a character that represents ending delimiter: ");
        ed = sc.nextLine().charAt(0);

        x = s = "" + sd;
        y = d = "" + ed;

        fs += x;

        for (i = 0; i < a.length(); i++) {
            t = "" + a.charAt(i);

            if (t.charAt(0) == sd)
                fs += s;
            else if (t.charAt(0) == ed)
                fs += d;
            else
                fs += t;
        }

        fs += y;

        System.out.println("\nAfter stuffing: " + fs);
    }
}
