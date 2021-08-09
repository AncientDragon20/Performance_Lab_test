import java.util.*;
import java.io.*;
import java.math.*;
public class task4{
    public static void main(String[]args){
        task4 t4=new task4();
        ArrayList<Integer>nums=new ArrayList<Integer>();
        ArrayList<Double>difs=new ArrayList<Double>();
        String line=null;
        int sum=0;
        try{
            File file=new File(args[0]);
            BufferedReader reader=new BufferedReader(new FileReader(file));
            while((line=reader.readLine())!=null){
                int n=Integer.parseInt(line);
                sum=sum+n;
                nums.add(n);
            }
        }catch(Exception ex){ex.printStackTrace();}
        double average=sum/nums.size();
        for(int i=0;i<nums.size();i++){
            difs.add(t4.above0(average-nums.get(i)));
        }
        double min=difs.get(0);
        int minindex=0;
        for(int i=1;i<difs.size();i++){
            if(difs.get(i)<min){
                min=difs.get(i);
                minindex=i;
            }
        }
        int result=0;
        for(int i=0;i<nums.size();i++){
            result=result+(int)t4.above0((double)(nums.get(minindex)-nums.get(i)));
        }
        System.out.println(result);
    }
    public double above0(double jo){
        double g=Math.sqrt((jo*jo));
        return g;
    }
}