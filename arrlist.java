class TMArrayList<T>
{
private Object [] collection;
private int size;
TMArrayList()
{
this.collection=new Object[10];
this.size=0;
}
private void reSize()
{
Object [] tmp;
tmp=new Object[this.collection.length+10];
for(int i=0;i<this.collection.length;i++) tmp[i]=this.collection[i];
this.collection=tmp;
tmp=null;
}
public void add(T data)
{
if(this.size==this.collection.length)
{
reSize();
}
this.collection[this.size++]=data;
}
public int getSize()
{
return this.size;
}
public T get(int i)
{
if(i<0 || i>=this.size) return null;
return (T)this.collection[i];
}
}
class psp
{
public static void main(String gg[])
{
TMArrayList<Integer> list;
list=new TMArrayList<Integer>();
for(int i=1;i<=2000;i++)
{

list.add(i*101);
}
for(int i=0;i<list.getSize();i++) System.out.print(list.get(i)+"  ");
}
}