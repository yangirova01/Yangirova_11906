package allMyClasswork;
public class goat extends Animal implements Woolable,Milkable {
    @Override
    public void meat() {
        this.weight = weight * 0.7;
    }
    @Override
    public void eat() {
        this.weight = weight * 0.6;
    }
    @Override
    public void wool(){
        this.weight=weight*0.1;
    }
    @Override
    public void getMilk(){
        this.weight=weight*0.7;
    }
}

