public class InstanceTracker {
    static int createdCount=0;
    static int destroyedCount=0;
    InstanceTracker()
    {
        createdCount++;
    }
    public static void main(String[] args) {
        InstanceTracker i1 = new InstanceTracker();
        InstanceTracker i2 = new InstanceTracker();
        InstanceTracker i3 = new InstanceTracker();
        InstanceTracker i4 = new InstanceTracker();
        InstanceTracker i5 = new InstanceTracker();

        i5 = i4 = i3 = null;

        System.gc();

        System.out.println("Objects created:"+createdCount);
        System.out.println("Objects destroyed:"+destroyedCount);
        System.out.println("Objects alive:"+(createdCount-destroyedCount));
    }
    protected void finalize() throws Throwable {destroyedCount++;}
}
