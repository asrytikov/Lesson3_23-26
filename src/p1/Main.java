package p1;

public class Main {

    public static void main(String[] args) {

        //+, -, *
        int a = 10;
        int b = 7;
        int c = a+b;
        int d = 10+a;

        // /
        int a1 = 20;
        float b1 = 7f;
        double c1 = a1 / b1;
        System.out.println(c1);

        int f = 33;
        int h = 5;
        int k = f % h;
        System.out.println(k);

        int q = 10;
        int x = ++q;
        System.out.println(q);
        System.out.println(x);

        q = 10;
        x = q++;
        System.out.println(q);
        System.out.println(x);

        // x++
        // ++x
        // * / %
        // + -

        int rez = (x + 5) * ++q;
        System.out.println(rez);

        double d2 = 2.0 - 1.1;
        System.out.println(d2);

        int z1 = 4; //100
        int z2 = 5; //101
        System.out.println(z1 & z2);

        System.out.println(z1 | z2);

        System.out.println(z1 ^ z2);

        System.out.println(z1 == z2);
        System.out.println(z1 != z2);
        System.out.println(z1 < z2);
        System.out.println(z1 > z2);

        System.out.println(z1 <= z2);
        System.out.println(z1 >= z2);

        System.out.println((z1<z2) | (z1==z2));
        System.out.println((z1<z2) || (z1==z2));

        System.out.println((z1<z2) & (z1==z2));
        System.out.println((z1<z2) && (z1!=z2));

        System.out.println(!(z1<z2));
        System.out.println((z1<z2) ^ (z1==z2));

        int sd = 33;

        //sd = sd + x;
        sd += x;
        // -=, *=, /=, %=
        // &=, |=, ^=














    }
}
