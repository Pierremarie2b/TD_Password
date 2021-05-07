public class PasswordValidator {


    public void validePwd(String password){


    }

    public boolean testLengthPassword(String password) {
        return password.length() > 6;

    }

   public boolean testNumber(String password){
        return password.matches(".*[0-9].*");

    }


    public boolean testLetter(String password){
        return password.matches(".*[a-zA-Z].*");

    }



}
