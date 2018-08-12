package demo;

public class equals {
    public static void main(String[]args) {

        //equals和==的区别：
        // 1.==是一个运算符。
        // 2.而equals则是String的一个方法，可以打点使用。

        //比较方式:
        //基本数据类型比较
        //==和Equals都比较两个值是否相等。相等为true 否则为false
        // 引用对象比较
        //==和Equals都是比较栈内存中的地址是否相等 。相等为true 否则为false


        int a1 = 10;
        int a2 = 10;

        String b1="a";
        String b2="a";

        String c1 = new String("sc");
        String c2 = new String("sc");

        //a1和a2都是保存在栈中，保存的都是值，所以在栈中的内容都是一样
        System.out.println(a1 == a2);

        //b1和b2是String类型;变量是对象的引用，也就是对象在堆内存的地址
        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));

        //c1和c2都是new出来的一个对象,都会在堆内开辟空间，
        // c1和c2所保存的对象地址肯定不同,所以==返回false
        System.out.println(c1 == c2);

        //equals则会根据c1和c2保存的地址去堆内存中获取两个对象，
        //如果两个对象的值相等，则会返回true
        System.out.println(c1.equals(c2));

    }
}
