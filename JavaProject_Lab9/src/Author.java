
public class Author {
	private String name;
	private String email;
	private char gender;
	
	public Author(String name,String email,char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public Author(String name,String email) {
		this (name, email, 'M');
	}
	public Author() {
		this ("", "", 'M');
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getGenderName() {
		if (gender == 'M' || gender == 'm') {
			return "Male";
		} else if (gender == 'F' || gender == 'f') {
			return "Female";
		} else {
			return null;
		}
	public String toString() {
		return String.format("Author name: %s (%s;%s)", name, email, getGenderName());
		}
}