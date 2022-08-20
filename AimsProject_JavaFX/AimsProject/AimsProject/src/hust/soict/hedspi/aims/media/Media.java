package hust.soict.hedspi.aims.media;

public abstract class Media implements Comparable{
	private String title;
	private String category;
	private float cost;
	private int id;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public String getCategory() {
		return category;
	}


	public float getCost() {
		return cost;
	}


	public Media() {
		// TODO Auto-generated constructor stub
	}


	public Media(String title, String category) {
		this(title);
		this.category = category;
	}

	public Media(String title, String category, float cost) {
		this(title,category);
		this.cost = cost;
	}
	
	public Media(String title) {
		this.title = title;
	}
	
	public boolean equals(Object o) {
		Media obj = (Media) o;
		if( obj == null) return false;
		if(this.getId()==obj.getId()) return true;
		return false;
	}
	
	public int compareTo(Object obj) {
		try {
			Media o = (Media)obj;
		} catch (ClassCastException e){
			System.err.println("ERROR :" + e + " - Unable to cast type!");
		} catch (NullPointerException e){
			System.err.println("ERROR :" + e + " - Pointing to null object");
		}
		Media o = (Media)obj;
		return this.title.compareTo(o.getTitle());
	}
	
	public void printMedia() {
		System.out.print( " Title : "+title +" - "+ "Category : "+category +" - "+"Cost : "+ cost);
	}

}
