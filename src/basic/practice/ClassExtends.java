package basic.practice;

public class ClassExtends{
    String name;
    public ClassExtends(String name) {
        this.name = name;
    }

    public void setName(String a){
        this.name = a;
    }

    public String getName(){
        return name;
    }

}

class UseCase2 extends ClassExtends{
    int age;
    public UseCase2(String name, int age) {
        super(name); // 构造方法中调用另一个构造方法，调用动作必须置于最起始位置；
        this.age = age;
    }

//	public void test_call_constructor() { // 不能再构造方法以外的地方调用构造方法
//		super();
//	}

    public void say() {
        System.out.println("我的名字是：" + name + ",今年已经" + age + "岁了。");
    }

    public static void main(String[] args) {
        UseCase2 u = new UseCase2("花花", 28);
        u.say();
    }
}
