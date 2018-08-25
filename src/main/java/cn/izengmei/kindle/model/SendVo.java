package cn.izengmei.kindle.model;

/**
 * 用户发送邮件的展示类，用于包装前台传来的数据
 */
public class SendVo {

    private String userEmail;

    public SendVo(String userEmail, String filePath) {
        this.userEmail = userEmail;
        this.filePath = filePath;
    }

    private String filePath;

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
