package lib;

public class PasswordValidator {

    /**
    * ตรวจสอบความยากง่ายของรหัสผ่านที่Userใช้งาน
    * @param password : รหัสผ่านที่userใส่เข้ามา
    * @return : ความยากง่านของรหัสผ่านที่Userใช้งาน (INVALID = ไม่ถูกต้อง,WEAK = ง่าย,MEDIUM = ปานกลาง,STRONG = ยาก)
    */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { 
        
        int minLength = 8 ; 

        if(password == null || password.length() < minLength){
            return PasswordStrength.INVALID;
        }
        boolean digit = false;
        boolean upper = false;
        boolean lower = false;

        for(char c : password.toCharArray()){
            if(Character.isDigit(c)){
                digit = true; 
            }else if (Character.isUpperCase(c)){ 
                upper = true;
            }else if (Character.isLowerCase(c)){
                lower = true;
            }
        }

        if(digit && upper && lower){
            return PasswordStrength.STRONG;
        }else if((digit && upper)  || (lower && digit) || (lower && upper) ){
            return PasswordStrength.MEDIUM;
        }else if(digit || upper  || lower){
            return PasswordStrength.WEAK;
        }else{
            return PasswordStrength.INVALID;
        }

    }
}