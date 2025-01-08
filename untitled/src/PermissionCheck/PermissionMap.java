package PermissionCheck;

import java.util.HashMap;
import java.util.Map;

public class PermissionMap {
    //定义私有实例，仅本类可见
    private Map<String,String> permissionmap;
    private Map<String,String> signaturePermissions;

    //初始化块
    {
        //实例化一个hashmap对象
        permissionmap = new HashMap<>();
        //根据移动互联网应用程序系统权限申请使用指南编写
        permissionmap.put("个人信息权限：读日历", "android.permission.READ_CALENDAR");
        permissionmap.put("个人信息权限：写日历", "android.permission.WRITE_CALENDAR");
        permissionmap.put("个人信息权限：读取通话记录", "android.permission.READ_CALL_LOG");
        permissionmap.put("个人信息权限：编辑通话记录", "android.permission.WRITE_CALL_LOG");
        permissionmap.put("个人信息权限：监听呼出电话", "android.permission.PROCESS_OUTGOING_CALLS");
        permissionmap.put("个人信息权限：拍摄", "android.permission.CAMERA");
        permissionmap.put("个人信息权限：读取通讯录", "android.permission.READ_CONTACTS");
        permissionmap.put("个人信息权限：编辑通讯录", "android.permission.WRITE_CONTACTS");
        permissionmap.put("个人信息权限：获取App账户", "android.permission.GET_ACCOUNTS");
        permissionmap.put("个人信息权限：访问精准定位", "android.permission.ACCESS_FINE_LOCATION");
        permissionmap.put("个人信息权限：访问粗略位置", "android.permission.ACCESS_COARSE_LOCATION");
        permissionmap.put("个人信息权限：支持后台访问位置", "android.permission.ACCESS_BACKGROUND_LOCATION");
        permissionmap.put("个人信息权限：录音", "android.permission.RECORD_AUDIO");
        permissionmap.put("个人信息权限：读取电话状态", "android.permission.READ_PHONE_STATE");
        permissionmap.put("个人信息权限：读取本机电话号码", "android.permission.READ_PHONE_NUMBERS");
        permissionmap.put("个人信息权限：允许App直接拨打电话", "android.permission.CALL_PHONE");
        permissionmap.put("个人信息权限：接听电话", "android.permission.ANSWER_PHONE_CALLS");
        permissionmap.put("个人信息权限：添加语音邮件", "com.android.voicemail.permission.ADD_VOICEMAIL"); // 特殊权限
        permissionmap.put("个人信息权限：使用网络电话", "android.permission.USE_SIP");
        permissionmap.put("个人信息权限：继承来自其他App的通话", "android.permission.READ_CALL_LOG");
        permissionmap.put("个人信息权限：获取身体传感器信息", "android.permission.BODY_SENSORS");
        permissionmap.put("个人信息权限：发送短信", "android.permission.SEND_SMS");
        permissionmap.put("个人信息权限：接收短信", "android.permission.RECEIVE_SMS");
        permissionmap.put("个人信息权限：读取文字信息", "android.permission.READ_SMS");
        permissionmap.put("个人信息权限：接受WAP推送", "android.permission.RECEIVE_WAP_PUSH");
        permissionmap.put("个人信息权限：接受彩信", "android.permission.RECEIVE_MMS");
        permissionmap.put("个人信息权限：读取外置存储器", "android.permission.READ_EXTERNAL_STORAGE");
        permissionmap.put("个人信息权限：写入外置存储器", "android.permission.WRITE_EXTERNAL_STORAGE");
        permissionmap.put("个人信息权限：读取照片位置信息", "android.permission.ACCESS_MEDIA_LOCATION");
        permissionmap.put("个人信息权限：识别身体活动", "android.permission.ACTIVITY_RECOGNITION");
        permissionmap.put("个人信息权限：访问设备的手机功能", "android.permission.READ_PHONE_STATE");
        //新增
        permissionmap.put("个人信息权限：管理文件权限", "android.permission.MANAGE_EXTERNAL_STORAGE");
        permissionmap.put("个人信息权限：访问网络", "android.permission.INTERNET");
        permissionmap.put("个人信息权限：访问网络状态", "android.permission.ACCESS_NETWORK_STATE");

        //三方危险权限
        permissionmap.put("危险权限：允许应用程序显示系统警报窗口", "android.permission.SYSTEM_ALERT_WINDOW");
        permissionmap.put("危险权限：允许应用程序在系统完成引导后立即启动", "android.permission.RECEIVE_BOOT_COMPLETED");
        permissionmap.put("危险权限：允许应用程序修改系统的设置数据", "android.permission.WRITE_SETTINGS");
        permissionmap.put("危险权限：允许应用程序安装其他恶意软件包", "android.permission.REQUEST_INSTALL_PACKAGES");
        //permissionmap.put("危险权限：允许应用程序在系统完成引导后立即启动", "android.permission.RECEIVE_BOOT_COMPLETED");

        //签名权限
        permissionmap.put("签名或系统权限：允许应用程序捕获音频输出","android.permission.CAPTURE_AUDIO_OUTPUT");
        permissionmap.put("签名或系统权限：读取系统日志", "android.permission.READ_LOGS");
        permissionmap.put("签名或系统权限：设置闹钟", "com.android.alarm.permission.SET_ALARM");
        permissionmap.put("签名权限：允许应用程序调度精确的闹钟","android.permission.SCHEDULE_EXACT_ALARM");
        permissionmap.put("签名或系统权限：访问下载管理器", "android.permission.ACCESS_DOWNLOAD_MANAGER");
        permissionmap.put("签名或系统权限：访问下载管理器高级权限", "android.permission.ACCESS_DOWNLOAD_MANAGER_ADVANCED");
        permissionmap.put("签名或系统权限：改变网络连接", "android.permission.CHANGE_NETWORK_STATE");


    }

    //根据值进行查询当前map中对应的键
    //该方法需要被外部调用，所以采用public；由于仅在本包生效，也可以使用默认的或者protected
    public String getKeyForValue(String value){
        for (Map.Entry<String,String> entry:permissionmap.entrySet()){
            if (entry.getValue().equals(value)){
                return entry.getKey();
            }
        }
        return null;
    }

}
