package pack1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathematicsTest 

{

	@Test
	void testAdd() 
	{
		Mathematics maths=new Mathematics();
		int result=maths.add(50, 50);
		assertEquals(100,result);
	}

	@Test
	void testSub() 
	{
		Mathematics maths=new Mathematics();
		int result=maths.sub(350, 250);
		assertEquals(100,result);
	}

	@Test
	void testMul() 
	{
		Mathematics maths=new Mathematics();
		int result=maths.mul(10, 10);
		assertEquals(100,result);
	}

	@Test
	void testDiv() 
	{
		Mathematics maths=new Mathematics();
		int result=maths.div(1000, 10);
		assertEquals(100,result);
	}

}
