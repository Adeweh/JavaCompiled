package JavaFlex;

public class StringTest {
    public static void main(String[] args) {

        String s = "abcdabcdabca";
        int count = 0;
        //char findChar = 'a';
//
//        char arr[] = s.toCharArray();
//
//        for (int i = 0; i < arr.length; i++) {
//            if( s.charAt(i) == findChar){
//                count++;
//            }
//
//
//        }
//        System.out.println(count);

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a') {
                count++;
            }

        }
        System.out.println(count);;


    }

}
