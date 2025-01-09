import com.thinking.machines.util.*;
class psp
{
public static void main(String gg[])
{
Keyboard k=new Keyboard();
String name;
int i;
char c;
double d;
float f;
boolean b;
short s;
long l;
byte by;
System.out.print("Enter name : ");
name=k.getString();
System.out.println("Name : "+name);
System.out.print("Enter integer : ");
i=k.getInt();
System.out.println("Int : "+i);
name=k.getString("Enter another name : ");
System.out.println("Name : "+name);

i=k.getInt("Enter another Integer : ");
System.out.println("Int : "+i);

System.out.print("Enter Character : ");
c=k.getChar();
System.out.println("Character : "+c);

c=k.getChar("Enter Character : ");
System.out.println("Character : "+c);


System.out.print("Enter long : ");
l=k.getLong();
System.out.println("Long : "+l);

l=k.getLong("Enter long : ");
System.out.println("Long : "+l);

System.out.print("Enter Float : ");
f=k.getFloat();
System.out.println("Float : "+f);

f=k.getFloat("Enter Float : ");
System.out.println("Float : "+f);

System.out.print("Enter Double : ");
d=k.getDouble();
System.out.println("Double : "+d);

d=k.getDouble("Enter Double : ");
System.out.println("Double : "+d);



System.out.print("Enter Short : ");
s=k.getShort();
System.out.println("Short: "+s);

s=k.getShort("Enter Short : ");
System.out.println("Short : "+s);

System.out.print("Enter Byte : ");
by=k.getByte();
System.out.println("Byte : "+by);

by=k.getByte("Enter Byte : ");
System.out.println("Byte : "+by);

System.out.print("Enter Boolean : ");
b=k.getBoolean();
System.out.println("Boolean : "+b);

b=k.getBoolean("Enter Boolean : ");
System.out.println("Boolean : "+b);

}
}



