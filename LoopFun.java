 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          
          int factorialResult = 1;
          for(int i = number; i > 0;i--)
            factorialResult *= i;
          return factorialResult;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String[] words = phrase.split(" ");
          String acronyms = "";
          for(int i = 0 ; i< words.length;i++){
              acronyms += Character.toUpperCase(words[i].charAt(0));
            }
          return acronyms;
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
     
      public String encrypt(String word) {
          String encrypted = "";
          char c;
          
          for(int i =0 ; i < word.length();i++){
              c = word.charAt(i);
              c = swift3(c);
              encrypted += c;
            }
          return encrypted;
      }
      
      /** 
         * Helper function to help swift the character to its next third character
         * The characters are assumed to be in lower cases.
         * @param c => as the character to be shifted
         * @return the shifted character 
         */
       private Character swift3(char c){
          c += 3;
          if(c > 'z'){
              int extra = c - 'z' -1;
              c = 'a';
              c += extra;
            }
          return c;
        }
}
