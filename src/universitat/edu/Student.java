package universitat.edu;

public class Student {
	private String id;
	private String title;
	private String fullName;
	private String subjectNote;
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getID(){
		return id;
	}
	public void setID(String id){
		this.id = id;
	}
	public String getSubjectNote(){
		return subjectNote;
	}
	public void setSubjectNote(String subjectNote){
		this.subjectNote = subjectNote;
	}
	@Override
	public String toString() {
		return id + "," + title + "," +fullName+ "," + subjectNote ;
	}
	public Student(){
		
	}
	public Student(String id, String title, String fullName, String subjectNote){
		this.fullName = fullName;
		this.id = id;
		this.subjectNote = subjectNote;
		this.title = title;
	}
	
	

}
