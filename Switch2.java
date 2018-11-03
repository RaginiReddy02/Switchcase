public class Switch2 {
    public static void main(String[] args) {
        String out = " ";
        int num = 4;
        switch (num) {
            case 1:
                out = "jan";
                break;

            case 3:
                out = "mar";
                break;
            case 4:
                out = "apr";
                break;
        }
        System.out.println("month  is +out");
        System.out.println("program terminated");
    }
}
