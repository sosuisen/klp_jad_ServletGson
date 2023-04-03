public class ToDo {
	private String title;
	/**
	 * Local date string
	 * e.g. 2022-12-01
	 */
	private String date;
	private boolean completed;
	
	public ToDo(String title, String date, boolean completed) {
		this.title = title;
		this.date = date;
		this.completed = completed;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return date string e.g. 2022-12-01
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date date string e.g. 2022-12-01
	 */
	public void setDate(String date) {
		this.date = date;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	
}
