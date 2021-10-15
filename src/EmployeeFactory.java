import java.lang.Math;
public class EmployeeFactory {

    public  Employee[] generateEmployees(int size) {
        Employee[] tempArray = new Employee[size];


        String []maleNames= {"Max","Anton","Nick","Mick","Mike","Genadiy","Jack","John"};
        String []femaleNames= {"Anna","Kate","Zoya","Nina","Mariya","Masha","Nino","Anita"};
        String []genderArray = {"male","female"};


        for(int i=0; i<size; i++) {

            tempArray[i]= new Employee();

            tempArray[i].id=0+(int)(Math.random()*100);
            tempArray[i].gender=genderArray[0+(int)(Math.random()*2)];


            if(tempArray[i].gender=="male") {
                tempArray[i].name=maleNames[0+(int)(Math.random()*(maleNames.length))];

            }

            else if(tempArray[i].gender=="female") {
                tempArray[i].name=femaleNames[0+(int)(Math.random()*(maleNames.length))];

            }

            tempArray[i].age=20+(int)(Math.random()*70);
            tempArray[i].salary=3000+(int)(Math.random()*10000);
            tempArray[i].fixedBugs=0+(int)(Math.random()*100);
            tempArray[i].defaultBugRate=10+(int)(Math.random()*10);

        }
        return tempArray;

    }


}
