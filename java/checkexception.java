

public class checkexception{
        public static void main(String[] args) {
            try {
                // Attempt to load a class that does not exist
                Class.forName("NonExistentClass");
            } catch (ClassNotFoundException e) {
                System.out.println("ClassNotFoundException: " + e.getMessage());
            }


        }
    }
    

