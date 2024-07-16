
/**
 * Write a description of class ModuleCodes here.
 *
 * @author (Sedzani Ndouvhada 34568018)
 * @version (07 March 2022)
 */
public class ModuleCodes
{
    
    
    public class ModuleCodes()
    {
        public static void main(String[] RGS)
        {
            System.out.print(Enter a module code);
            string code=src.next();
            while(!isValid(code))
            {
                System.out.printIn("The module code is invalid.Please try again.");
                System.out.print("Enter a module code:");
               
            }
            System.out.printIn"The code is valid");
            System.out.printIn("The student's major is" +determineMajor(code.charAt(0)));
            System.out.printIn("The student is in the" 
            +determineYearLevel(interger.parseInt(code.substring(4,5))));
        }
        
        public static String determineMajor(char c)
        {
            switch(c)
            {
                case 'M':
                    return "Mathematics";
                case 'I':
                    return "Information Technology";
                case "C':
                    return "Computer Science";
            }
            return "";
         }
        
         public static String determineYearLevel(int i)
         {
             switch(i){
                case 1:
                    return "first year of study";
                case 2:
                    return "second year of study";
                case 3:
                    return "third year of study";
                }
                return"";
            }
            
            public static boolean isValid(String )
            {
                return Pattern.matches();
            }
    }

    
