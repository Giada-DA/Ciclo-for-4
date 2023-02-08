public class CustomNumber {
    CustomNumber a;
    public int number;
    public CustomNumber(){
        this.number = (int) (Math.random()*11+1);
        System.out.println(number);
    }

    public void getMultiplicationTable(){
        for(int i = 12; i >0; i--){
            System.out.println(i);
        }

    }
}
