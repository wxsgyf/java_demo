package wx.test;

import wx.test.animal.Animal;
import wx.test.animal.cat;
import wx.test.animal.lazyCat;


public class demo {
    public static void main(String[] args) {
        /*cat c = new cat();
        c.setName("波斯");
        c.setAge(5);*/
        Animal c = new lazyCat("加菲",3);
        System.out.println("我有一只"+c.getName()+",它"+c.getAge()+"岁了");
        c.eat();
        c.sleep();
        ((lazyCat) c).behave();
        Class c1 = c.getClass();           //得到一个类
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c1.getName());
        System.out.println(c1.hashCode());
        System.out.println(c.hashCode());
    }
}