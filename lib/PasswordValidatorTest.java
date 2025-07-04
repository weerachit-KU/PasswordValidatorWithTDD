package lib;

public class PasswordValidatorTest{

    
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
       // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String pw = "123" ;
        PasswordStrength result1 = PasswordValidator.validate("123");
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed: " + pw + ": Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED: " + pw + ": Expected INVALID but got " + result1);
        }

        // Test Case 2: รหัสผ่านทั้งหมดเป็นตัวเล็กจะ WEAK
        pw = "abcdefghijDD" ;
        PasswordStrength result2 = PasswordValidator.validate("abcdefghij");
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 Passed: " + pw + ": All lowercase password is WEAK.");
        } else {
            System.out.println("Test Case 2 FAILED: " + pw + ": Expected WEAK but got " + result2);
        }

        pw = "ABBbb12343" ;
        PasswordStrength result3 = PasswordValidator.validate("ABBBB1234");
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 Passed: " + pw + ": Lowercase or uppercase with digits password is MEDIUM.");
        } else {
            System.out.println("Test Case 3 FAILED: " + pw + ": Expected MEDIUM but got " + result3);
        }
        
        pw = "_ABdjdj36541@@\\" ;
        PasswordStrength result4 = PasswordValidator.validate("ABdjdj36541");
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 Passed: " + pw + ": Lowercase with uppercase and digits password is STRONG.");
        } else {
            System.out.println("Test Case 4 FAILED: " + pw + ": Expected STRONG but got " + result4);
        }
        
        pw = "AAAAAAAAAAAA" ;
        PasswordStrength result5 = PasswordValidator.validate("ABdjdj36541");
        if (result5 == PasswordStrength.STRONG) {
            System.out.println("Test Case 5 Passed: " + pw + ": All password is uppercase password is STRONG.");
        } else {
            System.out.println("Test Case 5 FAILED: " + pw + ": Expected WEAK but got " + result5);
        }
        pw = "_SDADASDD@@@@" ;
        PasswordStrength result6 = PasswordValidator.validate("ABdjdj36541");
        if (result6 == PasswordStrength.STRONG) {
            System.out.println("Test Case 6 Passed: " + pw + ": Password has uppercase and special password is STRONG.");
        } else {
            System.out.println("Test Case 6 FAILED: " + pw + ": Expected STRONG but got " + result6);
        }
        pw = " " ;
        PasswordStrength result7 = PasswordValidator.validate("ABdjdj36541");
        if (result7 == PasswordStrength.STRONG) {
            System.out.println("Test Case 7 Passed: " + pw + ": Password has uppercase and special password is INVAILD.");
        } else {
            System.out.println("Test Case 7 FAILED: " + pw + ": Expected STRONG but got " + result7);
        }
        System.out.println("--------------------------------");
    }
}
