package chapter03;

public class T6SongTest {

	public static void main(String[] args) {
		T7Song song = new T7Song();

		song.setTitle("좋은날");
		song.setArtist("아이유");
		song.setAlbum("Real");
		song.setComposer("이민수");
		song.setYear(2010);
		song.setTrack(3);
		
		song.show();
		
		T7Song song2 = new T7Song("Love Dive", "IVE", "Jamie Parker 외 3명", "Love Dive", 2022, 1);
		song2.show();
		
		T7Song song3 = new T7Song("사건의 지평선", "윤하");
		song3.show(); 
	}

}
