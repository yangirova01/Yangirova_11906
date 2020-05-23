package allMyClasswork;
public class horse extends Animal implements Moveble{
    public void meat(){
        this.weight=weight*0.5;
    }
    public void eat(){
        this.weight=weight*0.9;
    }
    public void move(int weight){
        this.weight=weight*0.7;
    }
}
