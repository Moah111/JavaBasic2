package universitat.edu;

import java.util.List;

public class Classes {
	private String id;
	private String subject;
	private String professorName;
	private List<Student> listStudent;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getProfessorName() {
		return professorName;
	}
	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}
	public List<Student> getlistStudent() {
		return listStudent;
	}
	public void setlistStudent(List<Student> listStudent) {
		this.listStudent = listStudent;
	}
	
	@Override
	public String toString() {
		return  id +","+ subject
				+","+  professorName +"," + toStringStr(listStudent) ;
	}

	private String toStringStr(List<Student> listStudent) {
		String line = "";
		for (int i = 0; i < listStudent.size(); i ++) {
			Student student = listStudent.get(i);
			line = line + student.getID() + "|" + student.getTitle() + "|" + student.getFullName() +"|" + student.getSubjectNote();
			if (!(i == listStudent.size() -1) ) {
				line += ":";
			}

		}
		return line;
	}

	public Classes(){
		
	}
	public Classes(String id, String subject, String professorName,List listStudent){
		this.id=id;
		this.listStudent = listStudent;
		this.professorName = professorName;
		this.subject = subject;
	}

}
