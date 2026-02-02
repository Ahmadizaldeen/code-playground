package loops_conditions.old;

public class switchUbunge {
    public static void main(String[] args){
        int tag =2;
        double randTag = Math.random();
        randTag =7*randTag+1;
        int randomTag = (int) randTag;
        System.out.println(randomTag);



        switch (randomTag) {
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch");
                break;
            case 4:
                System.out.println("Donnerstag");
                break;
            case 5:
                System.out.println("Freitag");
                break;
            case 6:
                System.out.println("Samstag");
                break;
            case 7:
                System.out.println("Sonntag");
                break;
            default:
                System.out.println(" No Tag");
        }
    }
}
