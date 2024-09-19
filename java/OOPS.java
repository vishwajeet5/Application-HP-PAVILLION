public class OOPS {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setColor("Red");
        // p1.color = Red;
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

        BankAccount acc1 = new BankAccount();
        acc1.username = "Vishwajeet Kumar";
        acc1.setPassword("Vishwajeet#1");
        System.out.println(acc1.username);
        // System.out.println(acc1.password); // can't be access
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

}

class BankAccount{
    public String username;
    @SuppressWarnings("unused")
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}
