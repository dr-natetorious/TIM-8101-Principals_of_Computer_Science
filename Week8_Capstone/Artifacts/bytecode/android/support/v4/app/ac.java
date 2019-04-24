public class android.support.v4.app.ac {
  public static android.os.Bundle a(android.app.Notification);
    Code:
       0: getstatic     #20                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        19
       5: if_icmplt     13
       8: aload_0
       9: getfield      #26                 // Field android/app/Notification.extras:Landroid/os/Bundle;
      12: areturn
      13: getstatic     #20                 // Field android/os/Build$VERSION.SDK_INT:I
      16: bipush        16
      18: if_icmplt     26
      21: aload_0
      22: invokestatic  #30                 // Method android/support/v4/app/ae.a:(Landroid/app/Notification;)Landroid/os/Bundle;
      25: areturn
      26: aconst_null
      27: areturn
}
