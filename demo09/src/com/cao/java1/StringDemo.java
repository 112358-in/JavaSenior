package com.cao.java1;

/*
String类的12个常用方法
 */

public class StringDemo {
    public static void main(String[] args) {
//        1. 用字符数组value创建一个String对象
//        public String(char[] value)
        char[] a={'a','c','b','m','h','e','l','l','o'};

        String s = new String(a);
        System.out.println(s);

//        2. 用字符数组以x开始的n个字符创建一个String对象
//        方法：public String(char chars[], int x, int n)

        String s1 = new String(a, 1, 2);
        System.out.println(s1);

//        3. 获取字符串长度
//          方法：public int length()

        int length = s1.length();
        System.out.println(length);

//        4. 获取字符串某一位置的字符
//          方法：public char charAt(int index)

        char c = s1.charAt(0);
        System.out.println(c);

//        5.获取字符串的子串
//      方法：
//        public String substring(int beginIndex)
//          //该方法从beginIndex位置起，
//          //从当前字符串中取出剩余的字符作为一个新的字符串返回。
//
//        public String substring(int beginIndex, intendIndex)
//          //该方法从beginIndex位置起，从当前字符串中
//          //取出到endIndex-1位置的字符作为一个新的字符串返回。

        System.out.println(s);
        System.out.println(s.substring(2));
        System.out.println(s.substring(3, 4));

//        6.字符串的比较
//            public int compareTo(String str)
//    //该方法是对字符串内容按字典顺序进行大小比较，
//    //通过返回的整数值指明当前字符串与参数字符串的大小关系。
//    //若当前对象比参数大则返回正整数，反之返回负整数，相等返回0。
//
//            public int compareToIgnoreCase (String str)
//    //与compareTo方法相似，但忽略大小写。
//
//            public boolean equals(Object obj)
//    //比较当前字符串和参数字符串，在两个字符串相等的时候返回true，否则返回false。
//
//            public boolean equalsIgnoreCase(String str)
//    //与equals方法相似，但忽略大小写。

        int hello = s.compareTo("hello");
        System.out.println(hello);

        int acbmHello = s.compareToIgnoreCase("acbmHello");
        System.out.println(acbmHello);

        boolean acbmHello1 = s.equals("acbmHello");
        System.out.println(acbmHello1);

        boolean acbmHello11 = s.equalsIgnoreCase("acbmHello");
        System.out.println(acbmHello11);

//        7.查找子串在字符串中的位置
//        方法：
//            public int indexOf(String str)
//    //用于查找当前字符串中字符或子串，返回字符或
//    //子串在当前字符串中从左边起首次出现的位置，若没有出现则返回-1。
//
//            public int indexOf(String str, intfromIndex)
//    //改方法与第一种类似，区别在于该方法从fromIndex位置向后查找。
//
//            public int lastIndexOf(String str)
//    //该方法与第一种类似，区别在于该方法从字符串的末尾位置向前查找。
//
//            public int lastIndexOf(String str, intfromIndex)
//    //该方法与第二种方法类似，区别于该方法从fromIndex位置向前查找。


        int hello1 = s.indexOf("hello");
        System.out.println(hello1);

        int i = s.indexOf("hello",5);
        System.out.println(i);

        int l = s.lastIndexOf("l");
        System.out.println(l);

        int ol = s.lastIndexOf("lo", 9);
        System.out.println(ol);

//        8.字符串中字符的大小写转换
//      public String toLowerCase()
//      //返回将当前字符串中所有字符转换成小写后的新串
//
//      public String toUpperCase()
//      //返回将当前字符串中所有字符转换成大写后的新串

        String s2 = s.toLowerCase();
        System.out.println(s2);

        String s3 = s.toUpperCase();
        System.out.println(s3);

//        9.字符串两端去空格
//            String trim()
//          //去除字符串两端的空格，中间的空格不变，一般用于登陆注册时
        String string = new String("hello ~ ~ ~");
        String trim = string.trim();
        System.out.println(trim);

//        10.将字符串分割成字符串数组
//        String[] split(String str)

        String[] split = s.split("acbm");
        System.out.println("-------");
        for(String sp:split) {
            System.out.println(sp);
        }

//        11.基本类型转换为字符串
//        方法：static String valueOf(xxx xx)

        int a1=444555666;
        String s6 = String.valueOf(a1);
        System.out.println(s6);


//        12.替换字符串
//        public String replace(char oldChar, charnewChar)
//  //用字符newChar替换当前字符串中所有的oldChar字符，
//  //并返回一个新的字符串。
//
//        public String replaceFirst(String regex,String replacement)
//  //该方法用字符replacement的内容替换当前字符串中遇到的
//  //第一个和字符串regex相匹配的子串，应将新的字符串返回。
//
//        public String replaceAll(String regex,String replacement)
//  //该方法用字符replacement的内容替换当前字符串中遇到的所有
//  //和字符串regex相匹配的子串，应将新的字符串返回。

        String hello2 = s.replace("hello", "22222");
        System.out.println(hello2);

        String s4 = s.replaceAll("l","哈");
        System.out.println(s4);

        String ll = s.replace("ll", "333");
        System.out.println(ll);

        String s5 = s.replaceFirst("l", "呵呵");
        System.out.println(s5);

    }
}
