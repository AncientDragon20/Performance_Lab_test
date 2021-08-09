import java.util.*;
import java.io.*;
public class task2 {
    public static void main(String[]args){
        task2 t2=new task2();
        String center=null;
        String radius=null;
        String dot=null;
        try{
            File file1=new File(args[0]);
            BufferedReader reader1=new BufferedReader(new FileReader(file1));
            center=reader1.readLine();
            radius=reader1.readLine();
        }catch(Exception ex){ex.printStackTrace();}
        String[]xycenter=center.split(" ");
        try{
            File file2=new File(args[1]);
            BufferedReader reader2=new BufferedReader(new FileReader(file2));
            while((dot=reader2.readLine())!=null){
                String[]xydot=dot.split(" ");
                System.out.print(t2.check(Float.parseFloat(xydot[0]),Float.parseFloat(xydot[1]),Float.parseFloat(xycenter[0]),Float.parseFloat(xycenter[1]),Float.parseFloat(radius))+"\n");
            }
        }catch(Exception ex){ex.printStackTrace();}
    }
    public float times2(float i){
        return i*i;
    }
    public int check(float x,float y,float a,float b, float r){
        int result=0;
        if(times2(x-a)+times2(y-b) < times2(r)){
            result=1;
        }
        if(times2(x-a)+times2(y-b) > times2(r)){
            result=2;
        }
        return result;
    }
}