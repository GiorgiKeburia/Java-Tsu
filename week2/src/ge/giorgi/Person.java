package ge.giorgi;

public class Person {
    String name;
    int age;

    public Person(){

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //    Methods
    void setAgeFromString(String age){
        this.age = Integer.parseInt(age);
    }
    String sayMyName(int n){
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < n; i++){
            st.append(name);
            if(i < n-1){
                st.append(',').append(' ');
            }
        }
        return st.toString();
    }
    String piramideBuild(int height, String symbol){
        StringBuilder myStr = new StringBuilder();
        for (int i = 0; i < height; i++){
            myStr.append(" ".repeat(height - 1));
            ;
            myStr.append(String.valueOf(symbol).repeat(i + 1));
            ;
            myStr.append('\n');
        }
        return myStr.toString();

    }

    @Override
    public String toString() {
        return "Person: name " + name + ", age : " + age + ".";
    }
}
