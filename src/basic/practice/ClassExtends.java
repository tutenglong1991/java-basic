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
        super(name); // ���췽���е�����һ�����췽�������ö���������������ʼλ�ã�
        this.age = age;
    }

//	public void test_call_constructor() { // �����ٹ��췽������ĵط����ù��췽��
//		super();
//	}

    public void say() {
        System.out.println("�ҵ������ǣ�" + name + ",�����Ѿ�" + age + "���ˡ�");
    }

    public static void main(String[] args) {
        UseCase2 u = new UseCase2("����", 28);
        u.say();
    }
}
