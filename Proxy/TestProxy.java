public class TestProxy {
    public static void main(String[] args) {
        Human human = new ProgrammerProxy(new Programmer());

        human.eat();
    }
}
