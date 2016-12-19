package il.ac.hit;

import java.lang.reflect.*;
import java.util.Arrays;

public class ReflectionTry {
	private Class className;
	private Method[] methodArr;
	private Field[] fieldArr;
	private Constructor[] constructorArr;
	
	public ReflectionTry(String name)
	{
		this.className = name.getClass();
		setMethodArr(className.getMethods());
		setFieldArr(className.getFields());
		setConstructorArr(className.getDeclaredConstructors());
	}

	public Class getClassName() {
		return className;
	}

	@Override
	public String toString() {
		String returnString;
		returnString = getMethodArr();
		return returnString;
	}

	public void setClassName(Class className) {
		this.className = className;
	}

	public String getMethodArr() {
		String methodString = "Methods: \n";
		for(int i=0;i<methodArr.length;i++){
			methodString += "\n"+methodArr[i].getName();
		}
		return methodString;
	}

	public void setMethodArr(Method[] methodArr) {
		this.methodArr = methodArr;
	}

	public Field[] getFieldArr() {
		return fieldArr;
	}

	public void setFieldArr(Field[] fieldArr) {
		this.fieldArr = fieldArr;
	}

	public Constructor[] getConstructorArr() {
		return constructorArr;
	}

	public void setConstructorArr(Constructor[] constructorArr) {
		this.constructorArr = constructorArr;
	}
}
