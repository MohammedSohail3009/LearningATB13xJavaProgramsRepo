package ex_004_Strings;
public class Lab_0045_String_Function {
    public static void main(String[] args){
        String name = "Sufi";

        // 1. Length of string
        System.out.println(name.length());      // Output: 4

        // 2. Concatenation
        System.out.println(name.concat("Maldar")); // Output: SufiMaldar
        //tolowercase
        System.out.println(name.toLowerCase());
        //touppercase
        System.out.println(name.toUpperCase());
        //Startwithindex
        System.out.println(name.startsWith("S"));
        //Endwithindex
        System.out.println(name.endsWith("i"));

        // 3. Replace character
        System.out.println(name.replace('f', 'F')); // Output: SuFi

        // 4. Character at index
        System.out.println(name.charAt(2));     // Indexing starts from 0 → Output: 'f'

        // 5. Split string
        String name2 = "Sohailsufi@maldar@3009";
        String[] split_name2 = name2.split("@");

        System.out.println(split_name2[0]);     // Output: Sohailsufi
        System.out.println(split_name2[1]);     // Output: maldar
        System.out.println(split_name2[2]);

        String anotherpalindrome = "Niagara. o roar again!";
        System.out.println(anotherpalindrome.length());
         String extract = anotherpalindrome.substring(11,15);
        System.out.println(extract);
        // If you try to access split_name2[2], you’d get "3009"
    }
}
