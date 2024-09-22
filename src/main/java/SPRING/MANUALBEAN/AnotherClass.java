package SPRING.MANUALBEAN;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class AnotherClass {

    public AnotherClass(JustCreateANewBean justCreateANewBean, ApplicationContext applicationContext) {
        justCreateANewBean.createAndInjectABean();
        System.out.println(applicationContext.getBean(SPRING.MANUALBEAN.ClassToBeBean.class));
        System.out.println(applicationContext.getBean("thisIsTheId"));

    }

}
