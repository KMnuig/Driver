package CT417.Driver2;

import org.joda.time.LocalDate;

import CT417.PartA.Course;
import CT417.PartA.Module;
import CT417.PartA.Student;

public class App 
{

	
    public static void main( String[] args )
    {
	
        Student CSstudent = new Student("Harry","Potter",13055341,21,"10/10/96");
        Student EEstudent = new Student ("Nichlos", "Tesla",880649556,161,"10/07/1856");
        
        Module software = new Module("Software Engineering","CT404");
        Module Programming = new Module("Programming","CT407");
        Module Simulations = new Module ("Simulations","EE491");
        
        software.addStudent(CSstudent);
        Simulations.addStudent(EEstudent);
        
        LocalDate s = new LocalDate("2017-09-05");
        LocalDate e = new LocalDate("2018-05-31");
        Course CS = new Course("Computer Science",s,e);
        CS.addModule(software);
        CS.addModule(Programming);
        
        Course EE = new Course("Electrical Engineering",s,e);
        EE.addModule(Simulations);
        
        
        System.out.println("Course:"+CS.toString());
        System.out.println("Course:"+EE.toString());
        
    }
}
