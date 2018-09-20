package practise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailIdValidation {

	public static void main(String[] args) {
		
		
		String email="u@rbs.com";
		if (null != email) {
            String regex = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            if (!matcher.matches()) {
                //addFormException(new DropletException("Email not valid "));
            }
        }

	}

}
