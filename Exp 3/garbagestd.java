class garbagestd {
    String name;
    int age;

    garbagestd(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        garbagestd s1 = new garbagestd("S1", 19);
        System.out.println("Free Memory before GC: " + Runtime.getRuntime().freeMemory());
        s1 = null;
        System.gc();
        System.runFinalization();
        System.out.println("Free Memory after GC: " + Runtime.getRuntime().freeMemory());
    }
}