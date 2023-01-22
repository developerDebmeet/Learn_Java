class Computer {
    String processor;
    String motherboard;
    String gpu;
    static String cabinet = "Galax Revolution 01 Black";
    String ram = "XPG Adata Spectrix D50 8x2 16GB Kit";

    Computer (String p, String m, String g) {
        /*
         * Cabinet and ram are having some default values,
         * hence they will be part of every new object created,
         * if they are not updated.
         * 
         * They also need not be a part of this constructor 
         * Since some value is already there.
         */
        processor = p;
        motherboard = m;
        gpu = g;
    }

    void giveComputerSpecs() {
        System.out.println();
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println(processor + " | " + motherboard + " | " + gpu + " | " + cabinet + " | " + ram);
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println();
    }

    static void giveWarrantyDetails_Static() {
        System.out.println("All our PC get 5 years of conditionless Warranty ||| *TnC apply");
        System.out.println("GPU and PSU are not covered under warranty if there is Burn or Liquid damage identified!!");
        System.out.println("Free Replacement of Cabinet -----> " + cabinet);
        // We are able to use 'cabinet variable' here since it is static
    }

    static void giveWarrantyDetails_PerIndividualPC_Static(Computer comp) {
        System.out.println("Individual PC Warranty Details..... ||| *TnC apply");
        System.out.println(comp.gpu +"<----- not covered under warranty if there is Burn or Liquid damage identified!!");
        System.out.println("Free lifetime Thermal Paste for ----->" + comp.processor);
        System.out.println("Free Replacement of Cabinet -----> " + cabinet);
        // We are able to use 'cabinet variable' here since it is static
        // We are able to use the other variables now, since the whole object reference is available to us
    }
}

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("<::::: FRESH SYSTEMS :::::>");

        Computer harshitComputer = new Computer("Core-i5 12400F", "MSI B660M Mortar   ", "Zotac RTX 3060 12GB TwinEdge ");
        harshitComputer.giveComputerSpecs();

        Computer debmeetComputer = new Computer("Ryzen 5 5600X ", "Gigabyte B550M DS3H", "ASUS Dual Radeon RX 6600 8 GB");
        debmeetComputer.giveComputerSpecs();

        // Some System Upgrades!!
        System.out.println("<::::: UPGRADED SYSTEMS :::::>");
        harshitComputer.ram = "GSkill Trident Z 16 GB 8x2 Kit";
        harshitComputer.cabinet = "NZXT 510 Flow";
        debmeetComputer.processor = "5800X3D";

        harshitComputer.giveComputerSpecs();
        debmeetComputer.giveComputerSpecs();

        /*
         * Notice, 
         * 1)Debmeet's Processor upgrade did not affect Harshit
         * 2)Harshit's Cabinet upgrade, upgrded Debmeet's too
         * 3)Harshit's RAM upgrade did not affect Debmeet
         */

         // Static Variables are shared by all the objects

         // static variables should be called with classs name
         // not with the objects


         System.out.println("New Cabinet and Warranty Details :::>>>>>>");
         Computer.cabinet = "Deepcool Matrexx Mesh Black";
         Computer.giveWarrantyDetails_Static();
         // Static method is also quite similar to variables!
         // an object is not needed for calling the static methods
         // can be called directly using the classNames
         // IMP : Static variables can be used in Static Methods
         // Non Static variables cannot be used in static Methods!

         Computer.giveWarrantyDetails_PerIndividualPC_Static(debmeetComputer);
         // if object is passed to static method, then obviously both static and non static 
         // variables can be used in the static method!!

         harshitComputer.giveComputerSpecs();
         debmeetComputer.giveComputerSpecs();

         Class.forName("Mobile");
         // This is used to explicitly load a class.
         // throws ClassNotFoundException

    }    
}

class Mobile {
    int price;
    String brand;
    static String soc;

    static {
        soc = "Snapdragon 8 Gen 1";
    }

    Mobile() {
        price = 1000;
        brand = "";
        //soc = "Snapdragon 8 Gen 1";
        // soc is static, and hence, keeping it in constructor
        // would mean it is assigned the same value, with every new 
        // object that is created. This is waste of computation.
        // Static Block is used to solve this, and is initialized only
        // once.
    }
}


/*
 * First the class loads[once] and then the objects are instantiated
 * Static block is called when the class loads, hence,
 * static block is called before the other constructors
 * 
 * if we do not create any object itself, class also does not load,
 * hence static block and any constructor is also not called
 * 
 * Class.forName("Mobile")
 * can be used to explicitly load the class, and hence the static block too
 * but if objects are not created, constructor is not called.
 */