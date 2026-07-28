import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
      

        // ArrayList
    //     ArrayList<String> customers = new ArrayList<String>();
    // customers.add("Rahul");
    // customers.add("Romil");
    // customers.add("Rohit");
    // // print
    // // System.out.println(customers.get(1));
    // Iterator<String> itr = customers.iterator();
    // System.out.println( itr.next());
    // // 1000 lines
    // System.out.println( itr.next());
    // System.out.println( itr.next());


// Create class Customer -> id, name, age , getDetails()
// Create an ArrayList of 5 Customers
// Remove the second customer
// Iterate and display name and age of customers

// Set - HashSet

HashSet<String> pans = new HashSet<String>();
pans.add("ABHHSHS65");
pans.add("ABHHSHHGH45");
pans.add("ABIOHSHS65");
pans.add("U67BBHHSHS65");


System.out.println(pans);

for(String pan:pans){
    System.out.println(pan);
}

// Key Value - Map
HashMap<Integer,Double> accounts = new HashMap<>();
accounts.put(1001, 200000.0);
accounts.put(1005, 890000.0);
accounts.put(1002, 1000000.0);
accounts.put(1004, 4500000.0);

// for(Integer acc:accounts.keySet()){
//     System.out.println(acc + " -> " + accounts.get(acc) );
// }
// ArrayList -> Ordered , Duplicacy allowed
// HashSet -> Unordered , Duplicacy not allowed
// HashMap -> Unordered , Last Write wins (Key should be unique)
// TreeMap -> Ordered , 
TreeMap<Integer,Double> nums = new TreeMap<>();
nums.put(1005, 300000.0);
nums.put(1002, 5500000.0);
nums.put(1005, 800000.0);

for(Integer num:nums.keySet()){
    System.out.println(num + " -> " + nums.get(num) );
}

    }
}
