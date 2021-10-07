package edu.neu.coe.info6205.union_find;
import java.util.Scanner;
public class assignment3
{
    public static void main(String[] args)
    {
        int p, q;
        Scanner ip = new Scanner(System.in);
        long N = ip.nextLong();
        UF_HWQUPC uf = new UF_HWQUPC((int) N);
        int count=0;
        int temp= uf.components();

        while(temp!=1)
        {
            p = (int) (Math.random() * (N - 1));
            q = (int) (Math.random() * (N - 1));

            if (!uf.connected(p, q))
            {
                uf.union(p, q);
            }
            count++;
            temp= uf.components();
        }
        System.out.println("Number of connections: "+ count);
    }
}
