package InfaWithVitalya;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
      BufferedReader in = new BufferedReader(new FileReader
                ("/Users/admin/Desktop/Yangirova_11906/homework/out/production/untitled/src/InfaWithVitalya/teacher"));
        Framework framework = new Framework();
        List<Object> listTeacher = framework.list(Teacher.class);
        for(Object object : listTeacher){
            System.out.println(object.toString());
        }
        List<Teacher> list3 = framework.list(Teacher.class).stream().map((obj)-> (Teacher)obj).collect(Collectors.toList());
        List<Specialization> spec = framework.list(Specialization.class).stream().map((obj) ->(Specialization) obj).collect(Collectors.toList());
        List<Timetable> timetables = framework.list(Timetable.class).stream().map((obj) ->(Timetable)obj).collect(Collectors.toList());
        HashMap<Integer,Integer> map = new HashMap<>();
        timetables.stream().forEach((obj)->{
            Integer h = map.get(obj.teacherId);
            if( h== null){
                map.put(obj.teacherId,1);
            }else {
                h++;
                map.put(obj.teacherId, h);
            }
        });
        map.keySet().stream().max((teacher,teacher2)->map.get(teacher) - map.get(teacher2)).get();

    }
}