class garbagestd{
    String name;
    int age;

    garbagestd(String name,int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args){
        garbagestd s2 = new garbagestd("S1",19);
        System.out.println(Runtime.getRuntime().freeMemory());
        s2 = null;
        System.gc();
        System.out.println(Runtime.getRuntime().freeMemory());
    }
}