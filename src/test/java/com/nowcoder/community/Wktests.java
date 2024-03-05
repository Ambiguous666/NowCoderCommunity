package com.nowcoder.community;

import java.io.IOException;

public class Wktests {

    public static void main(String[] args) {
        String cmd = "D:/SoftwareDownload/wkhtmltopdf/bin/wkhtmltoimage --quality 75 https://www.nowcoder.com E:/Workspace/Java/exercise/NowCoderCommunity/wk-images/2.png";
        try {
            Runtime.getRuntime().exec(cmd);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
