import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		 if(students==NULL)
		throw new IllegalArgumentException();
	}

	@Override
	public Student getStudent(int index) {
		if(index<0||index>=students.length)
		throw new IllegalArgumentException();
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		if(student==NULL)
		throw new IllegalArgumentException();
	
	if(index<0||index>=students.length)
		throw new IllegalArgumentException();
	}

	@Override
	public void addFirst(Student student) {
		Student[] prependedArray = new ArrayList<Student>() {
  {
    add(student);
    addAll(Arrays.asList(originalArray));
  }
}.toArray(new Student[0]);
	}

	@Override
	public void addLast(Student student) {
		Student[] appendedArray = new ArrayList<Student>() {
  {
    addAll(Arrays.asList(originalArray));
	add(student);
  }
}.toArray(new Student[]);
	}

	@Override
	public void add(Student student, int index) {
	Student[index]=student;
	
	 if(student==NULL)
		throw new IllegalArgumentException();
	if(index<0||index>=students.length)
		throw new IllegalArgumentException();
	}


	@Override
	public void remove(int index) {
		Student[index]="0";
		if(index<0||index>=students.length)
		throw new IllegalArgumentException();
	}

	@Override
	public void remove(Student student) {
		for(int i=0; i<index; i++)
       {
           if(Student[index] == student)
           {
                   Student[index] = "0";
               break;
           }
		   else{
			   throw new IllegalArgumentException("Student not exist");
			   {
       }
	   
	   if(student==NULL)
		throw new IllegalArgumentException();
	}

	@Override
	public void removeFromIndex(int index) {
		for (int i=0; i>index; i++)
		 Student[i]="0";
	if(index<0||index>=students.length)
		throw new IllegalArgumentException();
	}

	@Override
	public void removeFromElement(Student student) {
		
		for (int i=0; i>student; i++)
		 Student[i]="0";
	
	if(student==NULL)
		throw new IllegalArgumentException();
	}

	@Override
	public void removeToIndex(int index) {
		for (int i=0; i<index; i++)
		 Student[i]="0";
	if(index<0||index>=students.length)
		throw new IllegalArgumentException();
	}
	}

	@Override
	public void removeToElement(Student student) {
		for (int i=0; i<student; i++)
		 Student[i]="0";
	if(student==NULL)
		throw new IllegalArgumentException();
	}
	}

	@Override
	public void bubbleSort() {
		 int n = student.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(Student[j-1] > Student[j]){  
                                 //swap elements  
                                 temp = Student[j-1];  
                                 Student[j-1] = Student[j];  
                                 Student[j] = temp;  
                         }  
                          
                 }  
         }  
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		for(int i=0;i<=date;i++)
		System.out.print(Student[i] + " ");
		
		if(date==NULL)
		throw new IllegalArgumentException();
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		for(int i=0;i>=firstDate || i<=lastDate;i++)
		System.out.print(Student[i] + " ");
		
		if(firstDate==NULL || lastDate==NULL)
		throw new IllegalArgumentException();
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		for(int i=0;i>=date || i<=days;i++)
		System.out.print(Student[i] + " ");
		
		if(date==NULL)
		throw new IllegalArgumentException();
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		for(int i=0; i<=student.length; i++){
	
	if(i==indexOfStudent)
System.out.print(indexOfStudent.getYear() + " ");
}
if(indexOfStudent==0)
		throw new IllegalArgumentException();
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		for(int i=0; i<=student.length; i++){
	
	if(i==age)
System.out.print(Student[i] + " ");
}
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
