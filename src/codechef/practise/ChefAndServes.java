package codechef.practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChefAndServes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String[] nms;
        while (t-->0) {
            nms = br.readLine().split(" ");
            int p1 = Integer.parseInt(nms[0])+Integer.parseInt(nms[1]);
            int k = Integer.parseInt(nms[2]);
//            String sum = (p1+p2)%(2*k)>k?"COOK":"CHEF";

//            System.out.println(sum);
            while (p1>(2*k)) {
                p1 = p1/k;
            }
        }
    }
}
