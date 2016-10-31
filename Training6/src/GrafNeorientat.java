import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.*;
import java.util.Scanner;

/**
 * Created by admarcu on 10/31/2016.
 */
public class GrafNeorientat {

    AdrianLinkedList<Integer> a[];
    private int noduri;
    private int muchii;

    public GrafNeorientat() throws IOException {

        Scanner scanner = new Scanner(new File("file.in"));
        this.noduri = scanner.nextInt();
        this.muchii = scanner.nextInt();
        System.out.println("Noduri: " + this.noduri + " Muchii: " + this.muchii);
        a = new AdrianLinkedList[this.noduri];
        for (int i = 0; i < this.muchii; i++) {
            Integer x = scanner.nextInt();

            Integer y = scanner.nextInt();

            if (a[x-1] == null) {
                a[x-1] = new AdrianLinkedList<>();
            }
            a[x-1].add(y);
            if (a[y-1] == null) {
                a[y-1] = new AdrianLinkedList<>();
            }
            a[y-1].add(x);
        }
    }

    public void print() {
        int i=1;
        for(AdrianLinkedList ad : a){
            System.out.print(i + ": ");
            i++;
            System.out.println(ad.toString());
        }
    }

}
