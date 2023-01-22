import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class S1 {

    public static void main(String[] args) {
        int i = new Random().nextInt(2000);
        System.out.println(i);
        String z = (Integer.toBinaryString(i));
        System.out.println(z);
        int n = (z.length() - 1);
        System.out.println(n);

        ArrayList<Integer> m1list = new ArrayList<>();
        int j = i;
        while (j <= Short.MAX_VALUE) {
            if (j % n == 0) {
                m1list.add(j);
            }
            j += 1;
        }

        Object[] m1arr = m1list.toArray();
        System.out.println(Arrays.toString(m1arr));

        ArrayList<Integer> m2list = new ArrayList<>();

        int k = i;
        while (k>=Short.MIN_VALUE) {
            if (k % n != 0) {
                m2list.add(k);
            }
            k -= 1;
        }

        Object[] m2arr = m2list.toArray();
        System.out.println(Arrays.toString(m2arr));

//        Чтоб обойти определение количества чисел в массиве, сделала через списки. Возможно, это костыльное решение...

    }
}