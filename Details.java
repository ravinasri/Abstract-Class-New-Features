abstract class Student
{
    public static final String book_name = "Love Is Life";//static and final field
    protected static int value = 500;//modifiers & field we used-public and protected only accepted bcoz default & private cant be used in another class
    abstract void readingBook();//abstract method used,abstract method cannot be static & final
    abstract int check(int a,int b,int c);//another abstract method
    public static String list(String list)//static method
    {
        System.out.println(list);
        return list;
    }
    
    protected int pagesCovered(int story1,int story2)//concrete method or non abstract method used
    {
        int story3 = story1+story2;
        
        System.out.println(story3);
        return story3;
    }
    Student()//constructor used
    {
     System.out.println("This is constructor..I used in abstract class..check whether its working or not?");   
    }
}

public class Details extends Student
{
    
    Details()
    {
        System.out.println("This is constructor..I used in normal class..check whether its working or not?");   
    }
    Details(String name)
    {
        System.out.println("Name:"+name);
    }
    void readingBook()
    {
        System.out.println("I read 2 stories...");
    }
    int check(int a,int b,int c)
    {
        return a*b*c;
    }
    
    public static void main(String args[])
    {
        Details d1 = new Details();
        Details d2 = new Details("Ravina");
        d2.pagesCovered(10,10);
        d2.readingBook();
        int result_cube = d2.check(5,5,5);
        System.out.println("cube value:"+result_cube);
        list("RV");
       
        if(value >= 500 && !book_name.equals(null))
    {
         System.out.println("Book rupees:"+value+"\n"+"Book Name:"+book_name);
    }
    }
}