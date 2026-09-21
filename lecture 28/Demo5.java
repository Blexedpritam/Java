class Demo5{
    public static void main(String[] args) {
        Box<String> b1 = new Box<>();
    }

    public static <T>void fun(T a, T b){

    }

}

// <T> and <?>
//Super and Extends

class Box<T>{
    T value;
}

