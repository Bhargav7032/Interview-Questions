package InterviewQuestions;

public final class ImmutableDemo {
 final String Hallticket;

public ImmutableDemo(String hallticket) {
	this.Hallticket = hallticket;
}


public String getHallticket() {
	return Hallticket;
}
 public static void main(String[] args) {
	 ImmutableDemo demo =new ImmutableDemo("345678");
	 String s1=demo.getHallticket();
	 System.out.println("Hallticket :"+s1);
 
 }
}
