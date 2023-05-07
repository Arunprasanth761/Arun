package week1.day1;

public class whatsapp {
	public void sendMessage() {
		System.out.println("message sent");
	}
	public void audioCall() {
		System.out.println("go to audio call page");
	}
	public void videoCall() {
		System.out.println("go to video call page");
	}
	public static void main(String[] args) {
		whatsapp whatsapp=new whatsapp();
		whatsapp.audioCall();
		whatsapp.sendMessage();
		whatsapp.videoCall();
		

	}

}
