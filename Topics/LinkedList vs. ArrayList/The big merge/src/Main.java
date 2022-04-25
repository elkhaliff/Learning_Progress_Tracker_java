
class ListOperations {
    public static void mergeLists(LinkedList<String> linkedList, ArrayList<String> arrayList) {
        for (String s : arrayList) {
            linkedList.addLast(s);
        }
        System.out.printf("The new size of LinkedList is %d\n", linkedList.size());
    }
}