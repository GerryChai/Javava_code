package company;
import java.util.Date;
public class Test{
	public static void main(String[] args) {
		Employee employee= new Employee();
		employee.setName("Java");
		employee.setSalary(99.56);
		employee.setBirthday(new Date());
		Manager manager= new Manager();
		manager.setName("Gerry");
		manager.setSalary(2000.88);
		manager.setBirthday(new Date());
		manager.setBonus(5000);
		//output info
		System.out.println("employee name: "+ employee.getName());
		System.out.println("employee salary: "+ employee.getSalary());
		System.out.println("employee birthday: "+ employee.getBirthday());
		System.out.println("manager name: "+ manager.getName());
		System.out.println("manager salary: "+ manager.getSalary());
		System.out.println("manager birthday: "+ manager.getBirthday());
		System.out.println("manager bonus: "+ manager.getBonus());
		
	}
}