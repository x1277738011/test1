package Work;

public class PC {
    CPU cpu;
    HardDisk HD;
    void setCPU(CPU c){
       cpu=c;
    }
    void setHardDisk(HardDisk h){
        HD=h;
    }
    void show(){
        System.out.println("当前CPU速度为"+cpu.getSpeed());
        System.out.print("当前硬盘的容量为"+ HD.getAmount());

    }
}

