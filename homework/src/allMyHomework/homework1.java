package allMyHomework;
public class homework1{
    public static void main(String[] args) {
        int x = 5461977;
        int f = x / 100; //54619
        f = f % 10; //9
        int s = x / 10000; //546
        s = s % 10; //6
        int с = f * 100; //900
        x = x - с; //5461077
        с = f * 10000; //90000
        x = x + с; //5551077
        с = s * 10000; //60000
        x = x - с; //5491077
        с = s * 100; //600
        x = x + с ;//5491677
        System.out.println(x);
    }
}
//переворачивает цифры в числе