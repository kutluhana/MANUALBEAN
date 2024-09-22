package SPRING.MANUALBEAN;

public class ClassToBeBean {

    private String name;

    public ClassToBeBean(String name) {
        System.out.println("Hello i am beaned. And my name is: " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
