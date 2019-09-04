package lifecycle.callback;

import org.springframework.beans.factory.InitializingBean;

public class ExampleBean2 implements InitializingBean {
    private String name;

    public ExampleBean2() {
        System.out.println("ExampleBean2");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("setName");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

}
