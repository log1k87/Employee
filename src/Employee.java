public class Employee {

    long id;
    String name;
    int age;
    double salary;
    String gender;
    int fixedBugs;
    double defaultBugRate;



    Employee(){}

    Employee(int id,String gender,String name, int age,double salary,int fixedBugs,double defaultBugRate){
        this.id=id;
        this.gender=gender;
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.fixedBugs=fixedBugs;
        this.defaultBugRate=defaultBugRate;



    }


    public String toString() {return
            "\n\nid: "+id+
                    "\nName: "+name+
                    "\nAge: "+ age+
                    "\nGender: "+gender+
                    "\nSalary: "+salary+
                    "\nFixedBugs: "+fixedBugs+
                    "\nDefaultBugRate: "+defaultBugRate;}

}
