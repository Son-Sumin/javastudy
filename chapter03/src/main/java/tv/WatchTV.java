package tv;

public class WatchTV {

	public static void main(String[] args) {
		TV tv = new TV(7, 20, false);

		tv.status();      // 7, 20, Off

		tv.power(true);   // 7, 20, On
		tv.volume(120);   // 7, 0, On           // -1는 100, 101는 0
		tv.status();      // 7, 0, On

		tv.volume(false);                       // 아날로그 방식, 아래는 false / -1는 100
		tv.status();      // 7, 100, On 

		tv.channel(0);    
		tv.status();      // 255, 100, On

		tv.channel(true); // 1, 100, On
		tv.channel(true); // 2, 100, On
		tv.channel(true); // 3, 100, On
		tv.status();      // 3, 100, On

		tv.power(false);  // 3, 100, Off
		tv.status();

	}

}
