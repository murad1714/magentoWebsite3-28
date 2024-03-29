package myTestcasess;
import java.util.Random;

public class Parameters {
	Random rand = new Random();
	
    String[] firstnames = {"Alice", "Bob", "Charlie", "Diana", "Eva", "Frank", "Gina", "Henry", "Ivy", "Jack", "Kelly", "Leo", "Mia", "Nathan", "Olivia", "Peter", "Quinn", "Rachel", "Sam", "Tina", "Victor", "Wendy", "Xavier", "Yvonne", "Zack"};
    String[] lastnames = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin", "Thompson", "Garcia", "Martinez", "Robinson", "Clark", "Rodriguez", "Lewis", "Lee"};
	String CommonPassword = "asd123@!$";
	
	int randomIndex = rand.nextInt(10);
	int randomEmailId = rand.nextInt(999);
	
	String emailID =firstnames[randomIndex]+lastnames[randomIndex]+randomEmailId+"@"+"gmail.com";


}
