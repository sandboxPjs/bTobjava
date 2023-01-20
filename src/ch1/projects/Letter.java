package ch1.projects;

public class Letter {
    public static void main(String[] args) {
        sendParents();
        sendFriend();
        sendBrother();
    }

    public static void sendParents() {
        sendClassesStory();
        sendFriendsStory();
        sendMoneyStory();
    }

    public static void sendFriend() {
        System.out.println("love live");
        sendClassesStory();
        sendHobbiesStory();
    }

    public static void sendBrother() {
        sendHobbiesStory();
        sendFriendsStory();
        sendMoneyStory();
    }

    public static void sendClassesStory() {
        System.out.println("classes");
    }

    public static void sendMoneyStory() {
        System.out.println("ask for money");
    }

    public static void sendFriendsStory() {
        System.out.println("friends");
    }

    public static void sendHobbiesStory() {
        System.out.println("hobbies");
    }
}
