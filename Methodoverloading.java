class Methodoverloading
{
 void sum ( int a, int b)
 {
  System.out.println("sum is "+(a+b));
 }
 void sum ( float a, float b)
 {
  System.out.println("sum is "+(a+b));
 }
 public static void main (String a[])
 {
 Methodoverloading cal= new Methodoverloading();
 cal.sum(5,6);
 cal.sum(3.5f,8.3f);
 }
}