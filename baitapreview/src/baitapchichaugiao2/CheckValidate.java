package baitapchichaugiao2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidate {
    private final String ID_REGEX = "^[C][0-9]{4}[GHIK]{1}[0-9]{1}$";
    private final String DATEOFBIRTH_REGEX = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    private final String EMAIL_REGEX = "\\b[A-Za-z0-9._%-]+@[a-z0-9.-]+\\.[a-z]{2,4}\\b";
    private final String NAME_REGEX = "^[\\p{L} .'-]+$";

    public CheckValidate() {
    }
    public boolean validateID(String id){
        Pattern pattern = Pattern.compile(ID_REGEX);
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }
    public boolean validateDate(String Dateofbirth){
        Pattern pattern = Pattern.compile(DATEOFBIRTH_REGEX);
        Matcher matcher = pattern.matcher(Dateofbirth);
        return matcher.matches();
    }
    public boolean validateEmail(String email){
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public boolean validateName(String name){
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();

    }
}
