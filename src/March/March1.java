package March;
//Лямбда-выражения часть1
/**
    @author Pavel Sergeev
 */

interface Executable{
    int execute(int x);
}

class Runner{
    public void run(Executable e){
        int a = e.execute(10);
        System.out.println(a);
    }
}

public class March1 {
    public static void main(String[] args) throws InterruptedException {
        Runner runner = new Runner();

        runner.run(new Executable() {
            @Override
            public int execute(int x) {
                System.out.println("Hello, bestie");
                return x+1;
            }
        });

        runner.run((int x) -> {
            System.out.println("Hi");
            return x+2;
        });
    }
}
