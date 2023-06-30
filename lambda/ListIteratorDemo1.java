import java.util.*;
class ListIteratorDemo2
{
    public static void main(String[]args)
    {
        LinkedList l=new LinkedList();
        l.add("BalaKrishna");
        l.add("Venki");
        l.add("Chiru");
        l.add("Nag");
        System.out.println(l);
        ListIterator ltr=l.listIterator();
        while(ltr.hasNext())
        {
            String s=(String)ltr.next();
            if(s.equals("Venki"))
            {
                ltr.remove();
            }
            else if(s.equals("Nag"))
        {
        ltr.add("Chithu");
        }
        else if(s.equals("Chiru"))
        {
            ltr.set("Charan");
        }
    }
    System.out.println(l);
}}