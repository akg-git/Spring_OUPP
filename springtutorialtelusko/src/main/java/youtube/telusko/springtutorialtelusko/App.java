package youtube.telusko.springtutorialtelusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to App" );
        
//        Cart cart = new Cart();
//        cart.run();
//        
//        Bike bike = new Bike();
//        bike.ride();
        
        
/*        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        //create bean
//        bean id: cart --> it should be same as Class Name and written in small case
        Vehicle vehicle = (Vehicle) context.getBean("bike");
        vehicle.drive();
        
        *//**
         * We can set value using setter() or through bean property value
         * [[funny note: property name is case-insensitive]]
         *//*
        Tyre tyre = (Tyre) context.getBean("tyre");
        //tyre.setBrand("CEAT");
        System.out.println(tyre);*/
        
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung m31 = factory.getBean(Samsung.class);
        m31.specification();
    }
}
