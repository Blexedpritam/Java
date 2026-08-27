// BufferReader

import java.io.*;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        // InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name = br.readLine();
        System.out.println(name); //For String
        
        String s = br.readLine();
        int i = Integer.parseInt(s);
        System.out.println(i);
    }
}

/*
    --Pritam I/p
        OS Buffer(ASCII value of "Pritam")
            System.in (InputStream) recieves bytes
                InputStreamReader --> Stream of bytes into Stream into Character('P', 'r', 'i', 't', 'a', 'm')
                    BufferReader --> readline --> Pritam --> name
                        Pritam  O/p
*/