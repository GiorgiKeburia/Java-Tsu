public class Launcher {
    public static void main(String[] args){
        Car[] cars = {
                new Car("A","s",122,1),
                new Car("B","s",122,1),
                new Car("C","s",122,1)
        };
        cars = null;
        System.gc();
    }
}

