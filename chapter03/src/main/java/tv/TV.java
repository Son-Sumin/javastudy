package tv;

//// 답안
//public class TV {
//	private int channel;    // 1~255 
//	private int volume;     // 0~100
//	private boolean power;
//	
//	public TV(int channel, int volume, boolean power) {
//		this.channel = channel;
//		this.volume = volume;
//		this.power = power;
//	}
//	
//	public void power(boolean on) {
//		power = on;
//	}
//	
//	public void channel(boolean up) {
//		// channel(channel + (up ? 1 : -1));
//		if(up) {
//			channel(channel + 1);
//		} else {
//			channel(channel - 1);
//		}
//	}
//
//	public void channel(int channel) {
//		if(!power) {
//			return;
//		}
//		
//		if(channel < 1) {
//			channel = 255;
//		} else if(channel > 255){
//			channel = 1;
//		}
//		
//		this.channel = channel;
//	}
//	
//	public void volume(boolean up) {
//		volume(volume + (up ? 1 : -1));
//	}
//
//	public void volume(int volume) {
//		if(!power) {
//			return;
//		}
//		
//		if(volume < 0) {
//			volume = 100;
//		} else if(volume > 100){
//			volume = 0;
//		}
//		
//		this.volume = volume;
//	}
//
//	public void status() {
//		System.out.println(
//			"TV[power=" + (power ? "on" : "off") + ", " + 
//			"channel=" + channel + ", " +
//			"volume=" + volume + "]");
//	}
//	
//}


// 오답풀이
public class TV {
	private int channel; // 1 ~ 255 사이 값을 가지게 하고 넘어갈 때는 라운딩 시킬 것
	private int volume; // 0 ~ 100 사이 값을 가지게 하고 넘어갈 때는 라운딩 시킬 것
	private boolean power;

	public TV(int c, int v, boolean p) {
		this.channel = c;
		this.volume = v;
		this.power = p;
	}

	public void status() {
		System.out.println(
				"TV[channel= " + channel + 
				", volume= " + volume + 
				", power= " + (power ? "On" : "Off") + "]");
	}
	
	public void power(boolean on) {
		power = on;
	}

	public void channel(int c) {
		if (!power) {
			return;
		}
		
		if(c < 1) {
			c = 255;
		} else if(c > 255){
			c = 1;
		}
		
		this.channel = c;
	}
	
	public void channel(boolean channelTrue) {
		// channel(channel + (channelTrue ? 1 : -1));
		if(channelTrue) {
			channel(channel + 1);
		} else {
			channel(channel - 1);
		}
	}

	public void volume(int v) {
		if (!power) {
			return;
		}
		
		if (v < 0) {
			v = 100;
		} else if (v > 100) {
			v = 0;
		}
		this.volume = v;
	}
	
	public void volume(boolean volumeTrue) {
		// volume(volume + (volumeTrue ? 1 : -1));
		if(volumeTrue) {
			volume(volume + 1);
		} else {
			volume(volume - 1);
		}
	}
}
