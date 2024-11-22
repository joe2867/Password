public class PasswordGenerator{
    private String s;
    private int n;
    private static int c = 0;
    public PasswordGenerator(String st, int i){
        s = st;
        n = i;
    }

    public PasswordGenerator(int i){
        n = i;
        s += "A";
    }


    public int pwCount(){
        return c;
    }

    public String pwGen(){
        s += ".";
        for(int i = 0; i < n; i++){
            int g = (int) ((Math.random() * 11));
            s += g;
        }
        c++;
        return s;
    }

    


    public static void main(String[] args){
        PasswordGenerator pw1 = new PasswordGenerator("hi", 5);
        System.out.println(pw1.pwGen());
        int answer = pw1.pwCount();
        PasswordGenerator pw2 = new PasswordGenerator(5);
        System.out.println(answer);
        pw2.pwGen();
        answer = pw2.pwCount();
        System.out.println(answer);
       
    }
}
    
