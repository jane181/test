import java.util.Scanner;
public class main {
   public static void main(String[] args) {
        int flag=0;
        while (true) {
            Scanner input = new Scanner(System.in);
            String s =input.nextLine();
    String[] newStr = s.split("\\s+");
    for (int i = 0; i < newStr.length; i++) {

        if (newStr[i].equals("int")) {
            newStr[i] = "define";
        } else if (newStr[i].equals("main()")) {
            newStr[i] = "dso_local i32 @main()";
        } else if (newStr[i].equals("{")) {
            newStr[i] = "{";
        } else if (newStr[i].equals("return")) {
            newStr[i] = "ret";
           System.out.print("    ");
            flag = 1;
        } else if (newStr[i].equals(";")) {
            newStr[i] = " ";
            flag = 0;
        }
//        else {
//            for (int l = newStr[i].length(); --i >= 0; ) {
//                int chr = newStr[i].charAt(i);
//                newStr[i] = "";
//                if (chr==32){
//                    continue;
//                }
//                if (chr >= 48 && chr <= 57) {
//                    newStr[i] += chr;
//                } else if (chr == 59) {
//                    flag = 0;
//                    System.out.print("    ");
//                    break;
//                }
//
//            }
//        }

    }
            if (flag == 1) {
                System.exit(1);
            }
        for (int i = 0; i < newStr.length; i++) {
            System.out.print(newStr[i] + " ");
        }
        System.out.print("\n");
    }
}
}
