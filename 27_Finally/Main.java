public class Main{
    public static void main(String[] args){
        int[] a = new int[5];
        
        try {
            System.out.println("Akses elemen ke 5 : "+a[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out of bounds");
        }
        finally {
            a[4] = 10;
            System.out.println("Last element : "+a[4]);
        }
    }
}