/** 
* @Title: Test.java 
* @Package com.lwj 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年4月24日 上午10:43:34 
* @version V1.0   
*/
package com.lwj;

import java.util.ArrayList;
import java.util.List;

/** 
 * @ClassName: Test  
 * @author bill
 * @date 2018年4月24日 上午10:43:34  
 */
public class Test {
	
	public static ThreadLocal<String> stringLocal = new ThreadLocal<String>();
	public static ThreadLocal<Integer> integerLocal = new ThreadLocal<Integer>();

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();
		List<Integer> integerList = new ArrayList<Integer>();
		
		System.out.println(stringList.getClass() == integerList.getClass());
		
		Test1<String> t = new Test1<String>("hello");
		
		Test2<Integer> t2 = new Test2Impl<Integer>();
		
		System.out.println("dd");
		
		stringLocal.set("hello");
		integerLocal.set(123);
		
		System.out.println(stringLocal.get());
		System.out.println(integerLocal.get());
	}
}

/**
 * 泛型类
* @ClassName: Test1  
* @author bill
* @date 2018年4月24日 上午10:48:03
 */
class Test1<T> {
	private T value;
	
	public Test1(T t) {
		this.value = t;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}


interface Test2<T>{
	T next();
}

class Test2Impl<T> implements Test2<T>{

	@Override
	public T next() {
		System.out.println("dd");
		return null;
	}
	
}
