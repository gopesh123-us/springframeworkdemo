package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Staff staffDoctor = context.getBean(Doctor.class);
		Staff staffNurse = context.getBean(Nurse.class);
		Doctor doctor = context.getBean(Doctor.class);
		// Nurse nurse = (Nurse) context.getBean("nurse");//
		staffDoctor.assist();
		staffNurse.assist();
		System.out.println(doctor.getQualification());
	}

}
