package wx.test.animal;
import wx.test.inter.lazy;

public class lazyCat extends cat implements lazy {
    public lazyCat(){
        System.out.println("子类空参构造");
    }
    public lazyCat(String name,int age){
        super(name,age);                        //调用父类有参构造
        System.out.println("子类有参构造");
    }

    @Override
    public void behave() {
        System.out.println("睡懒觉");
    }
}
