public class S2 {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        String s = "";
        StringBuilder builder = new StringBuilder("String");
        s = builder.toString();
        builder.append("!");
        System.out.println(builder.reverse());
        System.out.println(builder);

        boolean b = true;
        int x = 5;
        float f = 1.235f;
        builder.append(x);
        builder.append(f);
        builder.append(b);
        System.out.println(builder);
        String s1 = "qwerty";
        String s2 = "qwerty";
        StringBuilder b1 = new StringBuilder(s1);
        StringBuilder b2 = new StringBuilder(s2);

        System.out.println(b1.toString().equals(b2.toString()));

        Integer num1 = 3;
        Integer num2 = 56;
        System.out.println(num1 + num2);
        System.out.println(num1 + num2);
        System.out.println(num1-num2);
        System.out.println(num1.floatValue()/num2.floatValue());
        System.out.println(num1*num2);

        long end = System.currentTimeMillis();
        System.out.println(end-begin);
        StringBuilder b3 = new StringBuilder();
        b3.append(num1).append("+").append(num2).append("=").append(num1+num2);
        System.out.println(b3);

        String b4 =  b3.toString().replace("="," равно ");
        System.out.println(b4);

        long start1 = System.currentTimeMillis();
        String s3 = "";
        for (int i = 0; i < 10000; i++) {
            s3 += "*";
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);

        StringBuilder b5 = new StringBuilder();

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            b5.append("*");
        }
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);


    }


}
