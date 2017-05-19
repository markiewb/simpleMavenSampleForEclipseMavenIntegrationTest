package sampleMAven;

import org.apache.commons.lang.StringUtils;

import otherDependencyB.User;

public class MainClass {

	public static void main(String[] args) {
		System.out.println(StringUtils.abbreviate("This a very long text, which has to be abbreviated", 10));
		System.out.println(new User().getName());

	}

}
