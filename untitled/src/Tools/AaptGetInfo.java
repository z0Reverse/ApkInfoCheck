package Tools;

import UI.MainInfo;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AaptGetInfo {
    private static final String AAPT_RELATIVE_PATH = "./src/Tools/aapt.exe";
    private static String path;
    {
        path= MainInfo.getApkpath();
    }
    public static String[] GetPermission(){
        try {

            List<String> permissionList = new ArrayList<>();

            File aaptFile = new File(AAPT_RELATIVE_PATH);
            String aaptAbsolutePath = aaptFile.getAbsolutePath();
            String cmd = aaptAbsolutePath + " d permissions " + MainInfo.getApkpath();
            // begin get permission

            Process process = Runtime.getRuntime().exec(cmd);

            // 读取命令输出
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("uses-permission:")) {
                    // 提取权限名称
                    String permission = line.split(":")[1].trim();
                    permission = permission.replace("name=", "");
                    permission = permission.replace("'", "");
                    //System.out.println("Extracted permission: " + permission);
                    permissionList.add(permission);
//                    System.out.println("Permission: " + permission);
                }
            }
            process.waitFor();

            // 返回权限数组
            return permissionList.toArray(new String[0]);

        }catch (Exception e){
            e.printStackTrace();

        }
        return null;

    }

}
