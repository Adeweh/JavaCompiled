package Strings;

public class MyString {
    private char[] charArray;

    public MyString(String s) {
        this.charArray = s.toCharArray();
    }

    public int indexOf(String substring, boolean ignoreCase) {
        char[] substringCharArray = substring.toCharArray();
        int lengthOfSubString = substring.length();
        char[] subArray = new char[lengthOfSubString];

        for (int i = 0; i <= charArray.length - lengthOfSubString; i++) {
            // if (i + lengthOfSubstring <= charArray.length){
            for (int j = 0; j < lengthOfSubString; j++) {
                subArray[j] = charArray[j + i];

            }
            int j = 0;
            while (j < subArray.length) {
                if (ignoreCase) {
                    if (!String.valueOf(subArray[j]).equalsIgnoreCase(String.
                            valueOf(substringCharArray[j]))) {
                        break;
                    }
                } else {
                    if (!String.valueOf(subArray[j]).equalsIgnoreCase(String.
                            valueOf(substringCharArray[j]))) {
                        break;
                    }
                }
                j++;
            }
            if (j == subArray.length) {
                return i;
            }

        }
        return -1;
    }

        public static void main (String[]args){
            MyString s = new MyString("Ehis");
            int value = s.indexOf("is", false);
            System.out.println(value);
        }
    }
