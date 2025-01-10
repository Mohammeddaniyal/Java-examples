import java.io.*;












class MemberManager
{
public static void main(String gg[])
{
if(gg.length==0)
{
System.out.println("You need to give some arguments.");
return;
}
String operation=gg[0];
String operations[]={"add","update","remove","getAll","getByCourse","getByContactNumber"};
if(!isOperationValid(operation))
{
System.out.println("Invalid Operation");
printOperation();
return;
}
if(operation.equalsIgnoreCase(operations[0]))
{
add(gg);
}
if(operation.equalsIgnoreCase("getAll"))
{
getAll(gg);
}

}
//operation functions
private static void add(String string[])
{
if(string.length!=5) 
{
System.out.println("Error");
return;
}
String mobNo;
String mobileNumber=string[1];
String name=string[2];
String course=string[3];
if(!isCourseValid(course))
{
System.out.println("Invalid Course.");
printCourse();
return;
}
int fee=0;
try
{
fee=Integer.parseInt(string[4]);
}catch(NumberFormatException nfe)
{
System.out.println("Fee Invalid");
}
try
{
File f=new File("member.data");
RandomAccessFile randomAccessFile=new RandomAccessFile(f,"rw");
while(randomAccessFile.getFilePointer()<randomAccessFile.length())
{
mobNo=randomAccessFile.readLine();
if(mobileNumber.equalsIgnoreCase(mobNo))
{
System.out.println("Already Exist.");
return;
}
randomAccessFile.readLine();
randomAccessFile.readLine();
randomAccessFile.readLine();
}
randomAccessFile.writeBytes(mobileNumber);
randomAccessFile.writeBytes("\n");
randomAccessFile.writeBytes(name);
randomAccessFile.writeBytes("\n");
randomAccessFile.writeBytes(course);
randomAccessFile.writeBytes("\n");
randomAccessFile.writeBytes(String.valueOf(fee));
randomAccessFile.writeBytes("\n");
randomAccessFile.close();
System.out.println("Member Added");
}catch(IOException ioe)
{
System.out.println(ioe.getMessage());
}
}
private static void getAll(String data[])
{
String mobileNumber;
String name;
String course;
int fee=0;
try
{
File f=new File("member.data");
if(f.exists()==false)
{
System.out.println("No members");
return;
}
RandomAccessFile randomAccessFile=new RandomAccessFile(f,"rw");
if(randomAccessFile.length()==0)
{
System.out.println("No members");
randomAccessFile.close();
return;
}
int i=0;
while(randomAccessFile.getFilePointer()<randomAccessFile.length())
{
mobileNumber=randomAccessFile.readLine();
name=randomAccessFile.readLine();
course=randomAccessFile.readLine();
fee=Integer.parseInt(randomAccessFile.readLine());
System.out.printf("%s,%s,%s,%d\n",mobileNumber,name,course,fee);
}
randomAccessFile.close();
}catch(IOException ioe)
{
System.out.println(ioe.getMessage());
}
}
//print function
private static void printOperation()
{
System.out.println("[add,update,remove,getAll,getByCourse,getByContactNumber]");
}
private static void printCourse()
{
System.out.println("[c,c++,java,python,j2ee]");
}
//helper function
private static boolean isOperationValid(String operation)
{
operation=operation.trim();
String operations[]={"add","update","remove","getAll","getByCourse","getByContactNumber"};
for(int i=0;i<operations.length;i++)
{
if(operation.equalsIgnoreCase(operations[i])==true)
{
return true;
}
}
return false;
}
private static boolean isCourseValid(String course)
{
course=course.trim();
String courses[]={"c","c++","java","python","j2ee"};
for(int i=0;i<courses.length;i++)
{
if(course.equalsIgnoreCase(courses[i])==true)
{
return true;
}
}
return false;
}

}
