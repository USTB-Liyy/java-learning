package main;

class Student{
	String sid;
	String sname;
	Student(String id, String name){
		this.sid = id;
		this.sname = name;
	}
	public String toString(){
		return "sname = " + sname + "\tsid = " + sid;
	}
}
public class Main {
	public static void main(String[] args){
		Student stu = new Student("41824332", "Liyy");
		System.out.println(stu);
	}
}
