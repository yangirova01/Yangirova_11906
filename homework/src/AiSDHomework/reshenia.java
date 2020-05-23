package AiSDHomework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class reshenia {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        Map<String, Integer> map = new HashMap<>();
        map.put("POLYCARP", 1);
        for (int i = 0; i < n; i++) {
            String str = in.readLine();
            String[] masstr = str.split("reposted");
            masstr[0] = masstr[0].toUpperCase();
            masstr[1] = masstr[1].toUpperCase();
            map.put(masstr[0], map.get(masstr[1])+1);
        }
        int max = Integer.MIN_VALUE;
        int k ;
        for (String z : map.keySet()) {
            k  = map.get(z);
            if (max < k ) {
                max = k ;
            }
        }
        System.out.println(max);
    }
}