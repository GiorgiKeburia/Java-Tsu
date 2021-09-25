public class Launcher {
    public static void main(String[] args) {
        System.out.println("--------------------- SORT ARRAY ----------------------");
        int[] myArr = {12, 44, 55, 5, 12, 4};
        Sort arr1 = new Sort(myArr);
        arr1.sort();
        System.out.println('\n');

        System.out.println("--------------------- PERSON ----------------------");
        Person user1 = new Person("Elon", "Mask", 31, 88.2, 180.3);
        user1.printInfo();
        user1.chekAge();
        System.out.println('\n');

        System.out.println("--------------------- Counter ----------------------");
        Count word1 = new Count("test",'t');
        word1.countElement();
    }
}
