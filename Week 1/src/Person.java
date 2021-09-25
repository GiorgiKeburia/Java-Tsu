public class Person {
    String firstName;
    String lastName;
    int age;
    double weight;
    double height;

    Person(String n, String ln, int a, double w, double h) {
        firstName = n;
        lastName = ln;
        age = a;
        weight = w;
        height = h;
    }

    public void printInfo() {
        System.out.println("Person information:" + '\n' + "Name: " + firstName + '\n' + "LastName: " + lastName + '\n' + "Age: " + age + '\n' + "weight: " + weight + '\n' + "Height: " + height);
    }

    public void chekAge() {
        if(age>21){
            System.out.println(true + " : " + firstName + " is more then 21!");
        }
    }

}
