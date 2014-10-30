public class Student 
{

    private String name;
    private int test[]= new int [3]; 

    public Student(String nm, int t[]) {
	name = nm;
	test=t;
    }

	//Another constructor
    public Student(Student other) {
	this(other.name,other.test);
	}

    public void setName(String nm) {
    	name = nm;
    }
    
    public String getName() {
    	return name;
    }

    public void setMark(int i, int score)
    {
    	test[i-1]=score;
    }

    public int getMark(int i) 
    {
	return test[i-1];
    }
    
    public int getAverage() 
    {
    	int average;
         average=(test[0] + test[1] + test[2]) /3;  
    	return average;
    }

    public String toString() 
    {
    	String result = "Name:\t" + name;
    	result += "\n" + getAverage();
    	return result;
    }

    //validate data
    public String validateData() 
    {
    	String message = null;
    	//check if name is entered
    	
        if (name.length() <2)
        
    		message += "\nName is required\nPlease re-enter all data";
    	
	if (test[0]<0 || test[0]> 100 || test[1]<0 || test[1]> 100 || test[2]<0 || test[2]> 100) 
    		message += "\nPlease re-enter all data";
    	
        return message;
    }
    
 }

