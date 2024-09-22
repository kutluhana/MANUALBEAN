package SPRING.MANUALBEAN;

import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class JustCreateANewBean {

    ApplicationContext applicationContext;

    public JustCreateANewBean(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }
    public void createAndInjectABean() {

        AutowireCapableBeanFactory beanFactory = (AutowireCapableBeanFactory) applicationContext.getAutowireCapableBeanFactory();
        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setScope(BeanDefinition.SCOPE_SINGLETON);
        beanDefinition.setBeanClass(SPRING.MANUALBEAN.ClassToBeBean.class);

        BeanDefinitionRegistry registry = (BeanDefinitionRegistry) beanFactory;

        ConstructorArgumentValues constructorArgumentValues = new ConstructorArgumentValues();
        constructorArgumentValues.addIndexedArgumentValue(0, "Man In Black");
        beanDefinition.setConstructorArgumentValues(constructorArgumentValues);
        registry.registerBeanDefinition("thisIsTheId", beanDefinition);

    }
}
