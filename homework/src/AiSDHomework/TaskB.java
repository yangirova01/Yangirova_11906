package AiSDHomework;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
public class TaskB {
        public static void main(String[] args) throws IOException {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(input.readLine());
            Map<String, Integer> map = new HashMap<>();
            map.put("POLYCARP",1);
            for (int i=0;i<n;i++){
                String str =input.readLine();
                String [] str2=str.split(" reposted ");
                str2[0]=str2[0].toUpperCase();
                str2[1]=str2[1].toUpperCase();
                map.put(str2[0],map.get(str2[1])+1);
            }
            int max=Integer.MIN_VALUE;
            int v = 0;
            for(String k : map.keySet()){
                v = map.get(k);
                if(max<v){
                    max=v;
                }
            }
            System.out.println(max);
        }
    }