package Program1;
import java.security.SecureRandom;
public class generatpassword {

	    public static void main(String[] args) {
	        int length = 12; // Adjust the length of the password as needed
	        System.out.println(generatePassword(length));
	    }

	    public static String generatePassword(int length) {
	        // Define the character set from which to generate the password
	        String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";

	        // Create a secure random number generator
	        SecureRandom random = new SecureRandom();

	        StringBuilder password = new StringBuilder();
	        for (int i = 0; i < length; i++) {
	            // Generate a random index within the character set length
	            int randomIndex = random.nextInt(charset.length());

	            // Append the character at the random index to the password
	            password.append(charset.charAt(randomIndex));
	        }

	        return password.toString();
	    }
	}

