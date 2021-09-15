import models.OrderStatus;
import models.Student;
import models.somepackage.Order;

import java.util.*;

public class PersonMain {
  static  List<Student> list = new ArrayList<>();

    public static void main(String[] args) {

//        Double d = new Double(1.233);
//        try {
//            Double d2 = new Double("1.dsdsdkjsdksjdskd");
//        }catch (NumberFormatException e){
//
//        }
//        Runtime r = Runtime.getRuntime();
//        try {
//            r.exec("javac Employee.java");
//            r.exec("java Employee");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Double d4 = new Double("1.233");
//        Double d2 = new Double(1.233);
//      String s =   Double.toString(1.2323);
//      double dsd = 12.33;
//   Double dd =  Double.valueOf(dsd);
//        if (d2.equals(d4)){
//            System.out.println("Equals");
//        }else{
//            System.out.println("Not equals");
//        }

//
//        int a = Math.abs(-123);
//        double ceil = Math.ceil(1.6566);
//        double fl = Math.floor(1.4566);
//        double value = Math.pow(2, 3);
//        double value2 = Math.sqrt(16);

//        System.out.println(value);
//        System.out.println(value2);
//        System.out.println(ceil);
//        System.out.println(fl);
//
//            Vector<String> v = new Vector<>();
//            v.add("roshan");
//            v.add("rijal");
//            v.add("erere");
////            System.out.println(v.get(1));
////            if(v.contains("rijal")){
////                System.out.println("RIJAL EXIST");
////            }else{
////                System.out.println("RIJAL NOT EXIST");
////            }
//            v.add("last index");
//            v.add(2, "two");
//
//            for(String s : v){
//                System.out.println(s);
//            }
//            for(int i  = 0 ; i < v.size() ; i ++){
//                System.out.println(v.get(i));
//            }
//            v.indexOf("rijal");
//           List<String> s =  v.subList(3, 5);
        // System.out.println(v.get(5));
//
//            Stack<Integer> s = new Stack<>();
//             s.push(5);
//             s.push(12);
//             s.push(323);
//             s.push(55);
//             System.out.println(s.pop());
//             System.out.println(s.search(5));
//             System.out.println(s.peek());
//             if(s.empty()){
//                 System.out.println("Stack is empty");
//             }
//             Hashtable<String , String> h = new Hashtable<>();
//             h.put("name", "roshan");
//             h.put("address", "dhulikhel");
//             System.out.println(h.get("address"));

//             if(h.containsKey("name")){
//                 System.out.println(h.get("name"));
//             }
//             if(h.containsValue("roshan")){
//                 System.out.println("contains roshan");
//             }
//             h.remove("name");
//             System.out.println(h.size());
//             h.clear();
//             System.out.println(h.size());
//             h.replace("address" , "Dsdsddsds");
//          Enumeration<String> elements =   h.elements();
//          if(elements.hasMoreElements()){
//              System.out.println(elements.nextElement());
//          }
//          while (elements.hasMoreElements()){
//              System.out.println(elements.nextElement());
//          }
//
//          Random r = new Random();
//          System.out.println(r.nextInt(20));
//          System.out.println(r.nextInt(20));
//          System.out.println(r.nextInt(33));
//          System.out.println(r.nextInt(100));
//
//            String[] myarray = new String[10];
//

//        List<String> list = new ArrayList<>();
//
//        list.add("hello");
//        list.add("world");
//        list.add("aaa");
//        list.add("bbb");
//        list.add("ccc");
//        printList(list);
//        list.add(2, "ddd");
//        list.add(3, "eee");
//        printList(list);
//        System.out.println(list.size());
//        System.out.println(list.contains("aaa"));
//        System.out.println(list.contains("zzz"));
//        if (!list.contains("aaa")) {
//            list.add("aaa");
//        }
//        ArrayList<String> bblist = new ArrayList<>();
//        System.out.println(list.size());
//
//        bblist.add("aaa");
//        bblist.add("bbb");
//        bblist.add("dsd");
//        bblist.add("sdsds");
//        list.addAll(bblist);
//        System.out.println(list.size());
////
////        list.clear();
////        System.out.println(list.size());
////        list.remove(6);
//        while (list.listIterator().hasNext()){
//           System.out.println(list.listIterator().next());
//        }
//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
//        Collections.sort(list);
//            List<String> li = new ArrayList<>();
//            li.add("aaa");
//            li.add("aaa");
//            printList(li);
//            Set<String> s = new HashSet<>();
//            s.add("bb");
//            s.add("bb");
//            if(s.contains("bb")){
//
//            }
//            if(s.containsAll(li)){
//
//            }
//        for (String si:  s) {
//            System.out.println(si);
//        }
//        System.out.println(s.size());
//        for (int i = 0 ; i < li.size() ; i++) {
//            System.out.println(li.get(i));
//        }
//
//        Iterator<String> ite = s.iterator();
//        while (ite.hasNext()){
//            System.out.println(ite.next());
//        }
//        li.removeIf(ab -> {
//            //parse int
//            //check is odd or even
//            return true;
//        });
//        LinkedList<String> list = new LinkedList<>();
//        list.add("sdsd");
//        list.add("sdsd");
//        list.add("sdsd");
//        list.add("sdsd");
//        list.addFirst("dsds");
//        list.addLast("dsds");
//        list.getFirst();
//        list.getLast();
//        list.add(5, "dsds");
//        list.get(5);
//        list.indexOf("sdsd");
//        list.lastIndexOf("sdsd");
//        list.poll();
//        TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2.compareTo(o1);
//            }
//        });
//        ts.add(34);
//        ts.add(20);
//        ts.add(55);
//
//        for (Integer t : ts) {
//            System.out.println(t);
//        }
        Map<String, String> map = new HashMap<>();
        map.put("name", "roshan");
        map.put("address", "dhkl");

//        System.out.println(map.get("address"));
        if(map.containsKey("name")){
//            System.out.println(map.get("name"));
        }

        if(map.containsValue("roshan")){

        }
        Set<String> keys = map.keySet();
        for (String s : keys){
            System.out.println(s);
            System.out.println(map.get(s));
        }
    }

    private static void printList(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }


}

