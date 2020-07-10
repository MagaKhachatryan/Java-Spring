
import OS.Linux;
import laptop.Dell;
import laptop.Lenovo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext cont=new ClassPathXmlApplicationContext("context.xml");
        Dell obj1=(Dell)cont.getBean("del");
        System.out.println(obj1.getOs());
        Dell obj2=(Dell)cont.getBean("del0");
        Dell obj3=(Dell)cont.getBean("del");
        System.out.println(obj1.getOs());

        ApplicationContext cont1=new AnnotationConfigApplicationContext(Config.class);

        Lenovo lenovo = cont1.getBean(Lenovo.class);


        System.out.println(lenovo.getOs());





    }
}
