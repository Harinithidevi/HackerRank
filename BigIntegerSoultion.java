import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigIntegerSolution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String ele1 = in.next();
        String ele2 = in.next();
        in.close();
        BigInteger b1 = new BigInteger(ele1);
        BigInteger b2 = new BigInteger(ele2);
        BigInteger b3 = b1.add(b2);
        System.out.println(b3);
        b3 = b1.multiply(b2);
        System.out.println(b3);
    }
}
