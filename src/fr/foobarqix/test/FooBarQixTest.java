package fr.foobarqix.test;

import org.junit.Assert;
import org.junit.Test;

import fr.foobarqix.main.FooBarQixParam;
import fr.foobarqix.main.IFooBarQix;

public class FooBarQixTest {
	private IFooBarQix fbq = new FooBarQixParam();
		
	@Test
	public void testDoFooBarQix() {		
		Assert.assertEquals("1", fbq.doFooBarQix(1));
		Assert.assertEquals("2", fbq.doFooBarQix(2));
		Assert.assertEquals("FooFoo", fbq.doFooBarQix(3));
		Assert.assertEquals("4", fbq.doFooBarQix(4));
		Assert.assertEquals("BarBar", fbq.doFooBarQix(5));
		Assert.assertEquals("Foo", fbq.doFooBarQix(6));
		Assert.assertEquals("QixQix", fbq.doFooBarQix(7));
		Assert.assertEquals("8", fbq.doFooBarQix(8));
		Assert.assertEquals("Foo", fbq.doFooBarQix(9));
		Assert.assertEquals("Bar", fbq.doFooBarQix(10));
		Assert.assertEquals("11", fbq.doFooBarQix(11));
		Assert.assertEquals("FooQix", fbq.doFooBarQix(21));
		Assert.assertEquals("FooFooFoo", fbq.doFooBarQix(33));
		Assert.assertEquals("BarQixFooBar", fbq.doFooBarQix(35));
		Assert.assertEquals("FooQix", fbq.doFooBarQix(37));
		Assert.assertEquals("FooBar", fbq.doFooBarQix(51));
		Assert.assertEquals("BarFoo", fbq.doFooBarQix(53));
		Assert.assertEquals("QixFoo", fbq.doFooBarQix(73));
		Assert.assertEquals("FooBarQixBar", fbq.doFooBarQix(75));
		Assert.assertEquals("Foo", fbq.doFooBarQix(99));
		Assert.assertEquals("Bar", fbq.doFooBarQix(100));		
	}

}
