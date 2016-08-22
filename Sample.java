package Logical;

import java.util.Scanner;

public class Sample {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String str=s.next();
	StringBuffer buff=new StringBuffer(str);
StringBuffer s1=buff.reverse();
String value=new String(s1);
System.out.println(value);
}
}
