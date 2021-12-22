import java.util.*;
class MorningTest{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int con=0;
        int vow=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O'|| s.charAt(i)=='U'){
                vow+=(s.substring(i).length());
            }
            else{
                con+=(s.substring(i).length());
            }
        }
        if(con>vow){
            System.out.println("Abhi "+con);
        }
        else{
            System.out.println("Ramu "+vow);
        }
    }
}

 
