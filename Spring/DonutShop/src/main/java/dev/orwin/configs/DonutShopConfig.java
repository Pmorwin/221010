package dev.orwin.configs;


import dev.orwin.models.Box;
import dev.orwin.models.Donut;
import dev.orwin.models.Jelly;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration// This is a stereotype annotation in Spring. It defines the purpose of the class
// @Configuration is a class used as a registry for Spring Beans
public class DonutShopConfig {

    @Bean(name = "Strawberry Jelly")// This method creates a bean to be managed by our Application Context
    // By default, the Application context names the beans after their method name, but name = will allow you to change that
    public Jelly strawberryJelly(){
        Jelly jelly = new Jelly("Strawberry");
        return jelly;
    }

    @Bean
    public Jelly blueberryJelly(){
        return new Jelly("Blueberry");
    }

    @Bean(name =  "Small Blueberry Swirl")
    public Donut blueberrySwirl(){
        // Dependency injection is the process of building an object and adding the dependency it needs to work
        // Donuts need jelly
        // So we need to add in jelly to our donuts, which is taking one class and adding it to another, which is dependency injection
        // Angular also does this with components and services
        Donut donut = new Donut("Small Blueberry Swirl",1.25, this.blueberryJelly());
        return donut;
    }

    @Bean(name = "Large Blueberry Swirl")
    public Donut blueberrySwirlLarge(){
        Donut donut = new Donut("Large Blueberry Swirl",2.50, this.blueberryJelly());
        return donut;
    }


    // By default, all beans in the AC are Singleton
    // Spring Creates one instance of the bean, stores it then gives you the ONLY instance of that object that exists
    // Singletons get created when the AC is created
    // By default, all beans are created when the AC is created
    @Bean(name = "Small Box")
    public Box smallBox(){
        System.out.println("Small Box has been created");
        Box box = new Box(100);
        return box;
    }

    // A prototype bean will have a new instance created each time you get it from the AC
    @Bean(name = "Large Box")
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Box largeBox(){
        System.out.println("Large Box was created");
        Box box = new Box(1000);
        return box;
    }


}
