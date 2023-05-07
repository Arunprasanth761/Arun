package week1.day1;

public class mobile {
	public void call() {
		System.out.println("call someone");
	}
	public void playGames() {
		System.out.println("open a game");
	}
	public void watchVideos() {
		System.out.println("open insta/youtube");
	}
	public static void main(String[] args) {
		mobile mobile=new mobile();
		mobile.call();
		mobile.playGames();
		mobile.watchVideos();
		}
}
