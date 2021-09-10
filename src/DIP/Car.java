package DIP;



   interface EngineInterface {
    void start();
}
public class Car {
    private final EngineInterface engine;
    public Car(EngineInterface e) {
        engine = e;
    }
    public void start() {
        engine.start();
    }
}
 class PetrolEngine implements EngineInterface {
     public PetrolEngine(String s) {

     }

     public void start() {
        System.out.println("start Petrol Engine .");

    }
}
 class DieselEngine implements EngineInterface {
     public DieselEngine(String s) {
     }

     public void start() {
        System.out.println("start Diesel engine ");

    }
}

