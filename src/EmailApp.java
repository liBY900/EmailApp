public class EmailApp {
    public static void main (String[] args){
     Email em1 = new Email("Liberty","Kamabnje");

     em1.setAlternatemail("ls@gmail.com");
        System.out.println(em1.getAlternatemail());
    }
}

