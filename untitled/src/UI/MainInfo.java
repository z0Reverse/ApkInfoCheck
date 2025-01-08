package UI;

//因为很多地方需要用到这些参数，所以需要设置成静态的。
// 确保这些参数属于类本身而不属于对象，
// 这样就避免了每次实例化一个类的对象的时候，这些对象都是独立的
public class MainInfo {
    private static String packagename;
    private static String mkdirpath;
    private static String apkpath;

    public static void setPackagename(String packagename) {
        MainInfo.packagename = packagename;
    }

    public static String getPackagename() {
        return packagename;
    }

    public static String getApkpath() {
        return apkpath;
    }

    public static void setApkpath(String apkpath) {
        MainInfo.apkpath = apkpath;
    }

    public static String getMkdirpath() {
        return mkdirpath;
    }

    public static void setMkdirpath(String mkdirpath) {
        MainInfo.mkdirpath = mkdirpath;
    }
}