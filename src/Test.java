import java.util.Arrays;

public class Test {

    public static void main(String[] args) {


		/*
		Employee [] array = new Employee[] {
				new Employee(1,"male", "Max",27,2000,10, 20.00),
				new Employee(2,"female", "Kate",29,2500,15, 25.00),
				new Employee(3,"female", "Nina",31,3000,17, 30.00),
				new Employee(4,"female", "Anna",35,4500,19, 35.00),
				};


		EmployeeService es = new EmployeeService(array);
		System.out.println(es.calculateSalaryAndBonus());//1
		System.out.println("================================");
		System.out.println(es.getById(3));//2
		System.out.println("===================================");
		System.out.println(es.getByName("Max")); //3
		System.out.println("=========================");
		System.out.println(Arrays.toString(es.sortByName())); //4
		System.out.println("=========================");
       System.out.println(Arrays.toString(es.sortByNameAndSalary())); //5
		System.out.println("=========||============");
		es.printEmployees();//6
		System.out.println("=========||============");
		System.out.println(es.remove(3));//7
		System.out.println("=========||============");
		es.printEmployees();
		System.out.println("=========||============");
		System.out.println(es.edit(new Employee(4, "NICK",115,14500,"male",190, 350.00)));//8
		System.out.println("=========||============");
		es.printEmployees();*/


        EmployeeFactory ef = new EmployeeFactory();
        System.out.println(Arrays.toString(ef.generateEmployees(5)));
    }

}
