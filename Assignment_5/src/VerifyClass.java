public class VerifyClass {
    public boolean isValid(String password) {
        if (password.length() < 6)
            return false;

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;

        for (char c :password.toCharArray())
        {
            if (Character.isUpperCase(c))
                hasUppercase = true;
             else if (Character.isLowerCase(c))
                hasLowercase = true;
            else if (Character.isDigit(c))
                hasDigit = true;

            if (hasDigit && hasLowercase && hasUppercase)
                return true;
        }
        return false;
    }
}
