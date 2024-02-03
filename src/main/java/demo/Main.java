package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		Staff staffDoctor = context.getBean(Doctor.class);
		Staff staffNurse = context.getBean(Nurse.class);
		Doctor doctor = context.getBean(Doctor.class);
		Nurse nurse = (Nurse) context.getBean("nurse");//
		staffDoctor.assist();
		staffNurse.assist();
		doctor.setQualification("MBBS");
		System.out.println(doctor);

		Doctor doctor1 = context.getBean(Doctor.class);
		System.out.println("2nd time: " + doctor1);
		/* System.out.println(doctor.getQualification()); */

	}

}
