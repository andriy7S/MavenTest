package packt.java11.andriy;

import packt.java11.andriy.stringsort.Sort;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        String[] actualNames = new String[]{
                "Johnson", "Wilson",
                "Wilkinson", "Abraham", "Dagobert"};
        Sort.sort(actualNames);
        for (final String name : actualNames) {
            System.out.println(name);
        }
    }
}
