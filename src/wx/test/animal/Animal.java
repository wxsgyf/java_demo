package wx.test.animal;

public abstract class Animal {              //包含抽象方法的类要定义成抽象类
    private String name;
    private int age;

     public Animal(){
        System.out.println("空参构造");
    }

    public Animal(String name, int age) {
        this.name=name;
        this.age=age;
        System.out.println("有参构造");

    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    public abstract void eat();         //抽象类，强制子类重写

     public void sleep(){
         System.out.println("睡觉");
     }
}
