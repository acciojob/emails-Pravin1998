package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(password.equals(oldPassword)){
            if(isValid(newPassword)){
                this.password = newPassword;
            }
        }

    }
    private boolean isValid(String newPassword){
        boolean containsuppercase = false;
        boolean containsLowerCase = false;
        boolean containsDigit = false;
        boolean containsSpecialChar = false;

        if(newPassword.length()<8) return false;

        for(int i=0;i<newPassword.length();i++){
            char val = newPassword.charAt(i);
            if(val>='A' && val<='Z'){
                containsuppercase = true;
            }
            else if(val>='a' && val<='z'){
                containsLowerCase = true;
            }else if(val>='0' && val<='9'){
                containsDigit = true;
            }else{
                containsSpecialChar = true;
            }
        }
        if(containsSpecialChar && containsDigit && containsLowerCase && containsuppercase){
            return true;
        }
        return false;

    }
}
