package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest 
{

	@Test
	public void testCalculator() 
	{
		//checking if the constructor will be created.
		Calculator cal = new Calculator();
		assertNotNull(cal);
	}
 
	@Test
	public void testGetTotal() 
	{
		//checking if getTotal will return the correct total.
		Calculator cal = new Calculator();
		assertEquals(0, cal .getTotal());
		cal.add(10);
		assertEquals(10, cal .getTotal());
	}

	@Test
	public void testAdd() 
	{
		//checking if add will add the correct value to the total.
		Calculator cal = new Calculator();
		cal.add(10);
		assertEquals(10, cal .getTotal());
		cal.add(8);
		cal.add(1);
		assertEquals(19, cal .getTotal());
	}

	@Test
	public void testSubtract() 
	{
		//checking if Subtract will Subtract the correct value from the total.
		Calculator cal = new Calculator();
		cal.add(100);
		assertEquals(100, cal .getTotal());
		cal.subtract(19);
		cal.subtract(22);
		assertEquals(59, cal .getTotal());
	}

	@Test
	public void testMultiply() 
	{
		//checking if Multiply will Multiply the total by the correct value.
		Calculator cal = new Calculator();
		cal.multiply(20);
		assertEquals(0, cal .getTotal());
		cal.add(2);
		cal.multiply(3);
		cal.multiply(5);
		assertEquals(30, cal .getTotal());
	}

	@Test
	public void testDivide() 
	{
		//checking if Divide will Divide the total by the correct value, and that total will equal 0 if that value is 0.
		Calculator cal = new Calculator();
		cal.divide(5);
		assertEquals(0, cal .getTotal());
		cal.add(20);
		cal.divide(5);
		assertEquals(4, cal .getTotal());
		cal.multiply(0);
		assertEquals(0, cal .getTotal());
	}

	@Test
	public void testGetHistory() 
	{
		fail("Not yet implemented");
	}

}
