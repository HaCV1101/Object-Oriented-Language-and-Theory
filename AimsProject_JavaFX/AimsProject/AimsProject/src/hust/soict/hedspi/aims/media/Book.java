package hust.soict.hedspi.aims.media;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

//import java.lang.Object;
public class Book extends Media{
	private List<String> authors ;
	String content;
	List<String> contentTokens;
	Map<String,Integer> wordFrequency;
	
	public void processContent() {
		String []contentSplit= content.split("\\s|\\.");
		this.contentTokens = new ArrayList<>(Arrays.asList(contentSplit));
		Collections.sort(this.contentTokens);
		wordFrequency =
				new TreeMap<String, Integer>();
		for(String content: this.contentTokens) {
			System.out.println(content);
			if(!wordFrequency.containsKey(content)) {
				wordFrequency.put(content, Collections.frequency(contentTokens, content));
			}
		}
	}
	
	public void setContent(String s) {
		if(this.content != null) {
			if(!this.content.equals(s)) {
				this.content = s;
				processContent();
			}
		}else {
			this.content = s;
			processContent();
		}
	}
	public String toString() {
		String result = "";
		StringBuilder sb = new StringBuilder();
		for(String author: authors) {
			sb.append(author);
			sb.append(", ");
		}
		sb.append(contentTokens.size());
		sb.append(", ");
//		for(String key: wordFrequency.keySet()) {
//			sb.append(key);
//			sb.append(":");
//			sb.append(wordFrequency.get(key));
//			sb.append(", ");
//		}
		for (Map.Entry<String, Integer> pair : this.wordFrequency.entrySet()) {
			System.out.println(pair.getKey());
			sb.append(pair.getKey());
			sb.append(":");
			sb.append(pair.getValue());
			sb.append(", ");
		}
		result = sb.toString();
		return result;
	}
	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public Book() {
		super();
	}
	
	
	
	public Book(String title, String category) {
		super(title, category);
		// TODO Auto-generated constructor stub
	}
	
	public Book(String title, String category, List<String> authors){
		super(title, category);
		this.authors = authors; //TODO: check author condition
	} 

	public Book(String title, String category,float cost,ArrayList<String> authors) {
		super(title, category, cost);
		this.authors = authors;
	}
	public Book(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public void addAuthor(String authorName) {
		if(authors.contains(authorName)) {
			return;
		}else {
			authors.add(authorName);
			return;
		}
	}
	
	public void removeAuthor(String authorName) {
		if(authors.contains(authorName)) {
			authors.remove(authorName);
			return;
		}
	}
	
}
