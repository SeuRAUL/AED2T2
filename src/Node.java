import java.util.ArrayList;

public class Node {
	private String word;
	private Node father;
	private ArrayList<Node> sons;

	
	/* CONSTRUTOR */
	public Node(String word, Node father) {
		this.word = word;
		this.father = father;
	}

	
	
	/*GETTERS & SETTERS*/
	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public Node getFather() {
		return father;
	}

	public void setFather(Node father) {
		this.father = father;
	}

	public ArrayList<Node> getSons() {
		return sons;
	}

	public void setSon(Node son) {
		this.sons.add(son);
	}
	
	
}