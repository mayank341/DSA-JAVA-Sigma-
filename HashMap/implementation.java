import java.util.HashMap;
import java.util.*;
import java.util.LinkedList;
import java.util.ArrayList;

public class implementation {
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;
            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;
        private int N;
        private LinkedList <Node> bucket[];

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.n=0;
            this.bucket=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.bucket[i]=new LinkedList<>();
            }
        }
        private int hashFunction(K key){
            int hc=key.hashCode();
            return Math.abs(hc)%n;
        }

        private int SearchInLL(K key,int bi){
            LinkedList<Node> ll=bucket[bi];
            int di=0;
            for(int i=0;i<ll.size();i++){
                if (key.equals(node.key)) {
                    return di;
                }
                    di++;

            }
            return -1;
        }

        public void put(K key ,V value){
            int bi=hashFunction(key);
                int di=SearchInLL(key,bi);

                if(di!=-1){
                    Node node=bucket[bi].get[di];
                    node.value=value;
                }
                else{
                    bucket[bi].add(new Node(key,value));
                }

            }
        }
          public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < bucket.length; i++) {
                LinkedList<Node> ll = bucket[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return n==0;
        }
        public static void main(String[] args) {
            HashMap<String,Integer> hm=new HashMap<>();
            hm.put("India",130);
            hm.put("China",150);
            hm.put("USA",30);
            hm.put("UK",5);
        }


    }


    