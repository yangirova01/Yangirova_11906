public class Homeworksep2 {
    public class SecondTask {
        public void main(String[] args) {
            int b = 10;
            int a = 100;
            int c = 613;
            int d = 4;
            int e = 7;

            int max = b;
            if (a > max){
                max = b;
            }
            if (c > max){
                max = c;
            }
            if (d > max){
                max = d;
            }
            if (e > max){
                max = e;
            }

            int min = b;
            if (a < min){
                min = a;
            }
            if (c < min){
                min = c;
            }
            if (d < min){
                min = d;
            }
            if (e < min){
                min = e;
            }

            System.out.println("Максимум : " + max);
            System.out.println("Минимум : " + min);
        }
    }
}
