public class Car {
    String producer;
    String model;
    int maxSpeed;
    double engineAmount;

    public Car() {}
    {
        producer = "Noname";
        model = "Noname";
        maxSpeed = -1;
        engineAmount = -1;
    }
    public Car(String producer, String model, int maxSpeed, double engineAmount) {
        this.producer = producer;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.engineAmount = engineAmount;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "---CAR INFO--- " +'\n'+
        " -Producer : '" + producer + '\n' +
                " -Model : '" + model + '\n' +
                " -Max Speed : " + maxSpeed + '\n' +
                " -Engine Amount : " + engineAmount;
    }
}
