class one {
    void sum() {
        System.out.println("summation");
    }

    class two
    extend one{

        void multp() {
            System.out.println("multiplication");
        }

        class three
        extend two{

            void differ() {
                System.out.println("difference");
            }

            class main {
                public static void main(String args[]) {
                    three obj = new three();
                    obj.sum();
                    obj.multp();
                    obj.differ();

                }
            }
}
