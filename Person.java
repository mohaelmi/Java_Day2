
public class Person {
	
	
	public Person(){
			
	};
	
	public Person(String firstName, String lastName, String address, int dateOfBirth, String nationality,String city, int weight, int height, boolean isMale ) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.nationality = nationality;
		this.city = city;
		this.weight = weight;		
		this.height = height;
		this.isMale = isMale;
		this.counter = this.counter + 1;
		
	}

	public static int counter;
	
	public String firstName;
	public String lastName ;
	public String address ;
	private int dateOfBirth; //most of people don't like mention their ages specifically girls
	public String nationality;
	public String city;
	private int weight; //  people prefer to be private
	private int height; // also people prefer to be private
	public boolean isMale;
	
	public String getFullName() {	
		
		return this.firstName+this.lastName;
	}
	
	public int getHeightInFeet() {
		
		return 2 * this.height;
	}
	public int getAge(int age) {
		return age;
	}
	public void eating () {
		System.out.println("iam eating");
		this.weight=this.weight +1;
	}
	public void getInfo() {
		System.out.println(this.firstName+'\n'+this.lastName+'\n'+this.address+'\n'+this.dateOfBirth+'\n'+this.nationality+'\n'+this.city+'\n'+this.weight+'\n'+this.height+'\n'+this.isMale);
//		System.out.println(this.counter);
	
	}
	
	public int getdateOfBirth() {
		return this.dateOfBirth;
	}
	public int getweight() {
		return this.weight;
	}
	public int getheight() {
		return this.height;
	}
	
	public void setdateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public void setweight(int weight) {
		this.weight = weight;
	}
	public void setheight(int height) {
		this.height = height;
	}

	public static void main(String[] args) {
		
		Person person[] = new Person[4];
		String[] firstName = { "mohamed", "yasan", "ali", "abad" };
	    String[] lastName = { "hussein", "alewa", "kamal", "jamal" };
	    String[] address = { "amman", "amman", "kuwait", "irbid" };
	    int[]  dateOfBirth = {1995,1999,1994,1992};
	    String[] nationality = { "somalian", "gazenian", "kuwaity", "jordanian" };
	    String[] city = { "amman", "amman", "kuwait", "irbid" };
		int[] weight = {50,70,60,90};
		int[] height= {165,175,60,120};
		boolean[] isMale = {true,true,false,false};
	    
		for (int i = 0; i < 4; i++) {
	        person[i] = new Person();
	        person[i].firstName = firstName[i];
	        person[i].lastName = lastName[i];
	        person[i].address = address[i];
            person[i].dateOfBirth = dateOfBirth[i];
            person[i].nationality= nationality[i];
            person[i].city =  city[i];
    		person[i].weight = weight[i];
            person[i].height= height[i];
            person[i].isMale= isMale[i];

	    }
		
		for (int j = 0; j < 4; j++) {
		
			person[j].getInfo();
			System.out.print("\n");
		}
//		
//		System.out.println(Person.counter);
//		Person obj = new Person("yasan", "alewa", "amman", 1999, "gazenian", "amman", 50, 150, true);
//		obj.getInfo();
//		System.out.println(Person.counter);
//		Person moha = new Person("mohamed", "hussen", "amman", 1995, "somalian", "amman", 50, 150, true);
//		moha.getInfo();
//		System.out.println(Person.counter);
////		obj.eating();
////		System.out.println(obj.weight);
////		obj.getFullName();
//		obj.getHeightInFeet();
	
	}
	
	

}


    