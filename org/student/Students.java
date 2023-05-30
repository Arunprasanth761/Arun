package org.student;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println(id);
		
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("id-"+id);
		System.out.println("name-"+name);
		
	}
	public void getStudentInfo(String email,Long phonenumber) {
		System.out.println(email);
		System.out.println(phonenumber);
		
	}


	public static void main(String[] args) {
		Students st=new Students();
		st.getStudentInfo(10);
		st.getStudentInfo(10, "Arun");
		st.getStudentInfo("arunsenthil761@gmail.com", 7339226761L);
		
	}

}
