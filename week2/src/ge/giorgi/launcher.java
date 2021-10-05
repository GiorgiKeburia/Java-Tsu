package ge.giorgi;

public class launcher {
    public static void main (String[] args) {
        // --------------------------------------  setAgeFromString  ---------------------------------
        Person baby_yoda = new Person("Baby Yoda", 21);
        baby_yoda.setAgeFromString("3443");

        // --------------------------------------  To String  ---------------------------------
        System.out.println(baby_yoda);

        // --------------------------------------  sayMyName  ---------------------------------
        System.out.println(baby_yoda.sayMyName(5));

        System.out.println(baby_yoda.piramideBuild(4,"\uD83C\uDDEC\uD83C\uDDEA"));
    }
}
