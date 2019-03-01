package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Check validation and return boolean value 
 * @author SHIVAM-JAMAIWAR
 *
 */
public class CheckValidations 
{
	//patterns
	  private static final String NAME_PATTERN = "^[a-zA-Z]{2,15}+[ ]+[a-zA-Z]{3,15}+$";
      private static final String EMAIL_PATTERN ="^[_A-Za-z0-9]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9]+(\\.[A-Za-z0-9])*(\\.[A-Za-z]{2,})$";
      private static final String MOBILE_NO_PATTERN = "^[0-9]{10}$";
      private static final String PASSWORD_PATTERN = "((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,15})";
      
      
      /**
       * check user entered name is valid or not
       * @param user entered name
       * @return return true if entered name is valid 
       */
	public static boolean checkName(final String name)
	{
			Pattern  pattern1 = Pattern.compile(NAME_PATTERN);
		    Matcher matcher1 = pattern1.matcher(name);
		//	  System.out.println(matcher1.matches());
			return matcher1.matches();
    }
	
	/**
	 * check user entered mail is valid or not
	 * @param user entered mail
	 * @return return true if entered mail is valid 
	 */
	public static boolean checkMail(final String mail)
	{
		  Pattern pattern2 = Pattern.compile(EMAIL_PATTERN);
		  Matcher matcher2 = pattern2.matcher(mail);
		//  System.out.println(matcher2.matches());
		  return matcher2.matches();
    }
	
	/**
	 * check user entered mobile no. is valid or not
	 * @param user entered mobile no.
	 * @return return true if entered mobile no. is valid 
	 */
	public static boolean checkMobileNo(final String mobileNo)
	{
		Pattern pattern3 = Pattern.compile(MOBILE_NO_PATTERN);
		Matcher matcher3 = pattern3.matcher(mobileNo);
		//  System.out.println(matcher3.matches());
		return matcher3.matches();
	}
	
	/**
	 * check user entered password is valid or not
	 * @param user entered password
	 * @return return true if entered password is valid 
	 */
	public boolean checkPassword(final String password)
	{
		Pattern pattern4 = Pattern.compile(PASSWORD_PATTERN);
		 Matcher matcher4 = pattern4.matcher(password);
		  System.out.println(matcher4.matches());
		  return matcher4.matches();
	}

}
