package webserver;

import java.nio.file.Path;
import java.nio.file.Paths;

public enum UrlPath {
    ROOT("./webapp"),
    HOME("/"),
    INDEX("/index.html"),
    USER_FORM("/user/form.html"),
    LOGIN("/user/login.html"),
    SIGNUP("/user/signup"),
    LOGIN_FAILED("/user/login_failed.html"),
    LIST("/user/list.html");

    private final String path;

    UrlPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
    // 동적으로 결정되는 homePath를 반환하는 메소드
    public static Path getHomePath() {
        return Paths.get(ROOT.getPath() + INDEX.getPath());
    }
}