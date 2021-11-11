package Work;
 class Dog extends Animal {
     @Override
     void cry() {
         System.out.println("汪汪");
     }
     @Override
     String getAnimalName(){
         return "我是狗";
     }
 }

