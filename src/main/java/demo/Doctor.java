package demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff {

	public void assist() {
		System.out.println("Doctor is assisting!");
	}
	
	
	String qualification;
	
	public Doctor() {
		
	}

	public Doctor(String theQualification) {
		this.qualification = theQualification;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "Doctor [qualification=" + qualification + "]";
	}
	
	

}
