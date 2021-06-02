package baitapchichaugiao2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validate {
    private final String ID_REGEX = "^[C][G]{1}[0-9]{4}[GHIK]{1}[0-9]{1}$";
    private final String DATEOFBIRTH_REGEX = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";
    private final String EMAIL_REGEX = "\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b";

    public validate() {
    }
    public boolean validateID(String id){
        Pattern pattern = Pattern.compile(ID_REGEX);
        Matcher matcher = pattern.matcher(ID_REGEX);
        return matcher.matches();
    }
    public boolean validateDate(String Dateofbirth){
        Pattern pattern = Pattern.compile(DATEOFBIRTH_REGEX);
        Matcher matcher = pattern.matcher(DATEOFBIRTH_REGEX);
        return matcher.matches();
    }
    public boolean validateEmail(String email){
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(EMAIL_REGEX);
        return matcher.matches();
    }
}
