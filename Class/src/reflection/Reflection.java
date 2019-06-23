package reflection;

import java.lang.reflect.*;


public class Reflection {
	public static void main(String[] args) {
		
		Class reflectClass = A.class;
		
		String className = reflectClass.getName();
		{
			System.out.println("className:" + className);
		}
		
		int classModifier = reflectClass.getModifiers();
		System.out.println(Modifier.isPublic(classModifier));
	
		Method[] methods = reflectClass.getMethods();
		
		  for(int i = 0; i< methods.length; i++) { 
			  System.out.println(methods[i].getName()); }
		 
		Field[] fields = reflectClass.getFields();
		for(int i = 0; i< fields.length; i++) { 
			  System.out.println(fields[i].getName()); }
	}
	
	

}
