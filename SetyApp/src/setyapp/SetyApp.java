package setyapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.Comparator;
import java.util.TreeSet;

public class SetyApp 
{

    public static void main(String[] args) throws IOException
    {
        TreeSet<String> ts;
        try (BufferedReader br = new BufferedReader(new FileReader("namespl.txt"))) {
            ts = new TreeSet<>(new Comparator<String>() 
            {
                @Override
                public int compare(String t, String t1) throws UnsupportedOperationException {
                    return -t.compareTo(t1);
                }
            });
            String word;
            while((word = br.readLine()) != null)
            {
                ts.add(word);
            }
        }
        System.out.println("Ilośc imion: " + ts.size());
        System.out.println("Pierwsze imię: " + ts.first());
        System.out.println("Ostatnie imię: " + ts.last());
        
        }
    }
    

