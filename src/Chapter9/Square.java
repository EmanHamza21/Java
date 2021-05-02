package Chapter9;

public class Square extends Rectangle {
    @Override
    public double calculatePramete(){
        return sides * lenght;
    }
    public void print (String what){
        System.out.println("Iam a " + what);
    }
}
