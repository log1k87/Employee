public class EmployeeService {

    Employee [] array;
    public EmployeeService(Employee [] array){this.array=array;}


    public void printEmployees() {
        for(Employee temp: array) {System.out.println(temp);}
    }



    public double calculateSalaryAndBonus()  {
        double tempSum=0.0;

        for(Employee temp: array) {tempSum+=temp.salary+temp.defaultBugRate;}

        return tempSum;
    }


    public Employee getById(long id)  {
        Employee worker=null;

        for(Employee temp: array) {
            if(temp.id==id) {worker=temp;}

        }

        return worker;

    }


    public Employee getByName(String name) {
        Employee worker=null;

        for(Employee temp: array) {

            if(temp.name==name) {worker=temp;}}

        return worker;

    }


    public Employee[] sortByName()  {
        for(int x=0; x<array.length; x++) {
            for(int i=0; i<array.length; i++) {
                if((array[x].name.compareTo(array[i].name))<0)
                {
                    Employee temp=array[x];
                    array[x]=array[i];
                    array[i]=temp;


                }
            }
        }
        return array;

    }


    public Employee[] sortByNameAndSalary()  {

        for(int x=0; x<array.length; x++) {
            for(int i=0; i<array.length; i++) {

                if(array[x].name.compareTo(array[i].name)<0) {
                    Employee temp=array[x];
                    array[x]=array[i];
                    array[i]=temp;
                    if(array[x].name.compareTo(array[i].name)==0)
                    {if(array[x].salary<array[i].salary){
                        double res=array[x].salary;
                        array[x].salary=array[i].salary;
                        array[i].salary=res;
                    }
                    } }
            }

        }
        return array;
    }


    public Employee edit(Employee employee)  {
        Employee temp=null;



        for(int i=0; i<array.length; i++){
            if(array[i].id==employee.id) {
                temp=array[i];
                array[i]=employee;}
        }

        return temp;

    }



    public Employee remove(long id) {

        Employee temp=null;
        int count=0;
        int count2=0;
        Employee [] tempArray=new Employee[array.length-1];

        for(int i=0; i<array.length; i++){
            if(array[i].id==id) {
                temp=array[i];
                array[i]=null;
            }
        }

        for(int i=0; i<array.length; i++) {
            if(array[i]==null)
            {continue;}
            tempArray[count++]=array[i];

        }


        array = new Employee[count];

        for(int i=0; i<tempArray.length; i++) {
            array[count2++]=tempArray[i];
        }


        return temp;

    }

}
