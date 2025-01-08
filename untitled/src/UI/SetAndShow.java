package UI;

import PermissionCheck.PermissionCheckInfo;
import Tools.AaptGetInfo;

import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SetAndShow {
    public static void main(String[] args) {
        try {
            System.out.println("当前包名：" + MainInfo.getPackagename());
            System.out.println("当前工作目录：" + MainInfo.getMkdirpath());
            System.out.println("当前应用所在目录：" + MainInfo.getApkpath());
            //System.out.println("是否需要更改 Y or N");
            System.out.println("please input your path");
            Scanner scanner = new Scanner(System.in);
            MainInfo.setApkpath(scanner.next());
            System.out.println("now path is:" + MainInfo.getApkpath());

//
//            if (scanner.next().equalsIgnoreCase("Y")) {
//                System.out.println("please input your path");
//                MainInfo.setApkpath(scanner.next());
//                System.out.println("now path is:" + MainInfo.getApkpath());
//            }
            PermissionCheckInfo permissionCheckInfo=new PermissionCheckInfo();
            permissionCheckInfo.PersonInformationPermission();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public static String[] GetPermission() {
//        try {
//            String[] permissionList = new String[100];
//            int i = 0;
//
//            File aaptFile = new File(AAPT_RELATIVE_PATH);
//            String aaptAbsolutePath = aaptFile.getAbsolutePath();
//            String cmd = aaptAbsolutePath + " d permissions " + MainInfo.getApkpath();
//
//            // 执行命令
//            Process process = Runtime.getRuntime().exec(cmd);
//
//            // 读取命令输出
//            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
//            String line;
//            while ((line = reader.readLine()) != null) {
//                if (line.startsWith("uses-permission:")) {
//                    // 提取权限名称
//                    String permission = line.split(":")[1].trim();
//                    if (i >= permissionList.length) {
//                        System.out.println("权限列表已满");
//                        break;
//                    }
//                    permissionList[i] = permission;
//                    i++;
//                }
//            }
//
//            // 返回实际填充的权限数组
//            if (i > 0) {
//                String[] result = new String[i];
//                System.arraycopy(permissionList, 0, result, 0, i);
//                return result;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return new String[0];
//    }
}