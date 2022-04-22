package chapter12;

enum Direction { EAST, SOUTH, WEST, NORTH }

public class EnumEx1 {
    public static void main(String[] args) {
        AdvancedDirection d1 = AdvancedDirection.EAST;
        AdvancedDirection d2 = AdvancedDirection.valueOf("WEST");
        AdvancedDirection d3 = Enum.valueOf(AdvancedDirection.class, "EAST");

        switch(d1) {
            case EAST: System.out.println("EAST"); break;
            case SOUTH: System.out.println("SOUTH"); break;
            case WEST: System.out.println("WEST"); break;
            case NORTH: System.out.println("NORTH"); break;
            default: System.out.println("Invalid"); break;
        }

        AdvancedDirection[] dArr = AdvancedDirection.values();

        for(AdvancedDirection d: dArr)
            System.out.printf("%s=%d\n", d.name(), d.ordinal());
    }
}
