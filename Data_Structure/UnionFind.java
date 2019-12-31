import java.util.HashMap;
import java.util.List;

public class UnionFind {
    public static class Node{

    }


    public static class UnionFindSet{
        public HashMap<Node, Node> fatherMap;
        public HashMap<Node, Integer> sizeMap;


        UnionFindSet(List<Node> nodes){
            makeSets(nodes);
        }

        private void makeSets(List<Node> nodes){
            fatherMap = new HashMap<>();
            sizeMap = new HashMap<>();
            for(Node node:nodes){
                fatherMap.put(node, node);
                sizeMap.put(node, 1);
            }
        }

        private Node findHead(Node node){
            Node father = fatherMap.get(node);
            if(father!=node){
                father = findHead(father);
            }
            fatherMap.put(node, father);
            return father;
        }
    }
}
