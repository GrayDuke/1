package March;
//Лямбда-выражения часть1
/**
    @author Pavel Sergeev
 */

interface Executable{
    int execute();
}

class Runner{
    public void run(Executable e){
        int a = e.execute();
        System.out.println(a);
    }
}

public class March1 {
    public static void main(String[] args) throws InterruptedException {
        Runner runner = new Runner();

        runner.run(new Executable() {
            @Override
            public int execute() {
                System.out.println("Hello, bestie");
                return 1;
            }
        });

        runner.run(() -> {
            System.out.println("Hi");
            return 2;
        });
    }
}
