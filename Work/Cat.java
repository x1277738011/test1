package Work;

class Cat extends Animal {
    @Override//伪代码，表示重写
    void cry() {
        System.out.println("喵喵");
    }

    @Override
    String getAnimalName(){
        return "我是猫";
    }
}
