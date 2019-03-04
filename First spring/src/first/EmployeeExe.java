package first;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
public class EmployeeExe {
	
	
	public static void main(String[] args) {  
	    Resource resource=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    Employee student=(Employee)factory.getBean("employeebean");  
	    student.displayInfo();  
	}  
	
}
