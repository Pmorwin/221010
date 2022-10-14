public class eeeeeeeeeeeeeeee {
    public static void main(String[] args) {
        //int n = 9;   m.length() == n
        String m = "sAnD wetch!";
        String e = "";    //i < n
        for(int i = 0; i < m.length(); i++){
//            if(m.charAt(i)==' '){
//                e = e + " "; //This will
//            }
//            else{
//                e = e + "e";// This will take my empty string, add "e" to it, for each letter of my word and then reassign the variable e to the new value
//            }
            if(m.charAt(i)!=' '){
                e = e + "e";// This will take my empty string, add "e" to it, for each letter of my word and then reassign the variable e to the new value
            }
            else{
                e = e + " ";
            }

        }


        System.out.println(e);

    }












}
