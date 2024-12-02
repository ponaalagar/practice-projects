public class Mainc3 {
    public static void main(String[] args) {
		// StringBuffer( ) --> Reserves room for 16 characters
        // StringBuffer(int size)
        // StringBuffer(String str)  --> str + room for 16 characters
        // StringBuffer(CharSequence chars) --> chars + room for 16 characters
        
        StringBuffer sb1= new StringBuffer("Hello");
        System.out.println("Length of sb1: "+sb1.length());     // 1.length()
        System.out.println("Capacity of sb1: "+sb1.capacity());     // 2.capacity()
        sb1.ensureCapacity(50);                 // 3.ensureCapacity()
        System.out.println("Capacity of sb1 after ensure: "+sb1.capacity()); 
        System.out.println("Character at 1: "+sb1.charAt(1));   // 4.charAt()
        sb1.setCharAt(1,'i');       // 5.setCharAt()
        System.out.println("sb1 after setCharAt: "+sb1);
        sb1.append("Java");     // 6.append() --> can append any datatype to stringbuffer
        sb1.append(1000);
        System.out.println("sb1 after append: "+sb1);
        sb1.insert(5,"World");
        System.out.println("sb1 after insert: "+sb1);  // 7.insert()
        sb1.reverse();
        System.out.println("sb1 after reverse: "+sb1);  // 8.reverse()
        sb1.delete(0,4);
        System.out.println("sb1 after delete: "+sb1);  // 9.delete()
        sb1.replace(0,4,"Python");
        System.out.println("sb1 after replace: "+sb1);  // 10.replace()
        System.out.println("Substring at 0 to 5:"+ sb1.substring(0,5)); // 11.substring()
	}
}
