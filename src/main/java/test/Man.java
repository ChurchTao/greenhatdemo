package test;

/**
 * Created by jiacheng on 2017/7/20.
 */
public class Man {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void say(){
        System.out.println("my name is "+this.name);
    }
}
