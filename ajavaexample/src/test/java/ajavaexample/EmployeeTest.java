package ajavaexample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeTest {
	 @Test
	    public void mySimpleEqualsTest(){
	         
	        String expectedName = "spoorthy";
	        assertEquals(expectedName, Employee.getEmpNameWithHighestSalary());
	    }
	     
	    @Test
	    public void myObjectEqualsTest(){
	         
	        Employee expectedEmpObj = new Employee(1, "spoorthy", 8000);
	        assertEquals(expectedEmpObj, Employee.getHighestPaidEmployee());
	    }
	}

