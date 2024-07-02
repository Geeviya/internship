package Basic;
public class hotel extends meals implements morningtiffan,lunch,nightdinner {
    @Override
    public void Lunch() {
        System.out.println("Chicken Briyani");
    }

    @Override
    public void Morningtiffan() {
        System.out.println("Dosa and Idly");

    }

    @Override
    public void Nightdinner() {
        System.out.println("chapathi");


}
   public static void main (String[] args) {
       hotel obj = new hotel();
       obj.Lunch();
       obj.Morningtiffan();
       obj.Nightdinner();
       obj.Meals();
   }
}

