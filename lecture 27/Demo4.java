public class Demo4 {
    public static void main(String[] args) {
        Pair<Integer , String> pair = new Pair<>(2, "This is String");

        System.out.println(pair.first + "  " + pair.second);

    }    
}

class Pair <Frist , R>{
    Frist first;
    R second;

    Pair(Frist first ,R second){
        this.first = first;
        this.second = second;
    }
}

