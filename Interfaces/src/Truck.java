public class Truck implements Trackable {
    @Override
    public void track() {
        System.out.println(getClass().getSimpleName()+ "'s co-ordinates were recorded");
    }
}
