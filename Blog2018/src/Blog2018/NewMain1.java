
package Blog2018;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.TreeSet;

public class NewMain1 {
    
    
    public static void main(String[] args){
        Blog b=new Blog("Programista na uczelni");
        Note n=new Note("Pierwszy wpis","Pierwszy tekst");
        Note n2=new Note("kolekcje","Kolekcje java");
        Note n3=new Note("Generyki","Generyki w javie");
        Comment c=new Comment("Piotr","Nawet dobry ten wpis");
        Comment c1=new Comment("Nowy koment", "Piotr", LocalDateTime.of(2018, Month.MARCH, 20, 0, 0, 0));
        b.add(n);
        b.add(n2);
        b.add(n3);
        n.add(c);
        n.add(c1);
        Comment c2=new Comment("Kamil","Ale łatwe",LocalDateTime.of(2016, Month.AUGUST, 10, 0, 0));
        n.add(c2);
        Comment c3=new Comment("Szymon","Troche nie do konca o to co mi chodzilo",LocalDateTime.of(2017, Month.JULY, 01, 0, 0));
        n.add(c3);
        
        TreeSet set=new TreeSet();
        set.add(c);
        set.add(c1);
        set.add(c2);
        set.add(c3);
        System.out.println(set);
        
    }
}
