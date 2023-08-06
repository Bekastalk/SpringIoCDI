package bekks;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student=applicationContext.getBean("student", Student.class);
//        student.age();
        University university=applicationContext.getBean("university", University.class);
        university.method();
        System.out.println(university.getName());
        System.out.println(university.getLocation());
        System.out.println(university.getNameable());
        applicationContext.close();
    }
}
