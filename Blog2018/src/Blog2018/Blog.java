
package Blog2018;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Blog {
    private List<Note> notes=new ArrayList();
    private String title;

    public Blog(String title) {
        this.title = title;
    }
    
    
    public void add(Note note){
        notes.add(note);
    }

    @Override
    public String toString() {
        return title+"\n\n"+notes;
      
    }
    public Note mostPopular(){
        if(notes.isEmpty()) return null;
        Note result=notes.get(0);
        for(Note e:notes){
            int count=e.numberOfComments();
            if(count>result.numberOfComments()){
                result =e;
            }
        }
        return result;
    }
    
    public List<Note> mostPopulars(){
        return null;
    }
    
    public Comment lastComment(){
 
        List<Comment> allComments=new ArrayList();
        
        for(Note note:notes){
            for(Comment comment:note.getComments()){
                allComments.addAll(note.getComments());
            }
        }
        Comment result=allComments.get(0);
        for(Comment comment: allComments){
            LocalDateTime d1=comment.getDate();
            LocalDateTime d2=comment.getDate();
            if(d1.isAfter(d2)){
                result=comment;
            }
        }
        
        /*
        LocalDate now=LocalDate.now();
        long min=Long.MAX_VALUE;
        Comment result=null;
        for(Note e:notes){
            for(Comment comment: e.getComments()){
                LocalDate date=comment.getDate();
                 long x= now.until(date,ChronoUnit.MINUTES);
                 if(x<min){
                     min=x;
                     result=comment;
                }
            }
        }
        */
     return result;   
    }
    
      public Collection<Comment> lastComments(){
         TreeSet<Comment> ts=new TreeSet(Collections.reverseOrder());
         for(Note note:notes){
             ts.addAll(note.getComments());
         }
         Iterator<Comment> it=ts.iterator();
         for(int i=0;i<5;i++){
          if(it.hasNext()){
              Comment c=it.next();
              ts.add(c);
          }
      }
        return null;
    }
    
}
