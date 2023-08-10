
public class Audio implements RemoteContol {

	private int volume;

	@Override
	public void setVolume(int volume) {
		if (volume < RemoteContol.MIN_VOLUME) {
			this.volume = RemoteContol.MIN_VOLUME;
		} else if (volume > RemoteContol.MAX_VOLUME) {
			this.volume = RemoteContol.MAX_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio의 볼룸:" + this.volume);
	}

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");

	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");

	}

}

