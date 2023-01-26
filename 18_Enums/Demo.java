// Enum = Enumeration

enum Status {
    DEPLOYMENT_TRIGGERED, DEPLOYMENT_SUCCESSFUL, DEPLOYMENT_FAILED, DEPLOYMENT_CRASH_LOOP_BACKOFF, DEPLOYMENT_ABORTED;
//  0                   , 1                    , 2                , 3                            , 4
}

enum Laptop {
    // All of these laptops behave like objects of this enum, and the prices are initialized with a constructor.
    M1_MacBook_Pro(5000), XPS(4500), ThinkPad(1000), Predator(700), Omen(750), ROG_Strix(10000), Alienware(1800), Gram(2500), Inspiron(500), TUF(750), Vostro(200);
    private int price;
    private Laptop(int price) { // 'Private' Constructor, since all the calls to the constructor are happening inside the enum(class) ^^^
        this.price = price;
    }
    public int getPrice() {
        return this.price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}

public class Demo {
    public static void main(String[] args) {
        Status s = Status.DEPLOYMENT_FAILED;
        System.out.println(s);
        System.out.println(s.ordinal());

        Status statuses[] = Status.values();

        for(Status status : statuses) {
            System.out.print(status);
            System.out.println(" <:::::> " + status.ordinal());
        }

        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------");

        Status deploymentStatus = getDeploymentStatus();

        switch(deploymentStatus) {
            case DEPLOYMENT_ABORTED :
                System.out.println("Deployment Aborted due to Developer Interrupt");
                break;
            case DEPLOYMENT_CRASH_LOOP_BACKOFF :
                System.out.println("CRITICAL, Crash Loop in APP, wait for AutoResolve or Rollback");
                break;
            case DEPLOYMENT_FAILED :
                System.out.println("Wrong Credentials : Deployment Failed to proceed");
                break;
            case DEPLOYMENT_SUCCESSFUL :
                System.out.println("Deployment for Service Completed Successfully using Rolling Strategy");
                break;
            case DEPLOYMENT_TRIGGERED :
                System.out.println("Deployment Triggered, Pipeline in Progress...");
                break;
            default :
                System.out.println("No Deployment Currently Happening");
        }

        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------");

        // All enums extend a Class Enum
        System.out.println(s.getClass().getSuperclass());

        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------");

        Laptop laptop = Laptop.TUF;
        System.out.println(laptop.getPrice());
        System.out.println(Laptop.Alienware.getPrice());

        Laptop.XPS.setPrice(999999999);
        Laptop dell = Laptop.XPS;
        System.out.println(dell.getPrice());


    }
    public static Status getDeploymentStatus() {
        // Complex Status Calculation Logic :fire:
        // Computing..............................
        return Status.DEPLOYMENT_CRASH_LOOP_BACKOFF;
    }
}
