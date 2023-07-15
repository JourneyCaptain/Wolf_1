package Home_Work_6;

public class L_3_Middle_Chars_Substring {
    public static void main(String[] args) {

        String str1 = "string";
        String str2 = "code";
        String str3 = "Practice";
        String str4 = "java";

        String result1 = getMiddleChars(str1);
        String result2 = getMiddleChars(str2);
        String result3 = getMiddleChars(str3);
        String result4 = getMiddleChars(str4);

        System.out.println(" 1: " + result1);
        System.out.println(" 2: " + result2);
        System.out.println(" 3: " + result3);
        System.out.println(" 4: " + result4);
    }
    public static String getMiddleChars (String str) {
        int length = str.length();
        int middle = length / 2;


        String middleChars = str.substring(middle - 1, middle + 1);
        return middleChars;


    }
}
