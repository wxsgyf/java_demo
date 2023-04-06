package wx.string;

public class demo {
    public static void main(String[] args){
        String str = "abc";                         //abc可以看成是一个字符串对象
        str = "def";                                //def赋值给str，原来的abc就变成了垃圾（冗余）
        System.out.println(str);                    //string类重写了toString方法返回的是对象本省
        /*
        *String类的构造方法
         */
        String s1 = new String();                   //空参构造public String();
        System.out.println(s1);

        byte[] arr1 = {97,98,99};
        String s2 = new String(arr1);               //把字节数组转换成字符串public String(byte[] bytes);
        System.out.println(s2);

        byte[] arr2 ={97,98,99,100,101,102};
        String s3 = new String(arr2,2,3);   //把数组从指定索引位按指定长度转换为字符串public String(byte[] bytes，int index，int length);
        System.out.println(s3);

        char[] char1 = {'a','b','c','d','e'};               //将字符数组转换成字符串
        System.out.println(char1);
        String s4 = new String(char1);
        System.out.println(s4);

        String s5 = new String(char1,1,3);
        System.out.println(s5);
    }
}


