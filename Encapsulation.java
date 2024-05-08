class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
public class Encapsulation {
    public static void main(String[] args) {
        //in encapsulation, variables can be made read-only (if you only use the get method), or write-only (if you only use the set method)
        Person obj = new Person();
        obj.setName("John");
        System.out.println(obj.getName());
    }
}
