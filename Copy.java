import java.io.*;
class Copy {
    public static void main(String arg[]) {
        File inf = new File("C:\\Users\\K G V. Manikanta\\ManiCG\\Assignment\\src\\main\\java\\InFile.txt");
        File outf = new File("C:\\Users\\K G V. Manikanta\\ManiCG\\Assignment\\src\\main\\java\\OutFile.txt");
        FileReader ins = null;
        FileWriter outs = null;
        try {
            ins = new FileReader(inf);
            outs = new FileWriter(outf);
            int ch;
            while ((ch = ins.read()) != -1) {
                outs.write(ch);
            }
        } catch (IOException e) {
            System.out.println(e);
            System.exit(-1);
        } finally {
            try {
                ins.close();
                outs.close();
            } catch (IOException e) {}
        }
    }
}