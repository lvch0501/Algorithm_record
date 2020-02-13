public class ProgrammerProxy implements Human{
    Programmer programmer;
    ProgrammerProxy(Programmer programmer){
        this.programmer = programmer;
    }

    public void eat(){
        programmer.eat();
        System.out.println("proxy is working");
    }

}
