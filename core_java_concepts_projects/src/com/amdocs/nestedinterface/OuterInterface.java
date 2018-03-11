package com.amdocs.nestedinterface;

/**
 * the internal code generted by the java compiler is as follows,
 * 
 * public static interface OuterInterface$InnerInterface {
 * 		
 * 		public abstract void msg();
 * }
 * 
 * @author Amit
 *
 */
public interface OuterInterface {

	public interface InnerInterface {
		void msg();
	}
	
}
