package geradorDeSenhas;

import java.security.SecureRandom;

public class SystemPasswordGenerator {
    
    public StringBuilder generatePassword(int length){

        if(length < Constants.MINIMUM_CHARACTER){
            throw new IllegalArgumentException("O comprimento da senha deve ser pelo menos " + Constants.MINIMUM_CHARACTER);
        }

        String characteres = Constants.UPPERCASE_LETTERS + Constants.LOWERCASE_LETTERS +
        Constants.DIGITS + Constants.SPECIAL_CHARACTERS;

        SecureRandom secureRandom = new SecureRandom();

        char[] test = characteres.toCharArray();

        StringBuilder password = new StringBuilder();

        for(int i = 0; i < length; i++){
            password.append(test[secureRandom.nextInt(characteres.length())]);
        }
        return password;
    }
}
