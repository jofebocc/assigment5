import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;


import java.io.*;
import java.lang.reflect.Type;
import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        try {
            BufferedReader b r = new BufferedReader(new FileReader("C:\\Users\\jofeb\\Documents\\Software engi\\assigment5\\src\\main\\resources\\newTest.json"));
            Citation temp = gson.fromJson(br, Citation.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

    }
}
