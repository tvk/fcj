package com.senselessweb.fcj;

import java.util.List;

/**
 * Interface that decorates the {@link List} interface with functional methods.
 * 
 * @author Thomas Voecking
 *
 * @param <A> The type of this list.
 */
public interface FList<A> extends List<A> 
{

	/**
	 * Transforms this list into another list by using the given function.
	 * 
	 * @param <B> The return type of the list.
	 * @param function The function.
	 * 
	 * @return The transformed list.
	 */
	public <B> FList<B> transform(Function<A, B> function);
}
