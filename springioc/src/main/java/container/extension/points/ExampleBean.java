package container.extension.points;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class ExampleBean implements BeanPostProcessor {
    public void init() {
        System.out.println("��ʼ��Bean");
    }
    public ExampleBean() {
        System.out.println("ExampleBean���췽��");
    }
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization" + beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization" + beanName);
        return bean;
    }

}
