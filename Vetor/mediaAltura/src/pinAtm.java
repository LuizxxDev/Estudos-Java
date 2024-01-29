public class pinAtm {
    
    public static void main(String[] args) {
        System.out.println(validatePin("a234"));
    }

    public static boolean validatePin(String pin) {
        if(pin.length() == 4 || pin.length() == 6){
            if (pin.matches("\\d+")) {
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
      }
}
