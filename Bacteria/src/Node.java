
/**
 * Name: Izzy Hurley
 * Lab Name: Node
 * Lab Purpose: The goal of Bacteria is to create a class that can model plasmid structure and separation for bacteria. These values will supplement the fitness calculations of the bacteria.
 * Date: 11/26/18
 * Collaborators: None
 * ON MY HONOR: IH
 */
public class Node {
    public String plasmid;
    public int copynumber; // between 1 -5 scaled down 75% from natural values in order to expidite fitness equations
    public int distance; //between 1-3 numbers represent degrees of magintude away from the center of genetic material
    public Node left; // important to know the plasmids near and their copy number
    public Node right; // if other cooy numbers are high the higher copy number will increment more
    // lower copy numbers nearby will mean higher prevelence of plamids internally
    //this will increace horizontal gene transfer

    public Node(String p, int c, int d){
        plasmid = p;
        copynumber = c;
        distance = d;

    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setCopynumber(int copynumber) {
        this.copynumber = copynumber;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getCopynumber() {
        return copynumber;
    }

    public int getDistance() {
        return distance;
    }

    public String getPlasmid() {
        return plasmid;
    }
}
