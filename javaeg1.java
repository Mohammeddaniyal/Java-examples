import com.google.gson.*;
class XYZException extends Exception
{
XYZException(String message)
{
super(message);
}
}
class Response
{
public Throwable exception;
}
class psp
{
public static void main(String g[])
{
try
{
Gson gson=new Gson();
XYZException xyzException=new XYZException("Some problem");
Response response=new Response();
response.exception=xyzException;
String jsonString=gson.toJson(response);
System.out.println(jsonString);
int r=1012;
System.out.println(gson.toJson(r));
}catch(Exception e)
{
System.out.println(e);
}
}
}