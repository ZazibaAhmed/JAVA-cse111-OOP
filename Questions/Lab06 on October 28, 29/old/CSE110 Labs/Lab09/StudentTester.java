class StudentTester{
	public static void main(String[]args){
		Student john;
		john = new Student();
		
		john.setName("John Abraham");
		john.setID("10203040");
		john.setAddress("66, Mohakhali");
		john.setCGPA(4.0);

		
		System.out.println(john.getName());
		System.out.println(john.getID());
		System.out.println(john.getAddress());
		System.out.println(john.getCGPA());
	}
}
