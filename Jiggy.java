public class Jiggy {

    public static class jiggy {
        int a = 31;
        static int y = 28;

        public jiggy() {
        }

        public static void localMethods() {
            byte var0 = 75;
            System.out.println("The local variable = " + var0);
        }

        public void instanceMethod() {
            System.out.println(this.a + " Can be directly accessed from the instance method");
            System.out.println(y + " Can be directly accessed from the instance method");
        }

        public static void staticMethod() {
            System.out.println(y + " Can be directly accessed from the static method");
        }

        public static void main(String[] var0) {
            jiggy var1 = new jiggy();
            System.out.println("The instance variable = " + var1.a);
            System.out.println("The static variable = " + y);
            var1.instanceMethod();
            staticMethod();
            localMethods();
        }
    }

}
