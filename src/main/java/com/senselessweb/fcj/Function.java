package com.senselessweb.fcj;

/**
 * Interface that defines a function A -> B.
 * 
 * @author Thomas Voecking
 *
 * @param <A> The input type of the function
 * @param <B> The output type of the function
 */
public interface Function<A, B> 
{

	/**
	 * Evaluates the function
	 * 
	 * @param input The input parameter.
	 * @return The return value.
	 */
	public B apply(A input);
}
