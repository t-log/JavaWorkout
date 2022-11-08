public class InstanceTracker {
    static int createdCount=0;
    static int destroyedCount=0;
    static int aliveCount=0;
    InstanceTracker()
    {
        createdCount++;
    }
    public static void main(String[] args) {
        InstanceTracker obj1 = new InstanceTracker();
        obj1 = null;

        InstanceTracker obj2 = new InstanceTracker();
//        obj2 = obj1;
        System.gc();
        System.out.println("Objects created:"+createdCount);
        System.out.println("Objects alive:"+(createdCount-destroyedCount));

    }
    protected void finalize() throws Throwable
    {
        System.out.println("Garbage collector called");
        destroyedCount++;
        System.out.println("Objects destroyed:"+destroyedCount);
    }

}
