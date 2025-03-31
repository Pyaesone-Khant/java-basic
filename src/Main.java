public class Main {

	public static void main(String[] args) {

		Friend friend = new Friend("John");
		System.out.println(friend.numOfFriends);

		Friend friend2 = new Friend("James");
		System.out.println(friend2.numOfFriends);

		Friend friend3 = new Friend("James");
		System.out.println(friend3.numOfFriends);

		Friend friend4 = new Friend("James");
		System.out.println(friend4.numOfFriends);

		Friend.showFriends();
	}
}
