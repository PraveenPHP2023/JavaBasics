package inter;

class Phone{
	void voicecall()
	{
		System.out.println("Make Voicecall");
	}
	
	void sms()
	{
		System.out.println("We can send sms");
	}
}

interface camera
{
	void click();
	void record();
	
	
}

interface player{
	void play();
	void pause();
	void stop();
}

class smartphone extends Phone implements camera,player
{

	@Override
	public void play() {
		System.out.println("Play Music");
		
	}

	@Override
	public void pause() {
		System.out.println("Pause the song");
		
	}

	@Override
	public void stop() {
		System.out.println("Stop the music");
		
	}

	@Override
	public void click() {
		System.out.println("Click a selfie");
		
	}

	@Override
	public void record() {
		System.out.println("Record a video");
		
	}
	
}

public class InterfaceDemo2 {

	public static void main(String[] args) {
	
		smartphone obj = new smartphone();
		obj.click();
		obj.record();
		obj.play();
		obj.pause();
		obj.stop();
		obj.sms();
		obj.voicecall();
		

	}

}
