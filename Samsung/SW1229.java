// 1229. 암호문2
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

class SW1229 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer stz;
    static int len, cnt;
    static List<String> ori;
    static String com;    //original, command

    public static void main(String[] args) throws NumberFormatException, IOException {
        System.setIn(new FileInputStream("./SW1229_input.txt"));
        
        Scanner sc = new Scanner(System.in);

        for(int test_case=1; test_case<=10; test_case++) {
            ori = new LinkedList<>();

            len = sc.nextInt();
            for(int i=0; i<len; i++) {
                ori.add(sc.next());
            }

            cnt = sc.nextInt();
            for(int i=0; i<cnt; i++) {
                String op = sc.next();
                int x = sc.nextInt();
                int y = sc.nextInt();
                if(op.equals("I")) {
                    for(int j=0; j<y; j++) {
                        ori.add(x+j, sc.next());
                    }
                } else {
                    for(int j=0; j<y; j++) {
                        ori.remove(x);
                    }
                }
            }

            System.out.print("#"+test_case);
            for(int i=0; i<10; i++) {
                System.out.print(" " + ori.get(i));
            }
            System.out.println();

        }
        
    }    
}

