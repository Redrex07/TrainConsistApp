public class UC15CargoSafety {

    // Custom Runtime Exception
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // Bogie class
    static class Bogie {
        private String shape;
        private String cargo;

        public Bogie(String shape) {
            this.shape = shape;
        }

        public void assignCargo(String cargo) {
            try {
                System.out.println("Assigning cargo: " + cargo + " to " + shape + " bogie");

                // Safety rule
                if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                    throw new CargoSafetyException(
                            "Unsafe assignment! Petroleum cannot be stored in Rectangular bogie."
                    );
                }

                this.cargo = cargo;
                System.out.println("Cargo assigned successfully ✅");

            } catch (CargoSafetyException e) {
                System.out.println("Exception caught ❌: " + e.getMessage());

            } finally {
                System.out.println("Finalizing assignment process for " + shape + " bogie\n");
            }
        }

        @Override
        public String toString() {
            return shape + " Bogie -> Cargo: " + cargo;
        }
    }

    public static void main(String[] args) {

        Bogie b1 = new Bogie("Cylindrical");
        b1.assignCargo("Petroleum");

        Bogie b2 = new Bogie("Rectangular");
        b2.assignCargo("Petroleum"); // unsafe case

        System.out.println("Program continues safely ✅");
    }
}