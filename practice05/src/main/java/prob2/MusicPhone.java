package prob2;

public class MusicPhone extends Phone {
	
	@Override
	public void execute(String function) {
		if (function.equals("음악")) {
			playMusic();
		} else if (function.equals("앱")) {
			//(SmartPhone) playApp();
		} else {
			return;
		}

		super.execute(function);
	}

	private void playMusic() {
		System.out.println("MP3 플레이어에서 음악재생");
	}

}

// string 비교는 = 이 아니라 equals