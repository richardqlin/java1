class Language{
	String name;

	Language(){
		System.out.println("Constructor method called.");
	}

	Language(String t) {
	 name=t;
	}

	public static void main(String[] args){
		Language cpp =new Language();
		Language java =new Language("java");
		cpp.setName("C++");

		java.getName();

		cpp.getName();
	}

	void setName(String t){
		name=t;
	}

	void getName(){
		System.out.println("language name:"+name);
	}
}
