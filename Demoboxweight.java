class Box
{
double width,height,depth;
Box(Box ob)
{
width=ob.width;
height=ob.height;
depth=ob.depth;
}
Box(double w,double h,double d)
{
width=w;height=h;
depth=d;
}
Box()
{
width=-1;height=-1;depth=-1;
}
Box(double len)
{
width=height=depth=len;
}
double volume()
{
return width*height*depth;
}
class Boxweight extends Box
{
double weight;
Boxweight(double w,double h,double d,double m)
{
width w;
height=h;
depth=d;
weight=m;
}
}
class Demoboxweight
{
public static void main(String args[])
{
Boxweight mybox1=new Boxweight(10,20,15,34.3);
Boxweight mybox2=new Boxweight(2,3,4,0.076);
double vol;
vol=mybox1.volume();
System.out.println("vol of mybox1="+vol);
System.out.println("Wt of mybox1="+mybox1.weight);
vol=mybox2.volume();
System.out.println("vol of ybox2="+vol);
System.out.println("wt of mybox2="+mybox2.weight);
}
}
