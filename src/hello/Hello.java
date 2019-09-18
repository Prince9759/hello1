package hello;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        int i;
        Scanner so = new Scanner(System.in);
        int n = so.nextInt();
        System.out.println(n);
        for (i = 1; i <= n; i++) {
            Scanner m = new Scanner(System.in);
            System.out.println("enter book name");
            String b = m.nextLine();
            System.out.println("Author name");
            String a = m.nextLine();
            System.out.println("IBMN code");
            int l = m.nextInt();
            System.out.println(b);
            System.out.println(a);
            System.out.println(l);


        }
    }
}

