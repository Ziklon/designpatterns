package org.patterns.creational.builder;

import org.junit.Assert;
import org.junit.Test;

public class CarTest {

	
	
	@Test(expected=IllegalArgumentException.class)
	public void testMissingColor() {
		Car car = new Car.Builder(null)
						.size(Size.SMALL)
						.wheels(4)
						.build();
		
		
		Assert.assertEquals("Red", car.getColor());
	}
	
	
	@Test
	public void testBuild() {
		Car car = new Car.Builder("Red")
						.size(Size.SMALL)
						.wheels(4)
						.build();
		
		
		Assert.assertEquals("Red", car.getColor());
		Assert.assertEquals(Size.SMALL, car.getSize());
		Assert.assertEquals(4, car.getWheels());
		
	}

}
