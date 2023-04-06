public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private Dishwasher dishWasher;

    public SmartKitchen(){
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new Dishwasher();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public Dishwasher getDishWasher() {
        return dishWasher;
    }

    public void setKitchenState(boolean coffeeFlag,boolean fridgeFlag, boolean dishWasherFlag){
        brewMaster.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDO(fridgeFlag);
        dishWasher.setHasWorkToDO(dishWasherFlag);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.washDishes();
    }
}

class CoffeeMaker{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void brewCoffee(){
        if(hasWorkToDo) {
            System.out.println("Coffee Brewing!");
            hasWorkToDo = false;
        }
    }
}

class Refrigerator{

    private boolean hasWorkToDo;

    public void setHasWorkToDO(boolean hasWorkToDO) {
        this.hasWorkToDo = hasWorkToDO;
    }

    public void orderFood(){
        if(hasWorkToDo) {
            System.out.println("Food Ordered!");
            hasWorkToDo = false;
        }
    }
}

class Dishwasher{

    private boolean hasWorkToDo;

    public void setHasWorkToDO(boolean hasWorkToDO) {
        this.hasWorkToDo = hasWorkToDO;
    }

    public void washDishes(){
        if(hasWorkToDo) {
            System.out.println("Dishes washing!");
            hasWorkToDo = false;
        }
    }
}
