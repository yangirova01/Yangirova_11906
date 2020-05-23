package InfaWithVitalya;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class Framework {
    public List<Object> list (Class clazz) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        StoreInFile annotation = (StoreInFile)clazz.getAnnotation(StoreInFile.class);
        List<Object> list1= new LinkedList<>();
        if (annotation !=null){
            BufferedReader in = new BufferedReader(new FileReader(annotation.name()));
            TreeMap<String,String> map = new TreeMap<>();
            String line = in.readLine();
            while (line!=null){
                line = line.trim();
                line = line.substring(1,line.length()-1);
                StringTokenizer st = new StringTokenizer(line,",");
                while (st.hasMoreTokens()) {
                    String abc = st.nextToken().trim();
                    int index = abc.indexOf(':');
                    map.put(abc.substring(0, index), abc.substring(index+1));
                }
                Field[] fields = clazz.getDeclaredFields();
                Object obj = clazz.getDeclaredConstructor().newInstance();
                for (Field field:fields){
                    String fiel = field.getName();
                    String s = map.get(fiel);
                    if (s != null) {
                        field.setAccessible(true);
                        if(field.getType()==int.class){
                            field.set(obj,Integer.parseInt(s));
                        }else{
                            field.set(obj,s);
                        }
                        field.setAccessible(false);
                    }
                }
                list1.add(obj);
                line = in.readLine();
            }
        }
        return list1;
    }
}