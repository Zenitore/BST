public class BSTDriver {
    public static void main(String[] args) {
        BinarySearchTree<Integer,String> b = new BinarySearchTree<Integer,String>();
        System.out.println(b.isEmpty());
        b.put(6,"Root");
        b.put(4, "left");
        b.put(9, "right");
        b.put(1, "min");
        b.put(15, "max");
        System.out.println(b.get(6));
        System.out.println(b.get(9));
        System.out.println(b.get(4));
        System.out.println(b.get(15));
        System.out.println(b.get(1));
        System.out.println(b.min());
        System.out.println(b.max());
        System.out.println(b.contains(1));
        System.out.println(b.remove(1));
        System.out.println(b.size());


    }
}
