import com.thinking.machines.util.*;
class psp
{
public static void main(String gg[])
{
TMArrayList list;
list=new TMArrayList();
for(int i=1;i<=100;i++) list.add(i*41);
int size=list.size();
System.out.println(size);
for(int i=0;i<size;i++) System.out.print(list.get(i)+"  ");
System.out.println("Clearing elements");
list.clearAll();
list.add(1012312);
list.add(13298);
list.add(340);
list.add(340834);
list.add(234241);
list.add(24351);
list.add(98787);
list.add(24131);
list.add(56534);
list.add(78465);
list.add(873423);
list.add(342313);
System.out.println("Size : "+list.size());
for(int i=0;i<list.size();i++) System.out.println(list.get(i));
System.out.println("Updating");
list.update(97893,2);
System.out.println("Inserting : 111111111 at 8");
list.insert(111111111,8);
System.out.println("Adding(inserting) : 1212222111 at 5");
list.add(1212222111,5);
for(int i=0;i<list.size();i++) System.out.println(list.get(i));
System.out.println("Removing at 5");
System.out.println("Removed : "+list.removeAt(5));
for(int i=0;i<list.size();i++) System.out.println(list.get(i));
System.out.println("Size : "+list.size());
}
}