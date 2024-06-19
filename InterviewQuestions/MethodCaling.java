package InterviewQuestions;
public class MethodCaling {  
    
	
	 //method block//
	
	public void myMethod()   
    {  
    System.out.println("Method Block");  
    } 
	
	//instance block//
	
    {  
    System.out.println("Instance Block");  
    }
    
     //constructor block//
    
    public MethodCaling()  
    {  
    System.out.println("Constructor Block");  
    }
    
    //Static Block// 
    
    static {  
        System.out.println("static Block");  
    } 
    
    
    public static void main(String[] args) {  
    MethodCaling c = new MethodCaling();  
    c.myMethod();  
  }  
}  

//A  ) Instance block, method, static block, and constructor 
//B) Method, constructor, instance block, and static block 
//C) Static block, method, instance block, and constructor 
//D) Static block, instance block, constructor, and method // correct Answer



