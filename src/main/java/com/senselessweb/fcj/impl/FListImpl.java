package com.senselessweb.fcj.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

import com.senselessweb.fcj.FList;
import com.senselessweb.fcj.Function;

/**
 * 
 * Default implementation of the {@link FList} interface based on an {@link ArrayList}.
 * 
 * @author Thomas Voecking 
 *
 * @param <A> The type of this list.
 */
public class FListImpl<A> extends ArrayList<A> implements FList<A> 
{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6733473253400303885L;

	
	/**
	 * Default constructor. 
	 */
	public FListImpl() 
	{
		super();
	}
	
	/**
	 * Constructor
	 * 
	 * @param elements The initial elements.
	 */
	public FListImpl(final Collection<? extends A> elements) 
	{
		super(elements);
	}	
	
	/**
	 * Constructor
	 * 
	 * @param elements The initial elements.
	 */
	public FListImpl(final A... elements) 
	{
		this(Arrays.asList(elements));
	}

	/**
	 * @see com.senselessweb.fcj.FList#transform(com.senselessweb.fcj.Function)
	 */
	public <B> FList<B> transform(final Function<A, B> function) 
	{
		final FList<B> result = new FListImpl<B>();
		final Iterator<A> it = this.iterator();
		
		while (it.hasNext())
			result.add(function.apply(it.next()));
		
		return result;
	}
	
}
