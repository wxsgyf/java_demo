package wx.test.animal;

public class cat extends Animal {
    public cat(){
        System.out.println("子类空参构造");
    }
    public cat(String name,int age){
        super(name,age);                        //调用父类有参构造
        System.out.println("子类有参构造");
    }
    public void eat(){
        System.out.println("猫吃鱼");
    }

   
    public void sleep(){
        System.out.println(getName()+"睡觉");
    }
}
