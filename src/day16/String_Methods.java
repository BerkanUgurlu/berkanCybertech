package day16;

public class String_Methods {
    public static void main(String[] args) {

        String email = "cybertek@gmail.com";
        email = email.replace("gmail","yahoo"); // "cybertek@gmail.com"
        System.out.println(email);

        String word = "java";
        word = word.replace("a","e");
        System.out.println(word);

        String sentence = "I like to learn java, java is cool, java is fun";
        sentence = sentence.replace("a, java","a, C#");
        sentence = sentence.replace("java ", "Pyhton ");

        System.out.println(sentence);

        String s1 = "I like to stay in Cybertek, Cybertek is a nice place";
        s1 = s1.replace("Cybertek","MIT");
        System.out.println(s1);
        s1 = s1.replace("MIT","Cybertek");
        System.out.println(s1);

        String s2 = "I like to leaRn Java";
       s2 = s2.replace('R','r');
        System.out.println(s2);

        // replaceFirst:

        String s3 = "I like to drink tea and tea";
        s3 = s3.replaceFirst("tea ","cola ");
        System.out.println(s3);

        String s4 = "I like to Watch Game of Thrones, and Walking dead";
        s4 = s4.replace(", and Walking dead","");
        System.out.println(s4);

        // indexOf():
        String s5 = "I like to stay in cybertek, we are learning java";
       int r1 = s5.indexOf("r");
       int r2 = s5.indexOf("re");
       int r3 = s5.indexOf("rn");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
       // System.out.println(s5.charAt(r1));

        // lastIndexOf()
        String s6 = "Java is a programming language, and Java is fun";
        int a1 = s6.indexOf("J");
        int a2 = s6.lastIndexOf("J");
        System.out.println(a1);
        System.out.println(a2);

        String s7 = "Java";
        int b1 = s7.indexOf("A");
        System.out.println(b1);

        String s8 = "Java";
        int b = s8.indexOf("a");
        char ch = s8.charAt(1);
        System.out.println(b);
        System.out.println(ch);



    }

}
