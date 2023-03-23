package Lambda;

import java.util.ArrayList;

@FunctionalInterface
public interface GenericFuntion<P, R> {
	
	//Usare ... permette di avere un numero indefinito di parametri di quella tipologia ma x sarà un Array
	public R execute(P... x);
	
//	default void defaultMethod() {
//		
//	};
	
//	public void test(String s, int... x);

}