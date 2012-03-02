package com.senselessweb.fcj.impl;

import org.junit.Test;

import junit.framework.Assert;

import com.senselessweb.fcj.FList;
import com.senselessweb.fcj.Function;


/**
 * Testcases for {@link FListImpl}.
 * 
 * @author Thomas Voecking
 */
public class FListImplTest 
{

	/**
	 * Tries to transform an {@link FListImpl} into another list.
	 */
	@Test
	public void transformList() 
	{
		final FList<Integer> original = new FListImpl<Integer>(1, 2, 3, 4, 5);
		
		final FList<Integer> multipliedByTwo = original.transform(new Function<Integer, Integer>() {
			public Integer apply(final Integer input) 
			{
				return input * 2;
			}
		});
		Assert.assertEquals(new FListImpl<Integer>(2, 4, 6, 8, 10), multipliedByTwo);
		
		final FList<String> asString = original.transform(new Function<Integer, String>() {
			public String apply(final Integer input) 
			{
				return String.valueOf(input);
			}
		});
		Assert.assertEquals(new FListImpl<String>("1", "2", "3", "4", "5"), asString);

	}
	
}
