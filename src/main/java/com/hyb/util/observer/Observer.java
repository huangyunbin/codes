
package com.hyb.util.observer;


/**
 *
 * @author bean
 * @date 2014-1-10
 */
public interface Observer<S extends Observable<S, O, A>, O extends Observer<S, O, A>, A>{
	
	 void update(S s,  A arg);

}
