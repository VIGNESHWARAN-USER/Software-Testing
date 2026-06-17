package api.utilities;

public class TestContext {

    private static String token;
    private static int userId;

    public static String getToken() {
        return token;
    }

    public static void setToken(String token) {
        TestContext.token = token;
    }

    public static int getUserId() {
        return userId;
    }

    public static void setUserId(int userId) {
        TestContext.userId = userId;
    }
}
