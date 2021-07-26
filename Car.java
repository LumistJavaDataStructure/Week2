public class Car extends Vehicle{
    //继承：
    // 1.继承所有的属性和public方法
    // 2.不回继承构造函数


    //属性 fields, attributes
    private String brand;
    private String number;

    //Methods: constructors构造函数, accessor访问函数， mutator修改函数
    public Car(String inputBrand, String inputNumber, int inputCapacity, int inputCost){
        //super(inputCapacity, "On the road", inputCost);
        this.brand = inputBrand;
        this.number = inputNumber;
    }

    //Methods Overriding 方法重写    //Methods Overloading
    public void printHello(){
        System.out.println(this.getCapacity());
        System.out.println(this.brand + " greetings");
    }

    //Methods Overriding 从父类中继承过来一个方法时，可以改写这个方法全部内容，但需要保持，方法的title是一模一样的
    //Methods Overloading 不一定存在继承关系，只是在同一个类中，有两个方法具有同样的名字，但是输入的参数类型不同


    public void onlyMe(){

    }

}
