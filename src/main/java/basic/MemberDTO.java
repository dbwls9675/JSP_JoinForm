package basic;

public class MemberDTO {
	String id, pw, name, tel, gender;
	int no, age;
	
	public MemberDTO(String id, String pw, String name, String tel, 
			String gender, int no, int age ) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
		this.gender = gender;
		this.no = no;
		this.age = age;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + ", gender=" + gender + ", no="
				+ no + ", age=" + age + "]";
	}
}
