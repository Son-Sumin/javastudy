package chapter03;

public class T7Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year; 
	private int track;
	
	public T7Song() {
		// T7Song 확장하기; 오버로딩
		// 모든 클래스에는 반드시 하나 이상의 생성자가 있어야 한다.
		// 매개변수와 내용이 없는 기본 생성자 추가
	}
	
	public T7Song(String title, String artist) {
//		this.title = title;
//		this.artist = artist;
//		this.album = "";
//		this.composer = "";
		
		this(title, artist, "", "", 0, 0);  // this; 생성자 안에서 다른 키워드를 사용할 때
	}
	
	public T7Song(String title, String artist, String album, String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	public void show( ) {
		System.out.println(
				artist + " " + 
				title + "( " + 
				album + ", " + 
				year + ", " + 
				track + "번 track, " + 
				composer + " 작곡 )");
	}
	
	
}