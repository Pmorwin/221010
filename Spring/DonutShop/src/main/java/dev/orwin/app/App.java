package dev.orwin.app;

import dev.orwin.configs.DonutShopConfig;
import dev.orwin.models.Box;
import dev.orwin.models.Donut;
import dev.orwin.models.Jelly;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class App {
    public static void main(String[] args) {

        // This will create an Application Context IoC Container with teh beans defined in the config class we designate
        ApplicationContext ac = new AnnotationConfigApplicationContext(DonutShopConfig.class);

        Jelly strawberry = ac.getBean("Strawberry Jelly", Jelly.class);
//        System.out.println(strawberry);

        Jelly blueberry = ac.getBean("blueberryJelly", Jelly.class);
//        System.out.println(blueberry);

        Donut blueberrySwirl = ac.getBean("Large Blueberry Swirl", Donut.class);
//        System.out.println(blueberrySwirl);


//        Box box = ac.getBean("Small Box", Box.class);
//        System.out.println(box);
//        box.setValue(200);
//
//        Box box2 = ac.getBean("Small Box", Box.class);
//        System.out.println(box2); // What will this print out? //200
//        System.out.println(box);

        Box b1 = ac.getBean("Large Box", Box.class);
        b1.setValue(6000);
        System.out.println(b1);


        Box b2 = ac.getBean("Large Box", Box.class);
        b2.setValue(3000);
        System.out.println(b2);




    }
}
