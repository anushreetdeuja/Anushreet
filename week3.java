/**
 * Write a description of class week3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week3
{
    int age;//instance variable
    static int qty;//static variable
    public static void main(String[] args) {
       int agr=10;//local variable
       System.out.println(agr);
       // <classname> <variable>=new <classname>();
       week3 w1=new week3();
       
       System.out.println(w1.age);
       System.out.println(qty);
    }
}