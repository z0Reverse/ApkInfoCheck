package PermissionCheck;

import Tools.AaptGetInfo;

public class PermissionCheckInfo {
    PermissionMap map = new PermissionMap();
    public static String []permissions= AaptGetInfo.GetPermission();;

    public void PersonInformationPermission(){
        for (String permission:permissions){
          String result= map.getKeyForValue(permission);
          //System.out.println("result is:"+result);
          if (result!=null) {
              System.out.println(result + ":" + permission);
          }else{
              System.out.println("unknow permission"+permission);
          }
        }
    }




//    public void EqualsPermission(){
//        String [] permissions= AaptGetInfo.GetPermission();
//        for (String permission:permissions){
//            String result= map.getKeyForValue(permission);
//            if (result!=null){
//                System.out.println(result+":"+permission);
//            }else {
//                System.out.println("unknow permission"+permission);
//            }
//
//        }
//    }

}
