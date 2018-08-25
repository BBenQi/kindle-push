package cn.izengmei.kindle.service;

public interface EmailService {
    /**
     *  给指定邮件地址发送书籍
     * @param email kindle邮箱
     * @param filePath 文件路径
     * @throws Exception
     */
    public void sendEmail(String email,String filePath) throws Exception;
}
