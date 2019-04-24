public class com.github.paolorotolo.appintro.util.LayoutUtil {
  public com.github.paolorotolo.appintro.util.LayoutUtil();
    Code:
       0: aload_0
       1: invokespecial #8                  // Method java/lang/Object."<init>":()V
       4: return

  public static boolean isRtl(android.content.res.Resources);
    Code:
       0: getstatic     #17                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        17
       5: if_icmplt     21
       8: aload_0
       9: invokevirtual #23                 // Method android/content/res/Resources.getConfiguration:()Landroid/content/res/Configuration;
      12: invokevirtual #29                 // Method android/content/res/Configuration.getLayoutDirection:()I
      15: iconst_1
      16: if_icmpne     21
      19: iconst_1
      20: ireturn
      21: iconst_0
      22: ireturn
}
