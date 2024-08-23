class area{
    int length;
    int breadth;
        int display(){
            return length*breadth;
        }
        area(int a)
        {
            length=a;
            breadth=20;
            
        }
    }
public class classConstructors {
   
    
        public static void main(String[] args)
        {
            int res;
            area a=new area(30);
            res=a.display();
            System.out.println(res);
        }
    
}
