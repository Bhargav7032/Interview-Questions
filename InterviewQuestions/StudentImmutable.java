package InterviewQuestions;
public  final class StudentImmutable {
	final String HallticketNumber;
public StudentImmutable(String hallticketNumber) {
	
	this.HallticketNumber = hallticketNumber;
}
public StudentImmutable() {
	this.HallticketNumber ="";
	
}
public String getHallticketNumber() {
	return HallticketNumber;
}
public static void main(String[]args) {
	StudentImmutable std=new StudentImmutable("2345678");
	String s1=std.getHallticketNumber();
	System.out.println("HallticketNumber:"+s1);
}
	
	}  

