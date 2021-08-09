public class task1 {
    public static void main(String[]args){
        int n=Integer.parseInt(args[0]);
        int m=Integer.parseInt(args[1]);
        int counter=0;
        int l=1;
        String s="";
        do{
            s=s+l;
            for (int i=1;i<m;i++){
                l++;
                if(l==n+1){
                    l=1;
                }
            }
        }
        while(l!=1);
        System.out.println(s);
    }
}