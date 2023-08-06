// This is the main class Question
public class Question214{
	public static void main(String[] args){
		Answer a = new Answer(10,"MCQ");
	}
}
class Answer {
    private int marks;
    private String type;

    // Default constructor
    public Answer() {
        System.out.print("You got nothing.\n");
    }

    // Parameterized constructor
    public Answer(int marks, String type) {
        // Call the default constructor first
        this();
        // Set the values for marks and type
        this.marks = marks;
        this.type = type;
        System.out.print("You got " + marks + " for an " + type);
    }
}
