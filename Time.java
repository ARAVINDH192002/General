import java.util.*;
class R {
    static boolean isPal(String s) {
        StringBuilder ss = new StringBuilder(s);
        if (ss.reverse().toString().equals(s)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s =sc.nextLine();
        String[] ss = s.split(":");
        int hh = Integer.parseInt(ss[0]);
        int mm = Integer.parseInt(ss[1]);
        if(isPal(ss[0]+ss[1])){
            System.out.println("the given number is pall number");
            return;
        }
        for (int i = 1; true; i++) {
            mm++;
            String hrs = hh + "";
            if (hrs.length() == 1) {
                hrs = "0" + hrs;
            }
            String min = mm + "";
            if (min.length() == 1) {
                min = "0" + min;
            }
            if (isPal(hrs + min)) {
                System.out.println((i));
                break;
            }
            if (hh == 23 && mm == 60) {
                hh = 0;
                mm = 0;
            }
            if (mm == 60) {
                hh++;
                mm = 0;
            }
        }
    }
}

 
