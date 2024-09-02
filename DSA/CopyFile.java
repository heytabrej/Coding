import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile{
public static void main(String args[]) throws IOException
{
FileInputStream in = null;
FileOutputStream out = null;
try
{
in = new FileInputStream("input.txt");
out = new FileOutputStream("output.txt");
int c;
while ((c = in.read()) != -1)
{
out.write(c);
}
}
// The “finally” block is used to execute the important code of the program. It is executed whether an exception is handled or not.
finally
{
if (in != null)
{
in.close();
}if (out != null)
{
out.close();
}
}
}
}
