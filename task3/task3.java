
import java.util.*;
import java.io.*;
import com.google.gson.*;
public class task3 {
    public static void main(String[] args) {
        String tests = "";
        String values = "";
        String line1;
        String line2;
        try {
            File file1 = new File(args[1]);
            BufferedReader reader2 = new BufferedReader(new FileReader(file1));
            while ((line2 = reader2.readLine()) != null) {
                values = values + line2;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Gson gson = new Gson();
        idvalues idval=gson.fromJson(values, idvalues.class);
        try {
            File file1 = new File(args[0]);
            BufferedReader reader1 = new BufferedReader(new FileReader(file1));
            while ((line1 = reader1.readLine()) != null) {
                tests=tests+line1;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        idtests idtst=gson.fromJson(tests, idtests.class);
        for(idvalue idv:idval.values){
            for (testsid idt:idtst.tests){
                if (idv.id==idt.id){
                    idt.value=idv.value;
                }
            }
        }
        try(FileWriter writer = new FileWriter("report.json", false))
        {
            writer.write(gson.toJson(idtst));
            writer.flush();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
}