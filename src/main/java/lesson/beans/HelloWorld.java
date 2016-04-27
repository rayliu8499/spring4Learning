package lesson.beans;

/**
 * Created by ray.liu on 2016/4/22.
 */
public class HelloWorld {
    private String name;

    public void setName(String name) {
        System.out.println("setName: " + name);
        this.name = name;
    }

    public void hello() {
        System.out.println("hello: " + name);
    }

    public HelloWorld() {
        System.out.println("HelloWorld's Constructor...");
    }
}
