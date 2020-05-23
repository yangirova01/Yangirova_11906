package allMyClasswork;
public class FarmHome {
    Milkable[]s1;
    Meatable[]s2;
    Woolable[]s3;
    Moveble[]s4;
    Animal[]s;
    void feedAll(){
        for(int i=0;i<s.length;i++){
            s[i].eat();
        }
    }
    void killAll(){
        for(int i=0;i<s2.length; i++){
            s2[i].meat();
        }
    }
    void collectMilk(){
        for(int i=0; i<s1.length;i++){
            s1[i].getMilk();
        }
    }
    void collectWool(){
        for( int i=0; i<s3.length;i++){
            s3[i].wool();
        }
    }
    void Move(int i, int weight){
        s4[i].move(weight);
    }
}
