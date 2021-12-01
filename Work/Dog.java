package Work;
 public class Dog implements Animal {
     @Override
      public void cry() {
         System.out.println("汪汪");
     }
     @Override
     public String getAnimalName(){
         return "我是狗";
     }
 }

