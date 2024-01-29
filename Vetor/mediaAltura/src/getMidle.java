public class getMidle {
    
    public static String getMiddle(String word) {

        int meio = word.length() / 2; 

       if ( word.length() % 2 > 0 ){ //impar
            return word.substring(meio, meio + 1);
       }else{ //par
            return word.substring(meio - 1, meio + 1);
        }
      }
}
