
import java.util.*;
import java.net.InetAddress;
class subnetmask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s2=" ",s3=" ",s4=" ";
        System.out.println("enter ip address in form of (a.b.c.d):");
        String s=sc.nextLine();
        int ind=s.indexOf('.');
        String ipArr[]=s.split("\\.");
        if(ipArr.length==4)
        {
        String ar = s.substring(0,ind);
        int arr =Integer.parseInt(ar);
        if(arr>=0 && arr<=127)
        {
        s2="A";
        s3="255.0.0.0";
        }
        if(arr>=128 && arr<=191)
        {
        s2="B";
        s3="255.255.0.0";
        }
        if(arr>=191 && arr<=223)
        {
        s2="C";
        s3="255.255.255.0";
        }
        if(arr>=224 && arr<=239)
        {
        s2="D";
        }
        if(arr>=240 && arr<=255)
        {
        s2="E";
        }
        if(s2=="A"||s2=="B"||s2=="C")
        {
        System.out.println("\nsubnet class:"+s2);
        System.out.println("\nsubnet mask:"+s3);
        }
        else if(s2=="D")
        {
            System.out.println("\nsubnet class:"+s2);
        System.out.println("\nsubnet mask:reserved and multicast");
        }
        else 
        {
            System.out.println("\nsubnet class:"+s2);
        System.out.println("\nsubnet mask:experimental");
        }
        String[] a1=s.split("\\.");
        if(s3!=" "){
        String[] a2=s3.split("\\.");
        for(int i=0;i<4;i++)
        {
          int x=Integer.parseInt(a1[i]);  
          int y=Integer.parseInt(a2[i]); 
          int z=x&y;
          s4+=z+".";
        }
        System.out.println("\nsubnet address:"+s4);
        }
    }
    else
    System.out.println("Invalid IP Address");
    }
}
