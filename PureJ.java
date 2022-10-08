public class PureJ {

    public static  void main(String[] args){
        System.out.println("This is a pure java project!");
        System.out.println(5+6);
        System.out.println(5-6);
        System.out.println(5*6);
        System.out.println(5.0/6);
        System.out.println(1+2-3*4/5.0);

        int x = 5;
        int a = 3;
        int b = 5;
        int c = 7;
        int y = a*x + b*x*x + c*x*x*x;
        System.out.println(y);
        int bigNum = 99999999;
        long bignumber = 9999999999l;
        System.out.println(1/3.0);
        System.out.println(2^8);

        byte byteVar = 99 ;
        short shortVar = 30000 ;
        int intVar = 21000000;
        long longVar = 3333333333333l;
        float floatVar = 10.2666666578f;
        double doubleVar = 10.2666666578;
        boolean con = true;
        boolean nav = false;

        System.out.println("byte " + byteVar);
        System.out.println("short " + shortVar);
        System.out.println("int " + intVar);
        System.out.println("long " + longVar);
        System.out.println("float " + floatVar);
        System.out.println("double " + doubleVar);
        System.out.println( con );

        int num = 10;
        System.out.println(num % 2);
        System.out.println(num % -3);
        System.out.println(num % 4);
        System.out.println(num % -6);

        int var =0;
        int bc = var + 16;
        bc >>= 2;
        System.out.println(bc);

        int intVa = 99;
        long longVa = intVa;
        long longVa2 = intVa + 1;
        intVa = (int)longVa; //error
        intVa =(int)longVa; //强制类型转换

        double myD = 5;
        System.out.println(intVa / myD);

        int ac = 240+10;
        char cc = (char)ac;
        System.out.println(cc);
        System.out.println(cc+10);

        longVa = 5555555555555l;
        ac =(int)longVa;
        System.out.println(ac);

        String cond = "a\tb\"\n\tc\td\tcc";
        System.out.println("string" + cond);

        cc = '\u81e7';
        System.out.println(cc);

        a = 10;
        b = 20;
        System.out.println(a++); //输出10
        System.out.println(++b); //输出21

        System.out.println("a+b"+a +b);
        System.out.println("a+b" + (a+b));

    }
}
