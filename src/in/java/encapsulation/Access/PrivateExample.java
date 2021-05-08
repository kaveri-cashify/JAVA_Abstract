package in.java.encapsulation.Access;

public class PrivateExample {
        private double num = 100;

    public double getNum() {

        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }
}

     class Example{
        public static void main(String args[]){
            PrivateExample obj = new PrivateExample();
            System.out.println(obj.getNum());
        }

}
