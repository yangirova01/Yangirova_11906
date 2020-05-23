package allMyClasswork;
public class cow extends Animal implements Milkable,Moveble {

    @Override
    public void getMilk() {
    this.weight=weight*0.4;
    }
    @Override
    public void move(int weight){
        this.weight=weight*0.5;
    }
    @Override
    public void meat(){
        this.weight=weight*0.3;
    }
    @Override
    public void eat(){
        this.weight=weight*0.2;
    }
}
