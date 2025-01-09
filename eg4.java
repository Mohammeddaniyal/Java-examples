class psp
{
public static void main(String gg[])
{
String s="";
long val=1000000;
int code=1;
for(;code<=98999999;code++)
{
val++;
s="A"+String.valueOf(val);
}
System.out.println(s);
val+=112;
s="A"+String.valueOf(val);
System.out.println(s);
}
}