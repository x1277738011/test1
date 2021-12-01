package Work;

class Cat implements Animal {
    @Override//伪代码，表示重写
   public void cry() {
        System.out.println("喵喵");
    }

    @Override
   public String getAnimalName(){
        return "我是猫";
    }
}
