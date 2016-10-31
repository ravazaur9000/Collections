import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        /*EXERCISE 1*/
        System.out.println("EXERCISE 1\n");
        AdrianLinkedList<Integer> l= new AdrianLinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        System.out.println(l.toString());
        System.out.println(l.get(2));
        System.out.println(l.get(3));
        l.remove();
        l.remove();
        System.out.println(l.toString());
        l.addFirst(5);
        System.out.println(l.toString());

        /*EXERCISE 2*/
        System.out.println("EXERCISE 2\n");
        GrafNeorientat g=new GrafNeorientat();
        g.print();

        /*EXERCISE 3*/
        System.out.println("EXERCISE 3\n");
        XORcript();

    }

    public static void XORcript(){

        Scanner s = null;
        StringBuffer strz= new StringBuffer();
        try {
            s = new Scanner(new BufferedReader(new FileReader("date.in")));
            s.useDelimiter(",|\\r\\n");
            while (s.hasNext())
            {
                strz.append(s.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (s != null) {
                s.close();
            }
        }
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter KEY:");
        String key = keyboard.nextLine();
        StringBuffer keyz=new StringBuffer(key);
        System.out.println("KEY is: " + keyz + " Length is :" + keyz.length());
        ArrayList results= new ArrayList<Integer>();
        for(int i=0;i<strz.length();i++){
            char xoredChar = (char) (strz.charAt(i) ^ keyz.charAt(i%keyz.length()));
            results.add((int) xoredChar);
        }
        System.out.println(results.toString());



    }
}
